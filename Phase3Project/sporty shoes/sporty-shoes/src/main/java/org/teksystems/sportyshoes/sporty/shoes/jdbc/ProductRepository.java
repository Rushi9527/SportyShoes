package org.teksystems.sportyshoes.sporty.shoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.mapping.Table;

import org.teksystems.sportyshoes.sporty.shoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
