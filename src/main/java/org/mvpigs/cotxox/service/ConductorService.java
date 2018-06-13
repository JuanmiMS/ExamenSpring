package org.mvpigs.cotxox.service;

import org.aspectj.lang.annotation.Before;
import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PostPersist;
import javax.transaction.Transactional;

@Service
@Transactional
public class ConductorService extends Conductor {

    @Autowired
    Conductor Conductor;

    @PersistenceContext
    private EntityManager em;

    @PostPersist
    public Conductor recuperarConductor(String tarjetaCredito) {
        return em.find(Conductor.class, tarjetaCredito);
    }

    public void crearConductor(String tarjetaCredito, String nombre, String matricula, String modelo) {
        Conductor = new Conductor(tarjetaCredito);
        Conductor.setNombre(nombre);
        Conductor.setMatricula(matricula);
        Conductor.setModelo(modelo);

        em.persist(Conductor);
    }

    public void init() {
        this.crearConductor("2222222222222222", "Sabrina", "5DHJ444", "Mercedes A");
        this.crearConductor("3333333333333333", "Cici", "7JKK555", "Toyota Prius");
    }


}
