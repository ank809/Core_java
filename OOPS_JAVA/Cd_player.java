package OOPS_JAVA;

public class Cd_player  implements Media{

    @Override
    public void start() {
         System.out.println("Media player starts");;
    }

    @Override
    public void stop() {
        System.out.println("Media player stops");
    }
    
}
