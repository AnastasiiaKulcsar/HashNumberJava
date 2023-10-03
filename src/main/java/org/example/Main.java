package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("3092424584258", "Ruslan");

        phoneNumbers.put("30924grg24584258", "Arzn");
        phoneNumbers.put("309242gdg4584258", "Ruslan");
        phoneNumbers.put("309242458gd4258", "Ruslan");

       /* for (String s : phoneNumbers.keySet()) {
            System.out.println(s);
        }
*/
        System.out.println("30924grg24584258".hashCode());
        System.out.println(phoneNumbers.get("309242gdg4584258"));
      /* Map<Integer, Integer> numbers = Map.of(1, 2, 3,4, 5, 6);
       for (Map.Entry<String, String> entry : phoneNumbers.entrySet()) {
            System.out.println(entry);
        }
*/
    }

}