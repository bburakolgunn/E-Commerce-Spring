package demo.ecommercespring.dataAccess.abstracts;

import demo.ecommercespring.entities.concretes.Product;
import demo.ecommercespring.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {

    Product getByProductName(String productName);

    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    List<Product> getByCategoryIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);
    @Query("Select new demo.ecommercespring.entities.dtos.ProductWithCategoryDto" +
            "(p.id, p.productName, c.categoryName) from Category c inner join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();

}


