package org.example;

import org.springframework.stereotype.Component;

@Component("service")
public class ServiceB implements Service{
    @Override
    public String getInfo(){
        return "ServiceB's info";
    }
}
