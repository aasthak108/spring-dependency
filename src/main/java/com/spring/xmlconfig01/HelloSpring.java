package com.spring.xmlconfig01;

public class HelloSpring
{
   public String message;

   public HelloSpring(){}

   public HelloSpring(String message)
   {
        this.message=message;
   }

    public void printMessage()
    {
        System.out.println("Message is: " + message);
    }

    public void setMessage(String message)
    {
       this.message = message;
    }
}
