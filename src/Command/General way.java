/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isharaLakshitha
 */
interface Command {

    public abstract void execute();
}

class ConcreateCommand1 implements Command {

    private final Receiver receiver;

    public ConcreateCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.actionA();
    }
}

class ConcreteCommand2 implements Command {

    private final Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.actionB();
    }
}

class Receiver {

    public void actionA() {
        System.out.println("Receiver actionA");
    }

    public void actionB() {
        System.out.println("Receiver actionB");
    }
}

class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invokeAction() {
        command.execute();
    }
}

class Test {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        // balla.buranawa();
        // balla.duwanawa();

        Command command1 = new ConcreateCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);
        // command1.execute();
        // command2.execute();

        Invoker invoker1 = new Invoker();
        invoker1.setCommand(command1);
        invoker1.invokeAction();

        invoker1.setCommand(command2);
        invoker1.invokeAction();
    }
}
