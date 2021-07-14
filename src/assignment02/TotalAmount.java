package assignment02;

public class TotalAmount {
    public static void main(String[] args) {

        Bank b = new SavingAccHolder();

        double A,r,t,n,temp;
        r=0.05;
        t=2;
        n=4;
        temp = (1+r/n);

        A = b.fixedDeposite*Math.pow(temp,(n*t));
        double amount = Math.round(A);
        System.out.println("Fixed Deposite " + amount);

        Bank b1 = new CurrentAccHolder();
        double amount1 = b1.cashCredit;
        System.out.println("Cash credit " + amount1);

        System.out.println("Total " + (amount + amount1));

    }
}
