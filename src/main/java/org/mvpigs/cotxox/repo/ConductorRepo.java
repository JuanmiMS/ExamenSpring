package org.mvpigs.cotxox.repo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import java.util.List;

@Repository
public class ConductorRepo implements CrudRepository<Conductor, Long> {
    @Override
    public <S extends Conductor> S save(S s) {
        return null;
    }

    @Override
    public <S extends Conductor> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Conductor findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Conductor> findAll() {
        return null;
    }

    @Override
    public Iterable<Conductor> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Conductor conductor) {

    }

    @Override
    public void delete(Iterable<? extends Conductor> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @PersistenceContext
    private EntityManager em;

    public List<Conductor> findByOcupado(int ocupado) {

        boolean oc = ocupado != 0;

        TypedQuery<Conductor> query = em.createQuery("Select cond from Conductor cond where cond.ocupado = :ocupado", Conductor.class );
        query.setParameter("ocupado", oc);
        return query.getResultList();
    }


}
