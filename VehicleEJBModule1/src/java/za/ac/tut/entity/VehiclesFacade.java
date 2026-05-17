/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entity;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
@Stateless
public class VehiclesFacade extends AbstractFacade<Vehicles> implements VehiclesFacadeLocal {

    @PersistenceContext(unitName = "VehicleEJBModule1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiclesFacade() {
        super(Vehicles.class);
    }
    
    @RolesAllowed("manager")
      @Override
    public void modify(Long id, String color, String name) {
        String queryStr="UPDATE Vehicles v SET v.color = :tcolor , v.name = :tname WHERE v.id= :plate";
        Query query=em.createQuery(queryStr);
        query.setParameter("tcolor", color);
        query.setParameter("tname", name);
        query.setParameter("plate", id);
        query.executeUpdate();
        
        em.clear();
    }
    
    @RolesAllowed("manager")
    @Override
    public void delete(Long id) {
        String queryStr="DELETE FROM Vehicles v WHERE v.id = :plate";
        Query query=em.createQuery(queryStr);
        query.setParameter("plate", id);
        query.executeUpdate();
        
        em.clear();
    }
    
    @RolesAllowed("buyer")
    @Override
    public Vehicles search(Long id) {
        String queryStr="SELECT v FROM Vehicles v WHERE v.id = :plate";
        Query query=em.createQuery(queryStr);
        query.setParameter("plate", id);
        Vehicles car=(Vehicles)query.getSingleResult();
        return car;
    }
    
    @RolesAllowed("buyer")
    @Override
    public Vehicles expensiveVehicle() {
        String queryStr="SELECT v FROM Vehicles v WHERE v.price =(SELECT MAX(v.price) FROM Vehicles v)";
        Query query=em.createQuery(queryStr);
        Vehicles car=(Vehicles)query.getSingleResult();
        return car;
    }
}
