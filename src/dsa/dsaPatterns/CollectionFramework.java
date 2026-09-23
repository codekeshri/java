import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionFramework {
    public static void main(String[] args) {


    }

    static void queueStack(){
        Queue<Integer> q = new LinkedList<>();
        
    }

    static void arrayList(){

        /** ArrayList
         * LinkedList vs ArrayList:
         - access in O(1) in ArrayList
         - LinkedList can be used when insertions and deletions occurs frequently
         * LinkedList implements from deque also
         * Vector class is thread-safe low performance than ArrayList

         List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(2);
         list.add(2);
         list.set(2, 7);
         Integer[] arr = list.toArray(new Integer[0]);
         for(int i: arr) System.out.print(i + " ");
         int k = list.get(2);
         System.out.println(k);
         System.out.println(list);
         for(int x: list) System.out.println(x);
         List<Integer> list1 = new ArrayList<>(list);
         list1.add(5);
         list1.add(5);
         list1.add(5);
         list1.add(5);
         System.out.println(list1);
         System.out.println(list);
         list.addAll(list1);
         System.out.println(list);
         int firstIndex = list1.indexOf(2);
         int lastIndex = list1.lastIndexOf(2);
         System.out.println(firstIndex + " " + lastIndex);
         List<Integer> sublist = list1.subList(0,5);
         System.out.println(sublist);
         sublist.set(2, 200);
         System.out.println(sublist);
         System.out.println(list1);

         */

    }




}
