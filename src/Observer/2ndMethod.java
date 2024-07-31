
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 * @author isharaLakshitha
 */
interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}

class ConcreteSubject implements Subject {

    private int x;
    private ArrayList<Observer> observerList;

    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this.x);
        }
    }

    public void setX(int x) {
        this.x = x;
        notifyObservers();
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
        System.out.println("Observer 1: " + x);
    }
}

class ConcreteObserver2 implements Observer {

    @Override
    public void update(int x) {
        System.out.println("Observer 2: " + x);
    }
}

class Test {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setX(50);
    }
}
