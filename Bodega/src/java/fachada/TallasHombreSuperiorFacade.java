/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import Modelo.TallasHombreSuperior;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexis-PC
 */
@Stateless
public class TallasHombreSuperiorFacade extends AbstractFacade<TallasHombreSuperior> {

    @PersistenceContext(unitName = "BodegaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TallasHombreSuperiorFacade() {
        super(TallasHombreSuperior.class);
    }
    
}
