package controller;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class StudentController extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)
           throws IOException, ServletException{

    }
}
