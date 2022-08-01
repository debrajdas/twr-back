package com.tweetapp.util;

public class TweetAppUtil {

	public static Integer convertStringToInteger(String str) {
		if (!str.isEmpty() && !str.isBlank()) {
			return Integer.parseInt(str);
		}
		return null;
	}

}
