package assignment02;

public class Q_1_Singleton {

    public static void main(String[] args) {
        test obj1 = test.getInstance();

    }
}

class test{
    static test a = new test();
    private test(){

    }
    public static test getInstance(){
        return a;
}
}

