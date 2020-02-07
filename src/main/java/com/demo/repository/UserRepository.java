package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.repository.domain.Users;

/***
 * instancia los componenete del crud
 * 
 * */

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

}
