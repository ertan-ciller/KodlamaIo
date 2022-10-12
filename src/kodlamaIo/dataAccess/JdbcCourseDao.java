package kodlamaIo.dataAccess;

import kodlamaIo.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile Course DB ye eklendi.");
	}
	
	
	

}
