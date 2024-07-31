/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package State;

/**
 *
 * @author isharaLakshitha
 */
interface Gun {

    public abstract void fire();
}

class AK47 implements Gun {

    @Override
    public void fire() {
        System.out.println("AK47 sound");
    }
}

class Sniper implements Gun {

    @Override
    public void fire() {
        System.out.println("Sniper sound");
    }
}

class Man {

    private Gun gun;

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void shoot() {
        this.gun.fire();
    }
}

class Test {

    public static void main(String[] args) {
        Man man = new Man();

        Gun ak47 = new AK47();
        Gun sniper = new Sniper();

        man.setGun(ak47);
        man.shoot();

        man.setGun(sniper);
        man.shoot();
    }
}
