/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author isharaLakshitha
 */
interface Command {

    public abstract void execute();
}

class BallaBuranawa implements Command {

    private Balla balla;

    public BallaBuranawa(Balla balla) {
        this.balla = balla;
    }

    @Override
    public void execute() {
        this.balla.buranawa();
    }
}

class BallaDuwanawa implements Command {

    private Balla balla;

    public BallaDuwanawa(Balla balla) {
        this.balla = balla;
    }

    @Override
    public void execute() {
        this.balla.duwanawa();
    }
}

class Balla {

    public void buranawa() {
        System.out.println("Balla Buranawa");
    }

    public void duwanawa() {
        System.out.println("Balla Duwanawa");
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
        Balla balla = new Balla();
        // balla.buranawa();
        // balla.duwanawa();

        Command command1 = new BallaBuranawa(balla);
        Command command2 = new BallaDuwanawa(balla);
        // command1.execute();
        // command2.execute();

        Invoker invoker1 = new Invoker();
        invoker1.setCommand(command1);
        invoker1.invokeAction();

        invoker1.setCommand(command2);
        invoker1.invokeAction();
    }
}
