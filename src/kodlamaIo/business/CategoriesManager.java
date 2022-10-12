package kodlamaIo.business;



import java.util.LinkedList;

import kodlamaIo.core.logging.ILogger;
import kodlamaIo.dataAccess.ICategoryDao;
import kodlamaIo.entities.Categories;


public class CategoriesManager {
	
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	
	private LinkedList<Categories> categories = new LinkedList<>();
	

	public CategoriesManager(ICategoryDao categoryDao , ILogger[] loggers) {
		//super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		
	}
	
	public void add(Categories category) throws Exception {
		
		
		for(int i =0; i<categories.size(); i++) {
			
			if(categories.get(i).getCategoryName() == category.getCategoryName()) {
				
				throw new Exception("Kategori ismi tekrar edilemez. ");
				
			}
			
		}
		categoryDao.add(category);
		
		System.out.println("Kategori eklendi : " + category.getCategoryName());
		
		for(ILogger logger : loggers) {
			
			logger.log(category.getCategoryName());
			
		}
		
		
	}
	
	
	

}
