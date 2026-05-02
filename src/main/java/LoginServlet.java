package com.login;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body style='font-family:Arial;'>");
        out.println("<h2 style='text-align:center;'>Login Result</h2>");

        out.println("<table border='1' align='center' cellpadding='10'>");

        if ("admin".equals(username) && "admin123".equals(password)) {
            out.println("<tr><th>Status</th><td style='color:green;'>Login Successful</td></tr>");
        } else {
            out.println("<tr><th>Status</th><td style='color:red;'>Invalid Credentials</td></tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
