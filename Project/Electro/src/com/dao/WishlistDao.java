package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Wishlist;
import com.util.electroUtil;

public class WishlistDao {
	
	public static void addtoWishlist(WishlistDao w)
	{
		try {
			Connection conn = electroUtil.createConnection();
			String sql = "insert into wishlist(pid,uid) values (?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getPid());
			pst.setInt(2, w.getUid());
			pst.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<WishlistDao> getWishListByUser(int uid)
	{
		List<WishlistDao> list = new ArrayList<WishlistDao>();
		try {
			Connection conn = electroUtil.createConnection();
			String sql = "select * from wishlist where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				WishlistDao w = new WishlistDao();
				w.setWid(rs.getInt("wid"));
				w.setPid(rs.getInt("pid"));
				w.setUid(rs.getInt("uid"));
				list.add(w);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public static boolean checkWishList(int uid,int pid)
	{
		boolean flag = false;
		try {
			Connection conn = electroUtil.createConnection();
			String sql = "select * from wishlist where uid=? and pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				flag = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public static void removeWishlist(WishlistDao w)
	{
		try {
			Connection conn = electroUtil.createConnection();
			String sql = "delete from wishlist where pid=? and uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getPid());
			pst.setInt(2, w.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}