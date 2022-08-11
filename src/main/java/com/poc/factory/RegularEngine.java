package com.poc.factory;

public class RegularEngine implements Engine{
    @Override
    public void allocated(String customer) {
        System.out.println("Regular Engine created for this customer "+customer);
    }
}
