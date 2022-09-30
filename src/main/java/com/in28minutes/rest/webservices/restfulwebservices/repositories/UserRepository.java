package com.in28minutes.rest.webservices.restfulwebservices.repositories;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
