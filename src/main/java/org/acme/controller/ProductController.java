package org.acme.controller;

import org.acme.model.Product;
import org.acme.service.ProductService;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/api/product")
public class ProductController {

    @Inject
    ProductService productService;

    @GET
    @Path("/index")
    public List<Product> index(){
        return productService.findAll();
    }

    @POST
    @Path("/save")
    public Product save(Product product){
        return productService.save(product);
    }





}
