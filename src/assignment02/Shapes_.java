package assignment02;

public class Shapes_ {
    public static void main(String[] args) {
        Shapes l = new Line();
        System.out.println(l.draw(9));

        Shapes r = new Rectangle();
        System.out.println(r.draw(20));

        Shapes c = new Cube();
        System.out.println(c.draw(5));

    }
}

abstract class Shapes{

    abstract String draw(int parameter);
}

class Line extends Shapes{

    @Override
    String draw(int parameter) {
        return "Line of " + parameter + " cms";
    }
}

class Rectangle extends Shapes{

    @Override
    String draw(int parameter) {
        return "Rectangle " + parameter + " cm";
    }
}

class Cube extends Shapes{

    @Override
    String draw(int parameter) {
        return "Cube " + parameter + " cms";
    }
}