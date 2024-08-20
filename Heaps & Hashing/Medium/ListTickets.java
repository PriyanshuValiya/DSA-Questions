// https://www.geeksforgeeks.org/find-itinerary-from-a-given-list-of-tickets

import java.util.*;

public class ListTickets {
    public static String getStart(HashMap<String, String> map) {
        HashMap<String, String> temp = new HashMap<>();

        for(String str : map.keySet()) {
            temp.put(map.get(str), str);
        }

        for(String str : map.keySet()) {
            if(!temp.containsKey(str)) {
                return str;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Chennai", "Banglore");
        map.put("Bombay", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);

        System.out.print(start);

        for(String str : map.keySet()) {
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }
    }
}
