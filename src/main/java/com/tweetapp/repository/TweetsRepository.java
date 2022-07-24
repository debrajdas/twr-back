package com.tweetapp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.tweetapp.domain.Tweets;

public interface TweetsRepository extends MongoRepository<Tweets, ObjectId> {

}
