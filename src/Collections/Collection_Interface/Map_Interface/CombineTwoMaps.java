package Collections.Collection_Interface.Map_Interface;

import java.util.HashMap;

public class CombineTwoMaps {
      /*
          Values in first map: {1=Red, 2=Green, 3=Black}

Values in second map: {4=White, 5=Blue, 6=Orange}

Now values in second map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue, 6=
Orange}
       */
    public static void main(String[] args) {

        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

        //hash_ma
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println();
        hash_map1.put(1, "White");
        hash_map1.put(2, "Blue");
        hash_map1.put(3, "Orange");
        System.out.println();

    }
}
