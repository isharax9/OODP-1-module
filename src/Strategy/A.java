// Strategy Interface
interface Strategy {
    public abstract boolean check(String text);
}

// SahanStrategy Class
class SahanStrategy implements Strategy {
    @Override
    public boolean check(String text) {
        return text.contains("J");
    }
}

// KasunStrategy Class
class KasunStrategy implements Strategy {
    @Override
    public boolean check(String text) {
        boolean b = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'J') {
                b = true;
                break;
            }
        }
        return b;
    }
}

// Context Class
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void useStrategy(String text) {
        strategy.check(text);
    }
}

// Test Class
class Test {
    public static void main(String[] args) {
        String text = "Hello Java";

        Context context = new Context();

        context.setStrategy(new SahanStrategy());
        context.useStrategy(text);

        context.setStrategy(new KasunStrategy());
        context.useStrategy(text);
    }
}
