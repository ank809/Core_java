public class Interface_Car  implements Interface_Brake, Interface_Engine{
    
    @Override
    public
    void start(){
        System.out.println("I start like a normal car");
    }
    @Override
    public void stop(){
        System.out.println("I stop like a normal car");
    }
    @Override
    public void acc(){
        System.out.println("I acc like a normal car");
    }
    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }
}
