package demo.ecommercespring.business.concretes;

import demo.ecommercespring.business.abstracts.ProductService;
import demo.ecommercespring.core.utilities.results.DataResult;
import demo.ecommercespring.core.utilities.results.Result;
import demo.ecommercespring.core.utilities.results.SuccessDataResult;
import demo.ecommercespring.core.utilities.results.SuccessResult;
import demo.ecommercespring.dataAccess.abstracts.ProductDao;
import demo.ecommercespring.entities.concretes.Product;

import demo.ecommercespring.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

        return new SuccessDataResult<List<Product>>
                (this.productDao.findAll(),"Data Listelendi");

    }

    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1,pageSize);
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
    }

    @Override
    public DataResult<List<Product>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.ASC,"productName");
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort),"Başarılı");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün Eklendi");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>
                (this.productDao.getByProductName(productName),"Data listelendi");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        //business codes

        return new SuccessDataResult<Product>
                (this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByCategoryIn(categories),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByProductNameContains(productName),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByProductNameStartsWith(productName),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>
                (this.productDao.getByNameAndCategory(productName,categoryId),"Data listelendi");
    }

    @Override
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return new SuccessDataResult<List<ProductWithCategoryDto>>
                (this.productDao.getProductWithCategoryDetails(),"Data Listelendi");
    }

}


