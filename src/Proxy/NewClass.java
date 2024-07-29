/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proxy;

/**
 *
 * @author isharaLakshitha
 */
interface Database {

    public abstract void search(String query);
}

class RealDatabase implements Database {

    @Override
    public void search(String query) {
        System.out.println("Database Search " + query);
    }
}

class ProxyDatabase implements Database {

    private RealDatabase realDatabase;
    private String password;

    public ProxyDatabase(String password) {
        this.password = password;
        this.realDatabase = new RealDatabase();
    }

    @Override
    public void search(String query) {
        if (authenticate()) {
            this.realDatabase.search(query);
        } else {
            System.out.println("Access Denied!");
        }
    }

    private boolean authenticate() {
        if (this.password.equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}

class Test {

    public static void main(String[] args) {
        ProxyDatabase proxyDatabase = new ProxyDatabase("123");
        proxyDatabase.search("SELECT * FROM product");
    }
}
