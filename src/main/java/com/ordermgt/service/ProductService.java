package com.ordermgt.service;

import com.ordermgt.dao.ProductDao;
import com.ordermgt.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;
    public  Product  addNewProduct(Product product){
       return productDao.save(product);
    }

    public List<Product> getAllProducts(){
       return (List<Product>) productDao.findAll();

    }
}

