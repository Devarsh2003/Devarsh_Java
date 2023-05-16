<%
	session.getAttribute("u");
	session.invalidate();
	request.setAttribute("msg", "Password changed Successfully !!!");
	//response.sendRedirect("login.jsp");
	request.getRequestDispatcher("login.jsp").forward(request, response);
%>