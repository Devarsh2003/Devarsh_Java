package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.User;
import com.util.electroUtil;

public class UserDao {

	public static void registerUser(User u)
	{
		Connection conn = null;
		
		try {
			
			conn = electroUtil.createConnection();
			String sql = "insert into user (fname,lname,email,password,cpassword,mobile,gender,address) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getPassword());
			pst.setString(5, u.getCpassword());
			pst.setLong(6, u.getMobile());
			pst.setString(7, u.getGender());
			pst.setString(7, u.getAddress());
			pst.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	
	
}
