import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.TreeMap;

public class Day4Exercises {
    public static void main(String[] args) {
        //ArrayList - 1
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        //ArrayList - 3
        colors.add(0, "Black");
        System.out.println("\n" + colors.get(0));
        System.out.println(colors.get(1));

        //ArrayList -5
        colors.set(1, "Orange");
        System.out.println("\n" + colors.get(0));
        System.out.println(colors.get(1));


        //ArrayList - 17
        for(int i = 0; i < colors.size(); i++){
            colors.remove(i);
        }
        System.out.println("---------");

        //LinkedList 1
        LinkedList<String> ll = new LinkedList<>();
        ll.add("text");
        System.out.println(ll.get(0));
        System.out.println("");

        //LinkedList - 4
        ll.add("aaa");
        ll.add("bbb");

        for(int i = ll.size()-1; i >=0; i--){
            System.out.println(ll.get(i));
        }

        //LinkedList - 7
        System.out.println("");
        ll.add(0,"first");
        System.out.println(ll.get(0) + " " + ll.get(1));

        //HashSet - 1
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        System.out.println(hs);

        //HashSet - 7
        String[] array = new String[3];
        hs.toArray(array);
        System.out.println("\n" + array[0]);

        //TreeSet - 2
        System.out.println("");
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Yellow");
        ts.add("Orange");
        ts.add("Red");

        for(String s:ts){
            System.out.println(s);
        }
        //TreeSet - 6
        TreeSet<String> ts2 = new TreeSet<>(ts);
        System.out.println(ts2);

        //PriorityQueue - 1
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Yellow");
        pq.add("Gray");
        pq.add("Orange");
        System.out.println("\n"+ pq);

        //PriorityQueue - 11
        String str;
        str = pq.toString();
        System.out.println(str);

        //HashMap - 1
        HashMap<String, String> hm = new HashMap<>();
        hm.put("First", "a");
        System.out.println(hm);

        //HashMap - 7
        System.out.println(hm.containsKey("First"));

        //TreeMap - 1
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("First", "1");
        System.out.println("\n"+tm.get("First"));

    }


}
