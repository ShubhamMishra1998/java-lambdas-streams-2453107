package com.example;



public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World");
      }
    };
    greeting2.sayHello();

    Greeting greeting1=()-> System.out.println("helo world");
    greeting1.sayHello();


    Calculator calculator=(int x,int y)->{
      return  x+y;
    };

    System.out.println(calculator.calculate(5,9));

  }

}
