package com.tweetapp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.tweetapp.domain.Users;

public interface UserRepository extends MongoRepository<Users, ObjectId> {

}
