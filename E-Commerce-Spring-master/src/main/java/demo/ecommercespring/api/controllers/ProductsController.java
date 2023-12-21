package demo.ecommercespring.api.controllers;

import demo.ecommercespring.business.abstracts.ProductService;
import demo.ecommercespring.core.utilities.results.DataResult;
import demo.ecommercespring.core.utilities.results.Result;
import demo.ecommercespring.entities.concretes.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;


    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }


    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }

}
