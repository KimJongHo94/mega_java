package _09_file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private final String FILE_REPOSITORY_PATH = FileConfig.FILE_REPOSITORY_PATH;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String saveDirectory = "C:\\Users\\joh96\\git\\mega_java\\12_jsp_basic\\src\\main\\webapp\\chapter09_file\\fileRepository\\";
		
		// 수정될 파일 업로드
		MultipartRequest multipartRequest = new MultipartRequest(request, FILE_REPOSITORY_PATH, 1024 * 1024 * 100, "utf-8");
		
		String deleteFileName = multipartRequest.getParameter("deleteFileName");
		
		// 기존 파일 삭제
		new File(FILE_REPOSITORY_PATH + deleteFileName).delete();
			
		
		
		String jsScript = """
					<script>
						alert('파일이 수정되었습니다.');
						location.href = "fileMain";
					</script>""";
		

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jsScript);
	
	}

}
