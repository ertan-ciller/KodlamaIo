package kodlamaIo.dataAccess;

import kodlamaIo.entities.Categories;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Categories category) {
		// TODO Auto-generated method stub
		
		System.out.println("JDBC ile DB ye Category eklendi.");
		
	}
	
	

}
