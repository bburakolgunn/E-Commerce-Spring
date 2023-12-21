package demo.ecommercespring.business.concretes;

import demo.ecommercespring.business.abstracts.ProductService;
import demo.ecommercespring.core.utilities.results.DataResult;
import demo.ecommercespring.core.utilities.results.Result;
import demo.ecommercespring.core.utilities.results.SuccessDataResult;
import demo.ecommercespring.core.utilities.results.SuccessResult;
import demo.ecommercespring.dataAccess.abstracts.ProductDao;
import demo.ecommercespring.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductManager implements ProductService {


    private ProductDao productDao;



    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }



    @Override
    public DataResult<List<Product>> getAll() {

        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");

    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün Eklendi");
    }

}
