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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("FinalNum","Result: ---");
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                    .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNum = request.getParameter("first");
        String secondNum = request.getParameter("second");
        String operator = request.getParameter("calc");
        try {
        int x = Integer.parseInt(firstNum);
        int y = Integer.parseInt(secondNum);
        if(operator.equals("+")){
           int z = x+y;
           request.setAttribute("FinalNum","Result: " + z);
        }
        else if(operator.equals("-")){
           int z = x-y;
           request.setAttribute("FinalNum","Result: " + z);
        }
        else if(operator.equals("*")){
           int z = x*y;
           request.setAttribute("FinalNum","Result: " + z);
        }
        else if(operator.equals("%")){
           int z = x%y;
           request.setAttribute("FinalNum","Result: " + z);
        }
        
        }
        catch(NumberFormatException e) {
        request.setAttribute("FinalNum","Result: invalid");
        }
    
                    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
