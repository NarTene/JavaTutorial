package Class_Practice.Class_Practice_Week3.Streams_Java;

import java.util.ArrayList;
import java.util.List;

public class FindingNumStringWithoutStream {

      /*
          import java.util.ArrayList;
import java.util.List;
public class Example{
   public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Ajeet");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
	int count = 0;
	for (String str : names) {
	   if (str.length() < 6)
		count++;
	}
        System.out.println("There are "+count+" strings with length less than 6");
   }
}
       */

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ajeethgg");
        names.add("Neganfgg");
        names.add("Adityasssss");
        names.add("Stevedddd");
        names.add("Stormydddd");
        names.add("Frankdddddd");
        names.add("John");
        // iterating through an arrayList of String element using for each loop
        int count = 0;
        for(String str : names){
            if (str.length()< 6){
                count++;
                System.out.println("There are " + count + " Strings with lenght less than 6");
            } else {
                System.out.println(" The number of element of the arrayList is superior to limit of 6 ");
            }


        }
    }
}
