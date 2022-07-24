package com.tweetapp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.tweetapp.domain.TweetReply;

public interface TweetReplyRepository extends MongoRepository<TweetReply, ObjectId> {

}
