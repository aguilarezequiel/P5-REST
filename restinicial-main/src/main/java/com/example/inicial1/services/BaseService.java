package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BaseService<E>{
    public List<E> findAll() throws Exception;
    public E findById(Long id) throws Exception;

    @Transactional
    Persona findById(Long id) throws Exception;

    public E save(E entity) throws Exception;
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
