package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
}
