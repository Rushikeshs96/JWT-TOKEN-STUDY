package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int login_id;
	
	String uid;
	String pwd;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	Role role_id;
}
