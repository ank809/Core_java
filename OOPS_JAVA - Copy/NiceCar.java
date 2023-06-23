package OOPS_JAVA;

public class NiceCar {

    private Engine engine;
    private Media media= new Cd_player();
    public NiceCar(){
        engine= new power_engine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startmusic(){
        media.start();
    }
    public void upgradeEngine(){
        this.engine= new electric_engine();
    }

    
}
