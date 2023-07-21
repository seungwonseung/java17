package sec2;

import java.util.*;
import java.util.Map.*;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties(); // key 라는 것이 내장 되어 있음.

        map1.put("no",1/*얘가 누구에여*/);
        map1.put("kor", 100);
        map1.put("eng", 70);
        map1.put("mat", 90);
        System.out.println(map1);
        System.out.println(map1.get("국어점수 : "+"kor"/*key 값을 넣자*/));
        // 값을 중복 가능 but, key는 중복 불가
        if(map1.containsKey("soc")){
            System.out.println("해당키가 존재합니다.");
        }else {
            map1.put("soc", 100);
        }
        if(map1.containsValue("100")){
            System.out.println(("해당 값이 존재 합니다."));
        }else {
            System.out.println("해당 값이 없습니다.");
        }

        //맵의 순회
        for(Entry<String,Integer> entrySet : map1.entrySet()){
            System.out.println(entrySet.getKey()+":"+ entrySet.getValue());
        }

        for(Entry<String, Integer> eSet : map1.entrySet()){
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }

        map2.put("name", "kimgitae");
        map2.put("age", "29");
        map2.put("height", "173.8");
        map2.put("weight","72.4");
        System.out.println(map2);
        if(map2.containsKey("wegiht")){
            map2.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 : "+map2.get("name"));

        //해쉬테이블(HashTable)의 순회
        for(Entry<String, String> eSet : map2.entrySet()){
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }

        map3.put("no", 1);
        map3.put("age", 29);
        map3.put("height", 173);
        map3.put("weight",72);
        System.out.println(map3);
        if(map3.containsKey("wegiht")){
            map3.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }
        System.out.println("이름 : "+map3.get("no"));

        //트리맵(TreeMap)의 순회
        for(Entry<String, Integer> eSet : map3.entrySet()){
            System.out.println(eSet.getKey()+":"+eSet.getValue());
        }

        map4.setProperty("margin","40px");
        map4.setProperty("padding","30px");
        map4.setProperty("width","1200px");
        map4.setProperty("height","50px");
        System.out.println("폭 : "+map4.getProperty("width"));
    }
}
