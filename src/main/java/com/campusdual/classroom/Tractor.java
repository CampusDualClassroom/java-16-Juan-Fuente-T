package com.campusdual.classroom;

public class Tractor implements IMachine {


    protected int horsePower;

    public Tractor(int hp) {
        this.horsePower = hp;
    }

    public void forward() {
        System.out.println("El tractor avanza");
    }

    public void backward() {
        System.out.println("El tractor retrocede");
    }

    @Override
    public void start() {
        System.out.println("El tractor está encendido.");
    }

    @Override
    public void stop() {
        System.out.println("El tractor está apagado.");
    }

    @Override
    public void maintenance() {
        System.out.println("El tractor está realizando el mantenimiento.");
    }

    public void power() {
        System.out.println("El tractor tiene " + this.horsePower + " hp de potencia.");
    }

}
