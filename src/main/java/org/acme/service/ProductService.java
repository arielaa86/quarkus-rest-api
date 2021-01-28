package org.acme.service;

import org.acme.interfaces.ICrudBase;
import org.acme.model.Product;
import org.acme.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@ApplicationScoped
public class ProductService implements ICrudBase<Product> {

    @Inject
    ProductRepository productRepository;


    @Override
    public Product save(Product product) {
        productRepository.persist(product);
        return product;
    }

    @Override
    public Product find(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.listAll();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Long count() {
        return productRepository.count();
    }
}
