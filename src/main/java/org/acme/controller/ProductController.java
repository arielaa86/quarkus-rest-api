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

    @GET
    @Path("/show/{id}")
    public Product show(@PathParam("id") Long id){
        return productService.find(id);
    }

    @POST
    @Path("/save")
    public Product save(Product product){
        return productService.save(product);
    }


    @PUT
    @Path("/update")
    public Product update(Product product){
        return productService.save(product);
    }


    @DELETE
    @Path("/delete/{id}")
    public String delete(@PathParam("id") Long id){
        productService.delete(id);
        return "Deleted";
    }





}
