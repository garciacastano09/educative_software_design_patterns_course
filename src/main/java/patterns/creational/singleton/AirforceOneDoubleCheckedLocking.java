package patterns.creational.singleton;

public class AirforceOneDoubleCheckedLocking {

    volatile private static AirforceOneDoubleCheckedLocking onlyAirforceOneDoubleCheckedLocking;

    private AirforceOneDoubleCheckedLocking(){}

    public void fly(){
        System.out.println("Fly");
    }

    synchronized public static AirforceOneDoubleCheckedLocking getInstance(){
        if (onlyAirforceOneDoubleCheckedLocking == null){
            synchronized (AirforceOneDoubleCheckedLocking.class){
                if (onlyAirforceOneDoubleCheckedLocking == null){
                    onlyAirforceOneDoubleCheckedLocking = new AirforceOneDoubleCheckedLocking();
                }
            }
        }
        return onlyAirforceOneDoubleCheckedLocking;
    }
}