package kodlamaIo.entities;

public class Categories {
	
	private int CategoryId;
	private String CategoryName;
	
	
	public Categories(int categoryId, String categoryName) {
		super();
		CategoryId = categoryId;
		CategoryName = categoryName;
	}
	
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	

}
