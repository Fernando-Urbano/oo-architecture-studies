package templatemethod;

abstract public class InsurancePolicy {
    public void setup() {
        System.out.println("Inside InsurancePolicy::setup");
        tempVar = 0.0;
        premium = 0.0;
    }

    public void printPremium() {
        System.out.println("Inside InsurancePolicy::printPremium");
    }

    public void pricePolicy() {
        setup();
        stageOne();
        stageTwo();
        printPremium();
    }

    abstract public void stageOne();
    abstract public void stageTwo();

    protected double tempVar;
    protected int AccountNumber;
    protected double premium;
}
