// makes min heap automatically
import java.util.*;
public class Priority_Queue {
  public static void main(String[] args) {
      PriorityQueue<Integer> pq= new PriorityQueue<>();
      pq.add(17);
      pq.add(15);
      pq.add(7);
      pq.add(9);
      while(!pq.isEmpty()){
        System.out.println(pq.poll());
      }
  }
  
}
