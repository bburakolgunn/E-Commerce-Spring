package com.olguncompany.restcontrollers;

import com.olguncompany.entities.Basket;
import com.olguncompany.entities.Customer;
import com.olguncompany.services.BasketService;
import com.olguncompany.services.UserDetailService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
@RequestMapping("/basket")
public class BasketRestController {
    final BasketService basketService;
    final UserDetailService userDetailService;
    final HttpSession httpSession;
    public BasketRestController(BasketService basketService, UserDetailService userDetailService, HttpSession httpSession) {
        this.basketService = basketService;
        this.userDetailService = userDetailService;
        this.httpSession = httpSession;
    }
    @PostMapping("/save")
    public ResponseEntity save(@Valid @RequestBody Basket basket){
        return basketService.save(basket);
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        return basketService.list();
    }

    @PutMapping("/update")
    public ResponseEntity update(@Valid @RequestBody Basket basket){
        return basketService.update(basket);
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id){
         return  basketService.delete(id);
    }

    @GetMapping("/MyOrders")
    public ResponseEntity MyOrders(){
        Customer customer= (Customer) httpSession.getAttribute("customer");
        return basketService.customerBasket(customer.getEmail());
    }


}
