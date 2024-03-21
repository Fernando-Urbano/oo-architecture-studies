package templatemethod;

public class CommercialAutoPolicy extends InsurancePolicy {
    public void stageOne() {
        System.out.println("Inside CommercialAutoPolicy::stageOne");
        tempVar = 100.0;
    }

    public void stageTwo() {
        System.out.println("Inside CommercialAutoPolicy::stageTwo");
        premium = tempVar * 2;
    }
}
