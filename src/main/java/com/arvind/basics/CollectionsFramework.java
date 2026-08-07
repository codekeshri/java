package com.arvind.basics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {

    public static void main(String[] args) {
        
        List<Integer>list = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);
        list2.add(9);
        list2.add(19);
        list2.add(29);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(12));
        System.out.println(list.remove(1));
        System.out.println(list.isEmpty());
        System.out.println(list.toString());
        System.out.println(list.reversed());
        System.out.println(list.containsAll(list));
        System.out.println(list.addAll(list2));
        System.out.println(list);
        System.out.println(list.removeAll(list2));
        System.out.println(list);
        System.out.println(list.indexOf(19));
        System.out.println(list.lastIndexOf(19));
        list.remove(Integer.valueOf(0));

        List<String>fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Guava");

        // Iterator<String> it = fruits.iterator();
        Iterator<String> it = fruits.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        List<String>smallList = fruits.subList(1, 2);
        System.out.println(smallList);

        // Stack
        Stack<String>st = new Stack<>();
        st.push("Munger");
        st.push("Delhi");
        st.push("Mumbai");
        st.push("Valsad");
        st.push("Bangalore");
        st.push("Dubai");
        st.push("London");
        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);

        // Queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        while(!q.isEmpty())System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.peek());


        // Deque

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // Queue<Integer> dq = new ArrayDeque<>();
        dq.add(2);
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(200);
        System.out.println(dq);   // 200, 2, 10, 20
        System.out.println(dq.poll());
        System.out.println(dq);
        System.out.println(dq.pollLast());  // removeLast
        System.out.println(dq);
        dq.pollFirst();                      // removeFirst
        dq.add(400);
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


        // Set
        Set<Integer> set = new HashSet<>();            //O(1)
        // Set<Integer> set = new LinkedHashSet<>();   //O(n)
        // Set<Integer> set = new TreeSet<>();         //O(logn)


        // Map
        Map<String, String> map = new HashMap<>();   // O(1)
        // Map<String, String> map = new LinkedHashMap<>(); // O(n)
        // Map<String, String> map = new TreeMap<>();       // O(logn)

        map.put("arvind", "keshri");
        map.put("anuj", "sharma");
        map.put("apna", "college");
        map.put("agli", "baar");
        map.remove("apna");
        map.put("arvind", "kumar");
        System.out.println(map);
        System.out.println(map.get("arvind"));
        System.out.println(map.containsKey("shashi"));

        Collection<String> values = map.values();
        System.out.println("arrr" + values);

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        for(Map.Entry<String, String> entry: entries){
            System.out.println(entry + " " + entry.getKey() + " "+ entry.getValue());
        }

        Collections.sort(list);
        
        // Lambda Expression
        Collections.sort(list, (Integer a, Integer b)->{
            return a-b;
        });
        
        Collections.sort(list, (a, b)->a-b);
        Collections.sort(list, (a, b)->b-a);    // descending
        Collections.sort(list, (a,b)->Integer.compare(a, b));
        Collections.sort(list, (a,b)->Integer.compare(b, a));   // descending
        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());




    }
    
}

