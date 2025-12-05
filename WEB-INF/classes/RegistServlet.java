import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("name");  
        String favoriteanime = req.getParameter("anime");  

        req.setAttribute("name", username);
        req.setAttribute("anime", favoriteanime); 

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("output"); 

        dispatcher.forward(req, res);
    }
}