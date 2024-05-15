
abstract class Pizza {
    abstract void addTopping();
    void bake() {
        System.out.println("Baking the pizza...");
    }
    void slice() {
        System.out.println("Slicing the pizza...");
    }
}

class MargheritaPizza extends Pizza {
    @Override
    void addTopping() {
        System.out.println("Adding cheese and basil as toppings for Margherita pizza.");
    }
}

class PepperoniPizza extends Pizza {
    @Override
    void addTopping() {
        System.out.println("Adding pepperoni as topping for Pepperoni pizza.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pizza margherita = new MargheritaPizza();
        System.out.println("Preparing Margherita pizza:");
        margherita.addTopping();
        margherita.bake();
        margherita.slice();
        System.out.println();
        Pizza pepperoni = new PepperoniPizza();
        System.out.println("Preparing Pepperoni pizza:");
        pepperoni.addTopping();
        pepperoni.bake();
        pepperoni.slice();
    }
}
