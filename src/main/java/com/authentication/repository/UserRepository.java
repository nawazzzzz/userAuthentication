package com.authentication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.authentication.model.entities.User;

public interface UserRepository extends JpaRepository<User,String>{
}
