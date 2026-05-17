/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.entity.Vehicles;
import za.ac.tut.entity.VehiclesFacadeLocal;

/**
 *
 * @author PC
 */
public class modifyServlet extends HttpServlet {

    @EJB VehiclesFacadeLocal vfl;
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long numPlate=Long.parseLong(request.getParameter("plate"));
        String color=request.getParameter("color");
        String name=request.getParameter("name");
        
        vfl.modify(numPlate, color, name);
        
         RequestDispatcher disp=request.getRequestDispatcher("modify_outcome.jsp");
         disp.forward(request, response);
        
    }

}
