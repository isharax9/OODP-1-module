package Template;

/**
 *
 * @author isharaLakshitha
 */
abstract class FruitJuice {

    public final void prepare() {

        select();
        addIngredients();
        blend();
        serve();
    }

    public abstract void select();

    public abstract void addIngredients();

    public void blend() {
        System.out.println("Blend the juice");
    }

    public void serve() {
        System.out.println("Served the Juice");
    }

}

class AppleJuice extends FruitJuice {

    @Override
    public void select() {
        System.out.println("Select Apple");
    }

    @Override
    public void addIngredients() {
        System.out.println("Add Water and Apple");
    }

}

class OrengeJuice extends FruitJuice {

    @Override
    public void select() {
        System.out.println("Select Orenge");
    }

    @Override
    public void addIngredients() {
        System.out.println("Add Water and Orenge");
    }

}

class Test {

    public static void main(String[] args) {
        FruitJuice fj1 = new AppleJuice();
        fj1.prepare();

        FruitJuice fj2 = new OrengeJuice();
        fj2.prepare();

    }

}
