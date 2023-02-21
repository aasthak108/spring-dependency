package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("Client1")
public class ClientA implements Client{
    @Autowired
private Service service;
    @Override
    public void doSomething()
    {
        String info = service.getInfo();
        System.out.println(info);
    }
}
