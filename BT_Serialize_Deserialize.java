import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BT_Serialize_Deserialize {

    public class Node{
        int val;
        Node left;
        Node right;
        Node(int value){
            this.val=value;
        }
    }
    public List<String>serialize(Node node){
        List<String> list= new ArrayList<>();
        helper(node, list);
        return list;
    }
    List<String> helper(Node node, List<String> list){
        if(node==null){
           list.add("null");
        }
        list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
        return list;
    }

    public Node deserialize(List<String> list){
        //Collections.reverse(list);
        helper2(list);
        return  helper2(list);
    }
    Node helper2(List<String> list){
        String val= list.remove(list.size()-1);
        if(val.charAt(0)=='n'|| val.equals("null")){
            return null;
        }
        Node node= new Node(Integer.parseInt(val));
        node.left=helper2(list);
        node.right=helper2(list);
        return node;
    }
}
