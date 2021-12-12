package by.alexrom.s13;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortHashMap {

    public static boolean ASC = true;
    public static boolean DESC = false;

//    public static void main(String[] args) {
//
//        // Creating dummy unsorted map
//        //        Map<String,Integer> unsortMap = new HashMap<String,Integer>();
//        //        unsortMap.put("B", 55);
//        //        unsortMap.put("A", 80);
//        //        unsortMap.put("D", 20);
//        //        unsortMap.put("C", 70);
//        //
//        //        System.out.println("Before sorting......");
//        //        printMap(unsortMap);
//
//        System.out.println("After sorting ascending order......");
//        Map<Character,Integer> sortedMapAsc = sortByComparator(Main.alphabetMapRuss, ASC);
//        printMap(sortedMapAsc);
//
//        System.out.println("After sorting descindeng order......");
//        Map<Character,Integer> sortedMapDesc = sortByComparator(Main.alphabetMapRuss, DESC);
//        printMap(sortedMapDesc);
//    }

    public static Map<Character,Integer> sortByComparator(Map<Character,Integer> unsortMap, final boolean order) {

        List<Map.Entry<Character,Integer>> list = new LinkedList<>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {
            @Override
            public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2) {
                if(order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }

            //            public int compare(Map.Entry<Character,Integer> o1,
            //                    Map.Entry<String,Integer> o2) {
            //                if(order) {
            //                    return o1.getValue().compareTo(o2.getValue());
            //                } else {
            //                    return o2.getValue().compareTo(o1.getValue());
            //                }
            //            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<Character,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void printMap(Map<Character,Integer> map) {
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}
