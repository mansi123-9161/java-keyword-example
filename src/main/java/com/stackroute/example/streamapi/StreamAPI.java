package com.stackroute.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPI {
    //2 TYPE OF METHOD intermediate and terminate in stream
   // once you use values you cant reuse it
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,10,23);
//        int result=0;
//        for(int i:list) {
//            result = result + i;
//        }
//        System.out.println(result);
        //convert collection to stream
        //stream is interface
        //we can apply lambda here
        Function<Integer,Integer> f=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i*2;
            }
        };
        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i, Integer j) {

                return i+j;
            }
        };
        System.out.println(list.stream().map(i->i*2).reduce(0,(i,j)->i+j));
        //more method sum of Integer object
        System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c,e)));
        //first convert list value into stream
       // Stream s=list.stream();
        //map takes object value
       // s.map(f);
      // int s2= (int) s.reduce(0,b);
      // s.forEach(System.out::println);
       //add who are divisble by 5
        System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->c+e));
        System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());
        //in case we dont find any value
        System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));
    }
}
