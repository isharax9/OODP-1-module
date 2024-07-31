/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author isharaLakshitha
 */
class Subject {
    
    private int x;
    private ArrayList<Observer> observerList;
    
    public Subject() {
        this.observerList = new ArrayList<>();
    }
    
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }
    
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this.x);
        }
    }
    
    public void setX(int x) {
        this.x = x;
        notifyObserver();
    }
    
    public int getX() {
        return x;
    }
    
}

interface Observer {
    
    public abstract void update(int x);
}

class ConcreteObserver1 implements Observer {
    
    @Override
    public void update(int x) {
        System.out.println("Observer 1:" + x);
    }
}

class ConcreteObserver2 implements Observer {
    
    @Override
    public void update(int x) {
        System.out.println("Observer 2:" + x);
    }
}

class Test {
    
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        
        subject.setX(50);
        
    }
}
