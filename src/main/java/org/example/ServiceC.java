package org.example;

@org.springframework.stereotype.Service("service2")
public class ServiceC implements Service {
    @Override
    public String getInfo() {
        return "ServiceC's info";
    }
}
