package hello.hellospring.controller;

import hello.hellospring.domain.Bus;


public class BusController {
    public static void main(String[] args) {
        Bus bus = new Bus();
        String stateAnswer = bus.state(30);
        String addPassengerAnswer = bus.addPassenger(15);
        String changeSpeed = bus.changeSpeed(-13);

        System.out.println(changeSpeed);
        }
    }
