package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("select p.productName from Product p")
	List<String> findproductNames();
}
