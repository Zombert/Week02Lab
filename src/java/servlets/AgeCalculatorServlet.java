/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bmxde
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                    .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newAge = request.getParameter("age");
        
        try {
        int x = Integer.parseInt(newAge);
        x++;
        request.setAttribute("x","Your age next birthday " + x);
        }
        catch(NumberFormatException e) {
        request.setAttribute("x", "Please enter a valid age");
        }
        
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                    .forward(request, response);
    }
        
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
