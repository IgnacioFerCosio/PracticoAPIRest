package com.example.inicial1.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseServices<E> {
    public List<E> findAll() throws Exception;
    public E findById(Long id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;

}
