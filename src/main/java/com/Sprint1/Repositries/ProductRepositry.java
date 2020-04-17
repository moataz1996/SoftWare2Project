package com.Sprint1.Repositries;
import org.springframework.data.repository.CrudRepository;
import com.Sprint1.entities.Product;

public interface ProductRepositry extends CrudRepository<Product, Integer> {

}
