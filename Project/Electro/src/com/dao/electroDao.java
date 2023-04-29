package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Contact;
import com.util.electroUtil;

public class electroDao {
	
	public static void insertContact(Contact c)
	{
		try {
			Connection conn = electroUtil.createConnection();
			
			String sql = "insert into contact_us(cfname,clname,cemail,csuggestion) values (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, c.getCfname());
			pst.setString(2, c.getClname());
			pst.setString(3, c.getCemail());
			pst.setString(4, c.getCsuggestion());
			pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
	}

}
