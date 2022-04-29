package com.palak.solid.dependencyinversion;

public class CustomerBusinessLogic {
    public void processSomeLogicCustomerInfo(ICustomerDataAccess customerDataAccess){
        System.out.println("pritning customer data : " + customerDataAccess.provideCustomerData());
    }
}
