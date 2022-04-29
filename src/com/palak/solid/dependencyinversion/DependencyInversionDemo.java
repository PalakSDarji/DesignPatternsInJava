package com.palak.solid.dependencyinversion;

public class DependencyInversionDemo {
    public static void main(String[] args) {

        ICustomerDataAccess customerDataAccess = new DataAccess();

        CustomerBusinessLogic customerBusinessLogic = new CustomerBusinessLogic();
        customerBusinessLogic.processSomeLogicCustomerInfo(customerDataAccess);
    }
}
