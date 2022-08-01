package com.tweetapp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tweetapp.dao.UsersDao;
import com.tweetapp.domain.Users;
import com.tweetapp.payload.response.UsersResponse;
import com.tweetapp.payload.response.UsersResponseList;
import com.tweetapp.service.UserServices;

@Component
public class UserServicesImpl implements UserServices {

	private static final Logger LOG = LoggerFactory.getLogger(UserServicesImpl.class);

	@Autowired
	UsersDao userDao;

	@Override
	public UsersResponseList getAllUsers() {
		List<Users> users = userDao.getAllUsers();
		UsersResponseList usersResponseList = new UsersResponseList();
		List<UsersResponse> usersResponses = new ArrayList<>();
		users.forEach(user -> {
			UsersResponse usersResponse = new UsersResponse();
			usersResponse.setId(user.getId());
			usersResponse.setName(user.getFirstName() + " " + user.getLastName());
			usersResponse.setUsername(user.getUsername());
			usersResponses.add(usersResponse);
			user.getTweets().forEach(tweet -> {
				LOG.info(tweet.getTweetMessage());
			});
		});
		usersResponseList.setUsersList(usersResponses);
		return usersResponseList;
	}

	@Override
	public UsersResponseList searchByUsername(String username) {
		List<Users> users = userDao.searchByUsername(username);
		UsersResponseList usersResponseList = new UsersResponseList();
		List<UsersResponse> usersResponses = new ArrayList<>();
		users.forEach(user -> {
			UsersResponse usersResponse = new UsersResponse();
			usersResponse.setId(user.getId());
			usersResponse.setName(user.getFirstName() + " " + user.getLastName());
			usersResponse.setUsername(user.getUsername());
			usersResponses.add(usersResponse);
		});
		usersResponseList.setUsersList(usersResponses);
		return usersResponseList;
	}

}
