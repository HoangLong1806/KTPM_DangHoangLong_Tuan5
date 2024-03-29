package com.mak.redis.controller;

import com.mak.redis.entity.Product;
import com.mak.redis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product")
public class ProductController {
        @Autowired
        private ProductRepository productRepository;

        @PostMapping
        public Product save(@RequestBody Product product){
            return productRepository.save(product);
        }

        @GetMapping
        public List<Product> getAllProducts(){
            return productRepository.findAll();
        }

        @GetMapping("/{id}")
        public Product findProduct(@PathVariable int id){
            return productRepository.findProductById(id);
        }
        @DeleteMapping("/{id}")
        public String removeProduct(@PathVariable int id){
            return productRepository.deleteProduct(id);
        }
}
