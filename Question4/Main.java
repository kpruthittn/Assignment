package Question4;

interface Product {
    void operation();
}

class Product1 implements Product {
    public void operation() {
        System.out.println("Product 1");
    }
}

class Product2 implements Product {
    public void operation() {
        System.out.println("Product 2");
    }
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class Creator1 extends Creator {
    public Product factoryMethod() {
        return new Product1();
    }
}

class Creator2 extends Creator {
    public Product factoryMethod() {
        return new Product2();
    }
}

public class Main {
    public static void main(String[] args) {
        Creator creator1 = new Creator1();
        Product product1 = creator1.factoryMethod();
        product1.operation();

        Creator creator2 = new Creator2();
        Product product2 = creator2.factoryMethod();
        product2.operation();
    }
}

