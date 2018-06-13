package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class ConductorService extends Conductor{

    @Autowired
    Conductor Conductor;

    @PersistenceContext
    private EntityManager em;

    public Conductor recuperarConductor(String tarjetaCredito) {
        return em.find(Conductor.class,tarjetaCredito);
    }

    public void crearConductor(String tarjetaCredito, String nombre, String matricula, String modelo){
        Conductor = new Conductor(tarjetaCredito);
        Conductor.setNombre(nombre);
        Conductor.setMatricula(matricula);
        Conductor.setModelo(modelo);

        em.persist(Conductor);
    }
}
