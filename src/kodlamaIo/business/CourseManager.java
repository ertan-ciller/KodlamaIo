package kodlamaIo.business;

import java.util.LinkedList;

import kodlamaIo.core.logging.ILogger;
import kodlamaIo.dataAccess.ICourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	
	private ICourseDao courseDao;
	private ILogger[] loggers;

	private LinkedList<Course> courses = new LinkedList<>(); 
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
		
	}
	
	public void add(Course course) throws Exception{
		
		
		for(int i = 0; i<courses.size(); i++) {
			
			if(courses.get(i).getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edilemez");
			}
			
		}
		
		courses.add(course);
		
		if(course.getCoursePrice() > 0) {
			System.out.println("Kurs Alindi : " + course.getCourseName());
			courseDao.add(course);
			
			for(ILogger logger : loggers) {
				logger.log(course.getCourseName());
				
				
			}
			
		}
		
		else {
			throw new Exception("Kurs fiyati 0 dan kucuk olamaz.");
			
		}
		
		

		
	}
	

}
