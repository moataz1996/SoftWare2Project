package com.Sprint1.Repositries;
import org.springframework.data.repository.CrudRepository;
import com.Sprint1.entities.User;

public interface UserRepositry extends CrudRepository<User, Integer> {

}
