package step9_04.student;

import java.util.Map;

// DAO : Database Access Object
// DB접근 로직
public class StudentDAO {
	
	public void insert(StudentVO st) {
//		System.out.println(st.getId());
		StudentRepository.getStDB().put(st.getId(), st);
	}
	
	public StudentVO select(String id) {
		return StudentRepository.getStDB().get(id);
	}
	
	public Map<String , StudentVO> getStudentDB(){
		return StudentRepository.getStDB();
	}

}
