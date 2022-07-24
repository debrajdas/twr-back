package com.tweetapp.domain;

import java.util.Date;

import org.bson.types.ObjectId;

public class TweetReply {

	private ObjectId id;
	private String replyMessage;
	private Tweets tweets;

	private Date createdAt;
	private String createdBy;
	private Date modifiedAt;
	private String mdifiedBy;

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

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the modifiedAt
	 */
	public Date getModifiedAt() {
		return modifiedAt;
	}

	/**
	 * @param modifiedAt the modifiedAt to set
	 */
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	/**
	 * @return the mdifiedBy
	 */
	public String getMdifiedBy() {
		return mdifiedBy;
	}

	/**
	 * @param mdifiedBy the mdifiedBy to set
	 */
	public void setMdifiedBy(String mdifiedBy) {
		this.mdifiedBy = mdifiedBy;
	}

}
