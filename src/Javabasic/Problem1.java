package Javabasic;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
        String s= "My name is Gourav Vashistha";
        Map<Character, Integer> map= new HashMap<>();

        for(char c: s.toCharArray()) {
            if(c != ' ' && !map.containsKey(c)){Integer put = map.put(c, 1);}
            else if(c != ' '){map.put(c, map.get(c) + 1);}
        }

        map.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.printf("->%n", e.getKey(), e.getValue()));

    }
}
