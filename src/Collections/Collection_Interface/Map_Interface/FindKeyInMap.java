package Collections.Collection_Interface.Map_Interface;

import java.util.HashMap;
import java.util.TreeMap;

public class FindKeyInMap {

    /*
       The Original map: {Red=1, White=4, Blue=5, Black=3, Green=2}
1. Is key 'Green' exists?
yes! - 2

2. Is key 'orange' exists?
no!
     */
    public static void main(String[] args) {
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        hash_map.put("Red", 1);
        hash_map.put("White", 4);
        hash_map.put("Blue",5);
        hash_map.put("Black", 3);
        hash_map.put("Green", 2);



    }
}
