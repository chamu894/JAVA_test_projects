package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Mail;

@WebServlet(name = "X", urlPatterns = {"/X"})
public class X extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        Mail.sendMail("chamudithbandara7@gmail.com","Hello","Thank you for joining");
        
    }
}
