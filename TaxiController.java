package hello.hellospring.controller;

import hello.hellospring.domain.Taxi;

public class TaxiController {
    public static void main(String[] args){
        Taxi taxi = new Taxi();

        System.out.println(taxi.totalPrice());
    }
}