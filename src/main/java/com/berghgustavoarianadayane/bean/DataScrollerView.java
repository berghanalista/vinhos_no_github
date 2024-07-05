package com.berghgustavoarianadayane.bean;


import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author berghlinux
 */
@Named
@ViewScoped
public class DataScrollerView implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private List<Produto> products;

    @Inject
    private ProductService service;

    @PostConstruct
    public void init() {
        products = service.getProducts();
    }

    public List<Produto> getProducts() {
        return products;
    }

    public void setService(ProductService service) {
        this.service = service;
    }
}
