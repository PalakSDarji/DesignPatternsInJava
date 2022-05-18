package com.palak.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private final Map<String, Product> productMap = new HashMap<>();

    public Product lookup(String productName){
        if(!productMap.containsKey(productName)){
            productMap.put(productName, new Product(productName));
        }
        return productMap.get(productName);
    }

    public int totalProductsMade(){
        return productMap.size();
    }
}
