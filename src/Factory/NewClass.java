/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

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
        System.out.println("Trrr");
    }
}

class Sniper implements Gun {

    @Override
    public void fire() {
        System.out.println("Booom");
    }
}

class GunFactory {

    public Gun makeGun(String name) {
        if (name.equals("AK47")) {
            return new AK47();
        } else if (name.equals("Sniper")) {
            return new Sniper();
        } else {
            return null;
        }
    }
}

class Test {

    public static void main(String[] args) {
        //AK47 ak47 = new AK47();
        //ak47.fire();
        GunFactory gunFactory = new GunFactory();

        Gun g1 = gunFactory.makeGun("AK47");
        g1.fire();

        Gun g2 = gunFactory.makeGun("Sniper");
        g2.fire();
    }
}
