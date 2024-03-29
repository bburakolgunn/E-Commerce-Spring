package com.olguncompany.restcontrollers;

import com.olguncompany.entities.Category;
import com.olguncompany.entities.CreditCard;
import com.olguncompany.services.CredidCardService;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/creditcard")
public class CreditCartRestController {

    final CredidCardService credidCardService;


    public CreditCartRestController(CredidCardService credidCardService) {
        this.credidCardService = credidCardService;
    }
    @PostMapping("/save")
    public ResponseEntity save(@Valid @RequestBody CreditCard card){
        return credidCardService.save(card);
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        return credidCardService.list();
    }
    @PutMapping("/update")
    public ResponseEntity update(@Valid @RequestBody CreditCard card){
        return credidCardService.update(card);
    }
    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id){
        return credidCardService.delete(id);
    }



}
