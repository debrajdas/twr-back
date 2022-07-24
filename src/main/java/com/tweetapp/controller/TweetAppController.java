package com.tweetapp.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetapp.service.TweetAppService;
import com.tweetapp.to.TweetsTo;
import com.tweetapp.to.UsersTo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class TweetAppController {

	@Autowired
	TweetAppService tweetAppService;

	@PostMapping("/register")
	public void createUser(@RequestBody UsersTo usersTo) {
		tweetAppService.saveUser(usersTo);
	}

	@GetMapping("all")
	public void getAllTweets() {

	}

	@GetMapping("users/all")
	public List<UsersTo> getAllUsers() {
		return tweetAppService.getAllUser();
	}

	@GetMapping("user/search/username")
	public void searchUserByUserName() {

	}

	@PostMapping("/username")
	public void getAllTweetFromUser() {

	}

	@PostMapping("/add")
	public void addTweet(@RequestBody TweetsTo tweetsTo) {

	}

	@PutMapping("/update/{id}")
	public void updateTweet(@PathVariable ObjectId id) {

	}

	@DeleteMapping("/delete/{id}")
	public void deleteTweet(@PathVariable ObjectId id) {

	}

	@PutMapping("/like/{id}")
	public void likeTweet(@PathVariable ObjectId id) {

	}

	@PostMapping("/reply/{id}")
	public void replyOnTweet() {

	}

}
