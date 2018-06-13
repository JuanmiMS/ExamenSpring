package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mvpigs.cotxox.domain.Carrera;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class CarreraService extends Carrera {

    @Autowired
    Carrera Carrera;

    @PersistenceContext
    private EntityManager em;

    public Long crearCarrera(String tarjetaCredito, String origen, String destino, int distancia,
                             int costeTotal) {

        Carrera = new Carrera(tarjetaCredito);
        Carrera.setOrigen(origen);
        Carrera.setDestino(destino);
        Carrera.setDistancia(distancia);
        Carrera.setCosteTotal(costeTotal);

        return Long.valueOf(Carrera.getTarjetaCredito());

    }

    public Carrera recuperaCarrera(Long idCarrera) {
        return Carrera;
    }

    public void updateCarrera(Carrera carrera) {

        carrera = em.find(Carrera.class, 1L);
        carrera.setConductor(carrera.getConductor());
        System.out.println(carrera.getConductor());
        em.merge(carrera);
    }
}
