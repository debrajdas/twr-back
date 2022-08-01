package com.tweetapp.facadeImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tweetapp.facade.TweetsFacade;
import com.tweetapp.payload.request.TweetRequest;
import com.tweetapp.payload.response.TweetResponseList;
import com.tweetapp.service.TweetServices;

@Component
public class TweetsFacadeImpl implements TweetsFacade {

	@Autowired
	TweetServices tweetServices;

	@Override
	public void createTweet(TweetRequest tweetRequest) {
		tweetServices.createTweet(tweetRequest);
	}

	@Override
	public void updateTweet(TweetRequest tweetRequest) {
		tweetServices.updateTweet(tweetRequest);
	}

	@Override
	public TweetResponseList getAllTweets() {
		return tweetServices.getAllTweets();
	}

	@Override
	public Boolean deleteTweet(String username, String id) {
		return tweetServices.deleteTweet(username, id);
	}

	@Override
	public Boolean likeTweet(String username, String id) {
		return tweetServices.likeTweet(username, id);
	}
}
