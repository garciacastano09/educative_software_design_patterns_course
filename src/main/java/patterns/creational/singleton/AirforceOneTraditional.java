package patterns.creational.singleton;

public class AirforceOneTraditional {

    private static AirforceOneTraditional onlyAirforceOneTraditional;

    private AirforceOneTraditional(){}

    public void fly(){
        System.out.println("Fly");
    }

    synchronized public static AirforceOneTraditional getInstance(){
        if (onlyAirforceOneTraditional == null){
            onlyAirforceOneTraditional = new AirforceOneTraditional();
        }
        return onlyAirforceOneTraditional;
    }
}