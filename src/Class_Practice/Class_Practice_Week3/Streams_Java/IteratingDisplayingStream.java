package Class_Practice.Class_Practice_Week3.Streams_Java;

import java.util.stream.Stream;

public class IteratingDisplayingStream {

         /*
         import java.util.stream.*;
public class Example {
    public static void main(String[] args){
        Stream.iterate(1, count->count+1)
        .filter(number->number%3==0)
        .limit(6)
        .forEach(System.out::println);
    }
}
          */

    public static void main(String[] args) {
        Stream.iterate(1, count->count+1)
                .filter(number->number%3==0)
                .limit(6)
                .forEach(System.out::println);
    }
}
