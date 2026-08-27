package code;

import java.util.HashMap;

public class hashMap {
    static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("rakheeb",8);
        map.put("ashu",7);
        map.put("sarhan",6);

        System.out.println(map.get("rakheeb"));
        System.out.println(map.remove("ashu"));
    }
}
