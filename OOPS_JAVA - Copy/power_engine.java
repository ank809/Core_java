package OOPS_JAVA;

public class power_engine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
    }
}

    

