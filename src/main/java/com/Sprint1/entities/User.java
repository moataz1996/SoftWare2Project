package com.Sprint1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.Sprint1.entities.User;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public String username;
	public String password;
	public String type;
	public User()
	{
		username="";
		type="";
		password="";
	}

	public User(String username,String password,String type)
	{
		this.password=password;
		this.username=username;
		this.type=type;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername()
	{
		return username;
	}
	public String getType()
	{
		return type;
	}
	public String getPassword()
	{
		return password;
	}
	public boolean addUser(User user)
	{
		return true;
	}
	

}
