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
public class addServlet extends HttpServlet {

    @EJB VehiclesFacadeLocal vfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Long numPlate=Long.parseLong(request.getParameter("plate"));
       Integer price=Integer.parseInt(request.getParameter("price"));
       String name=request.getParameter("name");
       String color=request.getParameter("color");
       String type=request.getParameter("type");
       
       Vehicles car=CreateVehicles(numPlate,price,name,color,type);
       vfl.create(car);
       
        RequestDispatcher disp=request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
    }

    private Vehicles CreateVehicles(Long numPlate, Integer price, String name, String color, String type) {
        Vehicles vh=new Vehicles();
        vh.setColor(color);
        vh.setId(numPlate);
        vh.setName(name);
        vh.setPrice(price);
        vh.setType(type);
        
        return vh;
    }

}
