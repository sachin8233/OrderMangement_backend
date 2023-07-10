package com.ordermgt.dao;

import com.ordermgt.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductDao extends CrudRepository<Product,Integer> {

}
