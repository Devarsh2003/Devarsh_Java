package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Product;
import com.util.electroUtil;

public class ProductDao {
	
	public static void addProduct(Product p) {
		
		try {
			
			Connection conn = electroUtil.createConnection();
			String sql = "insert into product(uid,prod_category,prod_model,prod_desc,prod_img,prod_price,prod_name) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getUid());
			pst.setString(2, p.getProg_category());
			pst.setString(3, p.getProd_model());
			pst.setString(4, p.getProd_desc());
			pst.setString(5, p.getProd_img());
			pst.setInt(6, p.getProd_price());
			pst.setString(7, p.getProd_name());
			pst.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
}
