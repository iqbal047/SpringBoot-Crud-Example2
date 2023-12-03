package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List <Product> addProducts(@RequestBody List <Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllproducts(){
        return service.getProducts();
    }

    @GetMapping("product/{id}")
    public Product findProductById(int id){
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(String name){
        return service.getProductByName(name);
    }
}
