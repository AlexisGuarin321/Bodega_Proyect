/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelo.Usuario;

/**
 *
 * @author Alexis-PC
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "Bodega1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    // ---- Se crea un metodo para la validación del ingreso al sisitema--------- --//
    public Usuario validarUsuario(String codigoUsuario, String clave) {
        Usuario aux = null;
        try {
            Query q = em.createQuery("select u from Usuario u where u.usuario=?1 and u.password=?2", Usuario.class).setParameter(1, codigoUsuario).setParameter(2, clave);
            aux = (Usuario) q.getSingleResult();
        } catch (Exception e) {
        }
        return aux;
    }
    
}
