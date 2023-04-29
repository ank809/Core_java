import java.util.ArrayList;
public class maze {
    public static void main(String[] args) {
        System.out.println(count(2, 2));
        path("", 3, 3);
        System.out.println(path1("",3, 3));
        System.out.println(pathdiagonal("",3, 3));
    }
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int down= count(r-1, c);
        int right= count(r, c-1);
        return right+down;
    }
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D', r-1, c);
        }
        if(c>1){
            path(p+'R', r, c-1);
        }
    }
    static ArrayList<String> path1(String p, int r, int c){
        if(r==1 && c==1){
           ArrayList<String> list= new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(r>1){
           list.addAll((path1(p+'D', r-1, c)));
        }
        if(c>1){
           list.addAll((path1(p+'R', r, c-1)));
        }
       return list;
    }
    static ArrayList<String> pathdiagonal(String p, int r, int c){
        if(r==1 && c==1 ){
           ArrayList<String> list= new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(r>1){
           list.addAll((pathdiagonal(p+'D', r-1, c)));
        }
        if(r>1 && c>1){
           list.addAll((pathdiagonal(p+'d', r-1, c-1)));
        }
        if(c>1){
           list.addAll((pathdiagonal(p+'R', r, c-1)));
        }
       return list;
    }
    
}
