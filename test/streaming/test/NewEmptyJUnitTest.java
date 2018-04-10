/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Film;

/**
 *
 * @author Formation
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void demarreJPA() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();
        Film film = new Film();
        film.setTitre("Taxi 2");
        film.setAnneeProd(2000);
        em.persist(film);
        
        em.getTransaction().commit();
    }
}
