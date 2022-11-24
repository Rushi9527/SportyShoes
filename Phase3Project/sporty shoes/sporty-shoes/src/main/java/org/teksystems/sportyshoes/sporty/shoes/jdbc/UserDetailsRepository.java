package org.teksystems.sportyshoes.sporty.shoes.jdbc;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.teksystems.sportyshoes.sporty.shoes.entity.UserDetails;
 import org.springframework.data.relational.core.mapping.Table;



@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	

	public List<UserDetails> findByusername(String username);
}

