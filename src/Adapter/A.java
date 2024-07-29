/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author isharaLakshitha
 */
class Laptop {

    private SD sd;

    public void setSd(SD sd) {
        this.sd = sd;
    }

    public void viewFiles() {
        this.sd.readSDCard();
    }
}

interface SD {

    public abstract void readSDCard();
}

class SonySD implements SD {

    @Override
    public void readSDCard() {
        System.out.println("Reading Sony SD Card");
    }
}

interface MicroSD {

    public abstract void readMicroSDCard();
}

class SamsungMicroSD implements MicroSD {

    @Override
    public void readMicroSDCard() {
        System.out.println("Reading Samsung Micro SD Card");
    }
}

class Adapter implements SD {

    private MicroSD microSD;

    public Adapter(MicroSD microSD) {
        this.microSD = microSD;
    }

    @Override
    public void readSDCard() {
        this.microSD.readMicroSDCard();
    }
}

class Test {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        SonySD sonySD = new SonySD();
        laptop.setSd(sonySD);
        laptop.viewFiles();

        SamsungMicroSD samsungMicroSD = new SamsungMicroSD();
        // laptop.setSd(samsungMicroSD); // This line would cause a compilation error
        Adapter adapter = new Adapter(samsungMicroSD);
        laptop.setSd(adapter);
        laptop.viewFiles();
    }
}
