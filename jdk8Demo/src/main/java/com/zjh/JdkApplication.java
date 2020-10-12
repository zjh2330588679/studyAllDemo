package com.zjh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zjh
 * @create 2020-07-24 17:17
 */
public class JdkApplication {
    public static void main(String[] args) {
        //foreach
        /*Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);*/
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> collect = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
