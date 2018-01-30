/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Subcategory;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author selomongoitom
 */
@Stateless
public class SubcategoryFacade extends AbstractFacade<Subcategory> {

    @PersistenceContext(unitName = "e-commerce_SitePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubcategoryFacade() {
        super(Subcategory.class);
    }
    
}
