package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1 = new TreeSet();

        //데이터 중복 x, 순서 유지 x
        Set<String> set2 = new HashSet<>();
        set2.add("이은영");
        set2.add("최상민");
        set2.add("김이호");
        set2.add("이슬비");
        set2.add("김이호");
        set2.add("이은영");

        //set은 순번이 없기 때문에 for 반복문 사용 불가능
        Iterator it = set2.iterator(); // 분리자
        System.out.println("Set 결과");
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //데이터 중복 o, 순서 유지 o
        List<String> ls2 = new ArrayList<>();
        set2.add("이은영");
        set2.add("최상민");
        set2.add("김이호");
        set2.add("이슬비");
        set2.add("김이호");
        set2.add("이은영");
        System.out.println("리스트 결과");
        for(String d:ls2){
            System.out.println(d);
        }

    }
}
