package com.tweetapp.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.domain.Tweets;
import com.tweetapp.domain.Users;
import com.tweetapp.repository.TweetsRepository;
import com.tweetapp.repository.UserRepository;
import com.tweetapp.service.TweetAppService;
import com.tweetapp.to.TweetsTo;
import com.tweetapp.to.UsersTo;

@Service
public class TweetAppServiceImpl implements TweetAppService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TweetAppService.class);

	@Autowired
	UserRepository userRepository;

	@Autowired
	TweetsRepository tweetsRepository;

	public void saveUser(UsersTo usersTo) {
		Users users = new Users();
		users.setFirstName(usersTo.getFirstName());
		users.setLastName(usersTo.getLastName());
		users.setEmail(usersTo.getEmail());
		users.setLoginId(usersTo.getLoginId());
		users.setPassword(usersTo.getPassword());
		users.setContactNumber(usersTo.getContactNumber());

		users.setCreatedAt(new Date());

		Users savedUsers = userRepository.save(users);
		if (savedUsers.getId() != null) {
			LOGGER.info(savedUsers.getId().toString());
		}
	}

	public List<UsersTo> getAllUser() {
		List<UsersTo> resultUsersList = new ArrayList<UsersTo>();

		List<Users> allUsers = userRepository.findAll();
		if (!allUsers.isEmpty()) {
			allUsers.forEach(ud -> {
				UsersTo usersTo = new UsersTo();
				usersTo.setId(ud.getId());
				usersTo.setFirstName(ud.getFirstName());
				usersTo.setLastName(ud.getLastName());
				usersTo.setEmail(ud.getEmail());
				usersTo.setLoginId(ud.getLoginId());
//				usersTo.setPassword(ud.getPassword());
				usersTo.setContactNumber(ud.getContactNumber());

				resultUsersList.add(usersTo);
			});
		}
		return resultUsersList;
	}

	public List<TweetsTo> getAllTweets() {
		List<TweetsTo> resultTweetList = new ArrayList<TweetsTo>();

		List<Tweets> allTweets = tweetsRepository.findAll();

		if (!allTweets.isEmpty()) {
			allTweets.forEach(td -> {

			});
		}

		return resultTweetList;
	}
}
