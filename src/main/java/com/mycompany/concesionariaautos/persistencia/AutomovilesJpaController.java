
package com.mycompany.concesionariaautos.persistencia;

import com.mycompany.concesionariaautos.logica.Automoviles;
import com.mycompany.concesionariaautos.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class AutomovilesJpaController implements Serializable {
        public AutomovilesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public AutomovilesJpaController(){
        emf = Persistence.createEntityManagerFactory("concesionariaPU");
    }
     
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Automoviles automovil) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(automovil);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Automoviles automovil) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            automovil = em.merge(automovil);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = automovil.getId();
                if (findAutomoviles(id) == null) {
                    throw new NonexistentEntityException("The automovil with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Automoviles automovil;
            try {
                automovil = em.getReference(Automoviles.class, id);
                automovil.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The duenio with id " + id + " no longer exists.", enfe);
            }
            em.remove(automovil);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Automoviles> findAutomovilesEntities() {
        return findAutomovilesEntities(true, -1, -1);
    }

    public List<Automoviles> findAutomovilesEntities(int maxResults, int firstResult) {
        return findAutomovilesEntities(false, maxResults, firstResult);
    }

    private List<Automoviles> findAutomovilesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Automoviles.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Automoviles findAutomoviles(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Automoviles.class, id);
        } finally {
            em.close();
        }
    }

    public int getAutomovilesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Automoviles> rt = cq.from(Automoviles.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

