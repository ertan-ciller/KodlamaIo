package kodlamaIo.dataAccess;

import kodlamaIo.entities.Categories;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Categories category) {
		
		System.out.println("Hibernate ile DB ye Category eklendi.");
		
	}
	
	

}
