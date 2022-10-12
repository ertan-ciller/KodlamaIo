package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("JDBC ile DB ye Egitmen eklendi.");
	}
	

}
