package com.tweetapp.to;

import org.bson.types.ObjectId;

import com.tweetapp.domain.Tweets;

public class TweetReplyTo {
	private ObjectId id;
	private String replyMessage;
	private Tweets tweets;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the replyMessage
	 */
	public String getReplyMessage() {
		return replyMessage;
	}

	/**
	 * @param replyMessage the replyMessage to set
	 */
	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}

	/**
	 * @return the tweets
	 */
	public Tweets getTweets() {
		return tweets;
	}

	/**
	 * @param tweets the tweets to set
	 */
	public void setTweets(Tweets tweets) {
		this.tweets = tweets;
	}

}
