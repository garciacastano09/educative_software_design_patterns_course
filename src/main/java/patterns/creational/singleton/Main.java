package patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        AirforceOneTraditional airforceOneTraditional = AirforceOneTraditional.getInstance();
        airforceOneTraditional.fly();

        AirforceOneDoubleCheckedLocking airforceOneDoubleCheckedLocking = AirforceOneDoubleCheckedLocking.getInstance();
        airforceOneDoubleCheckedLocking.fly();
    }
}
