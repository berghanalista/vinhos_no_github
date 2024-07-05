
package com.berghgustavoarianadayane.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ProductService {
    
    private List<Produto> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Produto(1L, "Del Rei", 5, "Chile", new BigDecimal("78.00")));
        products.add(new Produto(2L, "Chapada", 6, "Portugal", new BigDecimal("75.00")));
        products.add(new Produto(3L, "Pinot Noir", 5, "Chile", new BigDecimal("78.00")));
        products.add(new Produto(4L, "Sauvignon Blanc", 7, "Chile", new BigDecimal("175.00")));

    }

    public List<Produto> getProducts() {
        return new ArrayList<>(products);
    }

    
    
    

   

       
}
