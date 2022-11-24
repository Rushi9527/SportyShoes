package org.teksystems.sportyshoes.sporty.shoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teksystems.sportyshoes.sporty.shoes.entity.UserDetails;
import org.teksystems.sportyshoes.sporty.shoes.jdbc.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	UserDetailsRepository userRepo;
	
	
	
	
	public List<UserDetails> listAll()
	{
		return userRepo.findAll();
	}
	
	public List<UserDetails> get(String username) {
		return userRepo.findByusername(username);
	}



}
