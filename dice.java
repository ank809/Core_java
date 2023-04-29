import java.util.ArrayList;
public class dice {
    public static void main(String[] args) {
        finding("", 4);
        findingface("", 6, 8);
        System.out.println(finding1("", 4));
    }
    static void finding(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6  && i<=target; i++){
            finding(p+i, target-i);
        }
    }
    
    static ArrayList<String> finding1(String p, int target){
        if(target==0){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        for(int i=1; i<=6  && i<=target; i++){
            list.addAll(finding1(p+i, target-i));
        }
        return list;
    }
    static void findingface(String p, int target, int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1; i<=face  && i<=target; i++){
            findingface(p+i, target-i, face);
        }
    }
    
}
