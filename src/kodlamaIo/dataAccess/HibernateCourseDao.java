package kodlamaIo.dataAccess;

import kodlamaIo.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile DB ye Kurs eklendi.");
	}
	
	

}
