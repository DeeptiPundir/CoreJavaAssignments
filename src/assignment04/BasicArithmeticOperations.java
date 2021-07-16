package assignment04;

public class BasicArithmeticOperations {
    public static void main(String[] args) {

        ArithmeticOp add = (int a, int b) ->  (a+b);
        System.out.println("Addition: "  + add.operations(10,20));

        ArithmeticOp sub = (int a , int b) -> (a-b);
        System.out.println("Subtraction: " + sub.operations(20,5));

        ArithmeticOp mul = (int a , int b) -> (a*b);
        System.out.println("Multiplication: " + mul.operations(2,5));

        ArithmeticOp div = (int a , int b) -> {
            if (b == 0)
                return 0;

            else
                return (a / b);

        };


        System.out.println("Division: " + div.operations(100,5));

    }

}

@FunctionalInterface
interface ArithmeticOp {
    int operations(int a , int b);
}
