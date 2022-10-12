package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile DB Egitmen eklendi.");
	}
	
	

}
