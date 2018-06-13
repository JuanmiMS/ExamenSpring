package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class ConductorService {

    @PersistenceContext
    private EntityManager em;

    public Conductor recuperarConductor(String tarjetaCredito) {
        return em.find(Conductor.class,tarjetaCredito);
    }
}
