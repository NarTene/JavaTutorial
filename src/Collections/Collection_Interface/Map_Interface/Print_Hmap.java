package Collections.Collection_Interface.Map_Interface;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Print_Hmap {
    public static void main(String[] args) {

        // Creating a Hmap of key int type and value String type value.

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "White");
        treeMap.put(5, "Black");

        System.out.println(treeMap);

        //for each loop


    }
}
