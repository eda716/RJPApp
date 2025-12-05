import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MovieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("name");  
        String moviename = req.getParameter("movie");  

        req.setAttribute("name", username);  
        req.setAttribute("movie", moviename); 

        RequestDispatcher dispatcher = req.getRequestDispatcher("result");  

        dispatcher.forward(req, res);
    }
}