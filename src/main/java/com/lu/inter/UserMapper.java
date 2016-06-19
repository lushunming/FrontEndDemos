package com.lu.inter;

import java.util.List;
import java.util.Map;

import com.lu.domain.Article;
import com.lu.domain.User;

public interface UserMapper {

	/**
	 * 根据id获取用户
	 * 
	 * @param id
	 *            用户id
	 * @return 用户对象
	 */
	public User selectUserByID(Integer id);

	/**
	 * 根据用户名来获取userlist
	 * 
	 * @param userName
	 *            用户名
	 * @return list
	 */
	public List<Map<String, Object>> selectUsers(String userName);

	/**
	 * 插入一个user
	 * 
	 * @param user
	 *
	 */
	public void addUser(User user);

	/**
	 * 更新
	 * 
	 * @param user
	 *
	 */
	public void updateUser(User user);

	/**
	 * 更新
	 * 
	 * @param user
	 *
	 */
	public void deleteUser(Integer id);

	/**
	 * 根据id获取用户的文章
	 * 
	 * @param id
	 */
	public List<Article> getUserArticles(Integer id);

}
