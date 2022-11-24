package org.teksystems.sportyshoes.sporty.shoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import org.teksystems.sportyshoes.sporty.shoes.entity.Categories;

import org.springframework.data.relational.core.mapping.Table;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {


}
