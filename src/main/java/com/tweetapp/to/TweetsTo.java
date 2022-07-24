package com.tweetapp.to;

import org.bson.types.ObjectId;

import com.tweetapp.domain.Users;

public class TweetsTo {
	private ObjectId id;
	private String tweetMessage;
	private Users users;

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
	 * @return the tweetMessage
	 */
	public String getTweetMessage() {
		return tweetMessage;
	}

	/**
	 * @param tweetMessage the tweetMessage to set
	 */
	public void setTweetMessage(String tweetMessage) {
		this.tweetMessage = tweetMessage;
	}

	/**
	 * @return the users
	 */
	public Users getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Users users) {
		this.users = users;
	}

}
