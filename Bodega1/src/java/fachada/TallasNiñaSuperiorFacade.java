/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.TallasNiñaSuperior;

/**
 *
 * @author Alexis-PC
 */
@Stateless
public class TallasNiñaSuperiorFacade extends AbstractFacade<TallasNiñaSuperior> {

    @PersistenceContext(unitName = "Bodega1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TallasNiñaSuperiorFacade() {
        super(TallasNiñaSuperior.class);
    }
    
}
