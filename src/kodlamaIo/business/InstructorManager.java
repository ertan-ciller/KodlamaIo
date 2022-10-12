package kodlamaIo.business;

import kodlamaIo.core.logging.ILogger;
import kodlamaIo.dataAccess.IInstructorDao;
import kodlamaIo.entities.Instructor;


public class InstructorManager {
	

	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	

	public InstructorManager(IInstructorDao instructorDao , ILogger[] loggers) {
		//super();
		this.instructorDao = instructorDao;
		this.loggers=loggers;
		
	}
	
	public void add(Instructor instructor) {
		
		System.out.println("Egitmen Eklendi. : " + instructor.getName());
		instructorDao.add(instructor);
		for(ILogger logger : loggers) {
			
			logger.log(instructor.getName());
			
			
		}
		
		
		
	}
	

}
