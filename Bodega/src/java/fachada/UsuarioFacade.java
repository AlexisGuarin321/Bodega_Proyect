/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import Modelo.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alexis-PC
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "BodegaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario validarUsuario(int idUsuario, String password) {
        Usuario aux = null;
        try {
            Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.idUsuario = ?1 AND u.password=?2", Usuario.class).setParameter(1, idUsuario).setParameter(2, password);
            aux = (Usuario) q.getSingleResult();
        } catch (Exception e) {
        }
        return aux;
    }
}
