package com.tweetapp.facade;

import com.tweetapp.payload.request.TweetRequest;
import com.tweetapp.payload.response.TweetResponseList;

public interface TweetsFacade {

	public TweetResponseList getAllTweets();

	public void createTweet(TweetRequest tweetRequest);

	public void updateTweet(TweetRequest tweetRequest);

	public Boolean deleteTweet(String username, String id);

	public Boolean likeTweet(String username, String id);

}
