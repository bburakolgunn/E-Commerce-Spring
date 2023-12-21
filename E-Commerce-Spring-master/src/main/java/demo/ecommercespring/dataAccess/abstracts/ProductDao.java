package demo.ecommercespring.dataAccess.abstracts;

import demo.ecommercespring.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
