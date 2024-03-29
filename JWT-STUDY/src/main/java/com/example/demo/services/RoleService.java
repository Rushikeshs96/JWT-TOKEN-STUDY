package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired
	RoleRepository rrepo;
	

	
	public Role getRole(int id) {
	    Optional<Role> roleOptional = rrepo.findById(id);
	    return roleOptional.orElse(null); 
	}
}
