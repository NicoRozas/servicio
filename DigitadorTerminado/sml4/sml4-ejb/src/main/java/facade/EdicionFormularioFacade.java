/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.EdicionFormulario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Aracelly
 */
@Stateless
public class EdicionFormularioFacade extends AbstractFacade<EdicionFormulario> implements EdicionFormularioFacadeLocal {
    @PersistenceContext(unitName = "com.pingeso_sml4-ejb_ejb_3.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EdicionFormularioFacade() {
        super(EdicionFormulario.class);
    }
    
}
