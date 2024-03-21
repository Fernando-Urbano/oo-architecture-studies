package templatemethod;

public class BusinessOwnersPolicy extends InsurancePolicy {
    public void stageOne() {
        System.out.println("Inside BusinessOwnersPolicy::stageOne");
        tempVar = 81082;
    }

    public void stageTwo() {
        System.out.println("Inside BusinessOwnersPolicy::stageTwo");
        premium = tempVar * 3;
    }
}