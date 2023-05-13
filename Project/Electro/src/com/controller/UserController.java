package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.SendResult;

import com.bean.User;
import com.dao.UserDao;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("register")) {

			boolean flag = UserDao.checkEmail(request.getParameter("email"));

			if (flag == true) {
				request.setAttribute("msg", "Email-id already registered !!!");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			} else if (request.getParameter("password").equals(request.getParameter("cpassword"))) {
				User u = new User();
				u.setFname(request.getParameter("fname"));
				u.setLname(request.getParameter("lname"));
				u.setEmail(request.getParameter("email"));
				u.setPassword(request.getParameter("password"));
				u.setCpassword(request.getParameter("cpassword"));
				u.setMobile(Long.parseLong(request.getParameter("mobile")));
				u.setGender(request.getParameter("gender"));
				u.setAddress(request.getParameter("address"));
				UserDao.registerUser(u);
				request.setAttribute("msg", "Registration is successful !!!");
				request.getRequestDispatcher("register.jsp").forward(request, response);
				// response.sendRedirect("register.jsp");
			} else {
				request.setAttribute("msg", "Password and Confirm Password doesn't match ");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		
		
		else if (action.equalsIgnoreCase("Login")) {

			User u = UserDao.checkLogin(request.getParameter("email"), request.getParameter("password"));    
			
			if(u==null)
			{
				request.setAttribute("msg", "Invalid Email-id or password ");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				HttpSession session = request.getSession();
				session.setAttribute("u", u);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("Change Password")) {
			
			HttpSession session = request.getSession();
			User u = (User)session.getAttribute("u");
			
			if(u.getPassword().equals(request.getParameter("oldpassword")))
			{
				if(request.getParameter("newpassword").equals(request.getParameter("cnewpassword")))
				{
				
					UserDao.changePassword(u.getEmail(), request.getParameter("newpassword"));
					response.sendRedirect("logout.jsp");
				}
				else
				{
					request.setAttribute("msg", "New Password and Confirm Password doesn't match ");
					request.getRequestDispatcher("changepassword.jsp").forward(request, response);;
					
				}
				
			}
			else
			{
				request.setAttribute("msg", "Old Password is incorrect !!!");
				request.getRequestDispatcher("changepassword.jsp").forward(request, response);
			}
			
		}
		
		
	}

}
