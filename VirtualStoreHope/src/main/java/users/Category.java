package users;

public class Category {

    private int idCategory;
    private String categoryName;

    private String estate;

    public Category (){

    }

    public Category(int idCategory, String categoryName, String estate) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
        this.estate = estate;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        this.estate = estate;
    }
}
