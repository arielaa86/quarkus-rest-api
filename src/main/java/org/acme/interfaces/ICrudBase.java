package org.acme.interfaces;

import org.acme.model.Product;
import java.util.List;


public interface ICrudBase<T> {

    T save(T t);
    T find(Long id);
    List<T> findAll();
    void delete(Long id);
    Long count();

}
