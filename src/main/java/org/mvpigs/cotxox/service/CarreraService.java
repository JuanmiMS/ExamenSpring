package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CarreraService extends Carrera {

    @Autowired
    Carrera Carrera;

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
}
