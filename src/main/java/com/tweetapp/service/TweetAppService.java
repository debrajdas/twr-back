package com.tweetapp.service;

import java.util.List;

import com.tweetapp.to.TweetsTo;
import com.tweetapp.to.UsersTo;

public interface TweetAppService {

	public void saveUser(UsersTo usersTo);

	public List<UsersTo> getAllUser();

	public List<TweetsTo> getAllTweets();
}
