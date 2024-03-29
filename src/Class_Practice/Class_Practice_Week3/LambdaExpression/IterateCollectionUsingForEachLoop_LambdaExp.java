package Class_Practice.Class_Practice_Week3.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class IterateCollectionUsingForEachLoop_LambdaExp {

    /*
    import java.util.*;
public class Example{
    public static void main(String[] args) {
       List<String> list=new ArrayList<String>();
       list.add("Rick");
       list.add("Negan");
       list.add("Daryl");
       list.add("Glenn");
       list.add("Carl");
       list.forEach(
           // lambda expression
           (names)->System.out.println(names)
       );
    }
}
     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        list.forEach(
                // lambda expression
                (names)->System.out.println(names)
        );
    }

}
