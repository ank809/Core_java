import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        String s = "abc";
        subseq("", s);
        System.out.println(subseq1("", "abcd"));
        System.out.println(subseq2("", "abc"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseq1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq1(p + ch, up.substring(1));
        ArrayList<String> right = subseq1(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseq2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> third = subseq2(p + (ch + 0), up.substring(1));
        ArrayList<String> first = subseq2(p + ch, up.substring(1));
        ArrayList<String> right = subseq2(p, up.substring(1));
        first.addAll(third);
        first.addAll(right);
        return first;
    }// ArrayList<String> third= subseq1(p+(ch+0), up.substring(1));

}
