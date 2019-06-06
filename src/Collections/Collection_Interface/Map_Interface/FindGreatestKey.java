package Collections.Collection_Interface.Map_Interface;

import java.util.TreeMap;

public class FindGreatestKey {

    /*
       Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}
Greatest key: C1
Least key: C4
     */

    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<String, String>();

        treeMap.put("C1", "Green");
        treeMap.put("C2", "Red");
        treeMap.put("C3", "White");
        treeMap.put("C4", "Black");

        System.out.println("Original TreeMap content");
    }
}
