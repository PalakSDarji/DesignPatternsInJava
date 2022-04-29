package com.palak.solid.dependencyinversion;

public class DataAccess implements ICustomerDataAccess{

    @Override
    public String provideCustomerData() {
        return "Some Customer";
    }
}
