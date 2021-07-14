package assignment02;

public abstract class Bank {

    double fixedDeposite = 50000;
    double cashCredit = 10000;
    abstract double totalCash();
}


class SavingAccHolder extends Bank{

    @Override
    double totalCash() {
        return fixedDeposite;
    }
}

class CurrentAccHolder extends Bank{

    @Override
    double totalCash() {
        return cashCredit;
    }
}

