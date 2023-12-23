package demo.ecommercespring.entities.dtos;

public class ProductWithCategoryDto {

    private int id;

    private String productName;


    private String CategoryName;

    public ProductWithCategoryDto(){

    }

    public ProductWithCategoryDto(int id, String productName, String categoryName) {
        this.id = id;
        this.productName = productName;
        CategoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
