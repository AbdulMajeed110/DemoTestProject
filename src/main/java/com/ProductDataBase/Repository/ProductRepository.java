package com.ProductDataBase.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ProductDataBase.Entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository <ProductEntity, Integer> {

}
