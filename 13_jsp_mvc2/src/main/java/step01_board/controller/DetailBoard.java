package step01_board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step01_board.dao.BoardDAO;
import step01_board.dto.BoardDTO;

@WebServlet("/bDetail")
public class DetailBoard extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 주는 건 받자
		long boardId =  Long.parseLong(request.getParameter("boardId"));
		
		// db에서 가져오기
		//BoardDAO.getInstance().getBoardDetail(Long.parseLong(request.getParameter("boardId")));
		BoardDTO boardDTO = BoardDAO.getInstance().getBoardDetail(boardId);
		
		// 화면으로 보내기
		request.setAttribute("boardDTO", boardDTO);
		//request.setAttribute("boardDTO", BoardDAO.getInstance().getBoardDetail(boardId));
		
		RequestDispatcher dis = request.getRequestDispatcher("step01_boardEx/bDetail.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
