package com.Sprint1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.Sprint1.entities.Store;

@Entity
public class Store {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	

}
