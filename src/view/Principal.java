package view;

import java.util.concurrent.Semaphore;
import controller.controller;

public class Principal {
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);
        Thread thread = new controller(semaforo);
        thread.start();
    }
}