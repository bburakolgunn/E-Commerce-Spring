package demo.ecommercespring.business.abstracts;

import demo.ecommercespring.core.utilities.results.DataResult;
import demo.ecommercespring.core.utilities.results.Result;
import demo.ecommercespring.entities.concretes.Product;

import java.util.List;

public interface ProductService {

       DataResult<List<Product>>  getAll();

       Result add(Product product);


}
