package com.poc.factory;

public class AdvancedEngine implements Engine{
    @Override
    public void allocated(String customer) {
        System.out.println("Advanced Engine created for this customer "+customer);

    }
}
