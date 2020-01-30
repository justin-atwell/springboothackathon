package com.springboothackathon.repository;

import com.springboothackathon.models.Theater;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class TheaterRepositoryImpl implements TheaterRepository {
    public List<Theater> getAllTheaters() {
        return null;
    }

    @Override
    public List<Theater> findAll() {
        return null;
    }

    @Override
    public List<Theater> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Theater> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Theater> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Theater theater) {

    }

    @Override
    public void deleteAll(Iterable<? extends Theater> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Theater> S save(S s) {
        return null;
    }

    @Override
    public <S extends Theater> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Theater> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Theater> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Theater> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Theater getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Theater> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Theater> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Theater> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Theater> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Theater> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Theater> boolean exists(Example<S> example) {
        return false;
    }
}
