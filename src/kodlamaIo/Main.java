package kodlamaIo;


import kodlamaIo.business.CategoriesManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.InstructorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.EmailLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.ILogger;

import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.dataAccess.HibernateInstructorDao;
import kodlamaIo.dataAccess.JdbcCategoryDao;
import kodlamaIo.dataAccess.JdbcCourseDao;
import kodlamaIo.entities.Categories;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Course course = new Course(1,"Java",15); //kurs ve kategory ismi tekrar edemez ? 
		Course course2 = new Course(2,"JS",300);
		
		Categories category = new Categories(1,"OOP");
		Categories category2 = new Categories(1, "OOP");
		
		Instructor instructor = new Instructor(4,"Engin");
		
		ILogger[] logger = {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
		//Course[] courses = 


		
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),logger);
		courseManager.add(course);
		courseManager.add(course2);
		System.out.println("************************************");

		System.out.println("deneme 2");
		System.out.println("Nazlıcanı seviyorum :) ");
		
		CategoriesManager categoryManager = new CategoriesManager(new JdbcCategoryDao(),logger);
		categoryManager.add(category);
		categoryManager.add(category2);
		
		System.out.println("************************************");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),logger);
		instructorManager.add(instructor);
		
		

	}

}
