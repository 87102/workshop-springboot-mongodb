package com.davidmarcelino.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.davidmarcelino.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {


}


