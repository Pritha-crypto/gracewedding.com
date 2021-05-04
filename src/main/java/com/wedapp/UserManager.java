package com.wedapp;

import java.util.HashMap;
import java.util.Set;

public class UserManager {

	static HashMap<String, String> userListMap = new HashMap<String, String>();

	/**
	 * This method used to sign in If the userName and passWord stored already, it
	 * gets sign in Otherwise, it will tell you have to sign up
	 * 
	 * @param userName
	 * @param passWord
	 * @return true if the user exists already
	 */
	public static boolean login(String userName, String passWord) {

		boolean validUser = false;
		boolean isUserExists = searchDetails(userName, passWord);
		if (isUserExists) {
			System.out.println("Accepted,You can Sign in!");
			validUser = true;

		} else {
			System.out.println("Invalid.You have to sign up!");
		}
		return validUser;
	}

	/**
	 * This method used to search the details of the user In case of sign up, it
	 * will check whether the username and password stored or not
	 * 
	 * @param userName
	 * @param passWord
	 * @return true if the details exists in userListMap
	 */
	public static boolean searchDetails(String userName, String passWord) {
		boolean validUserName = false;
		Set<String> keys = userListMap.keySet();
		for (String key : keys) {
			String value = userListMap.get(key);
			System.out.println(key + ":" + value);
			if (userName.equals(key) && passWord.equals(value)) {
				validUserName = true;
				break;
			}
		}

		return validUserName;
	}

	/**
	 * This method will display all the users that is stored in userListMap
	 */
	public static void displayAllUsers() {
		System.out.println("############ List All Users #########");
		Set<String> keys = userListMap.keySet();
		for (String key : keys) {
			String value = userListMap.get(key);
			System.out.println(key + ":" + value);
		}
	}

	/**
	 * This method used to store userName and passWord in userListMap while sign up
	 * 
	 * @param userName
	 * @param passWord
	 */
	public static void addUser(String userName, String passWord) {
		if (userListMap.containsKey(userName) && (userListMap.containsValue(passWord))) {

		} else {
			userListMap.put(userName, passWord);

		}
	}

	/**
	 * This method user to check status whether the given userName and passWord gets
	 * added
	 * 
	 * @param userName
	 * @param passWord
	 * @return true if userName and passWord added in userListMap.
	 */
	public static boolean addUserStatus(String userName, String passWord) {
		User add = new User();
		add.status = false;
		if (userListMap.containsKey(userName) && userListMap.containsValue(passWord)) {
			add.status = true;
		}
		return add.status;
	}

	/**
	 * This method used to delete userName and passWord in userListMap if needed
	 * 
	 * @param userName
	 * @param passWord
	 */
	public static void delUser(String userName, String passWord) {
		if (userListMap.containsKey(userName) && (userListMap.containsValue(passWord))) {
			userListMap.remove(userName);
			userListMap.remove(passWord);

		}
	}

	/**
	 * This method user to check status whether the given userName and passWord gets
	 * deleted
	 * 
	 * @param userName
	 * @param passWord
	 * @return true if userListMap not contains the given username and password
	 */
	public static boolean delUserStatus(String userName, String passWord) {
		User del = new User();
		del.status = false;
		if (userListMap.containsKey(userName) && userListMap.containsValue(passWord)) {
			del.status = false;
		} else {
			del.status = true;
		}
		return del.status;
	}

	/**
	 * This method used to update userName
	 * 
	 * @param oldUserName
	 * @param newUserName
	 * @param oldPassWord
	 */
	public static void updUserName(String oldUserName, String newUserName, String oldPassWord) {
		if (userListMap.containsKey(oldUserName)) {
			userListMap.remove(oldUserName);
			userListMap.put(newUserName, oldPassWord);

		}

	}

	/**
	 * This method will check the status whether the given newUserName gets updated
	 * 
	 * @param newUserName
	 * @return true if newUserName exists is userListMap
	 */
	public static boolean updUserNameStatus(String newUserName) {
		User updUserName = new User();
		updUserName.status = false;
		if (userListMap.containsKey(newUserName)) {
			updUserName.status = true;
		}
		return updUserName.status;
	}

	/**
	 * This method used to update userPassWord
	 * 
	 * @param oldPassWord
	 * @param newPassWord
	 * @param oldUserName
	 */
	public static void updUserPass(String oldPassWord, String newPassWord, String oldUserName) {
		boolean exists = userListMap.containsKey(oldUserName);
		if (exists && userListMap.get(oldUserName).equals(oldPassWord)) {
			userListMap.remove(oldPassWord);
			userListMap.put(oldUserName, newPassWord);
		}

	}

	/**
	 * This method will check the status whether the given newUserPassWord gets
	 * updated
	 * 
	 * @param newPassWord
	 * @return true if the newUserPassword gets updated.
	 */
	public static boolean updUserPassStatus(String oldUserName, String newPassWord) {
		User updPassWord = new User();
		updPassWord.status = false;
		boolean exists = userListMap.containsValue(newPassWord);
		if (exists && userListMap.containsKey(oldUserName)) {
			updPassWord.status = true;
		}
		return updPassWord.status;
	}

}
