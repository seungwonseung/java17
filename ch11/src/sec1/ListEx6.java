package sec1;

import java.util.LinkedList;
import java.util.List;

public class ListEx6 {
    public static void main(String[] args) {
        List<Student> s = new LinkedList<>();

        s.add(new Student(1, "백준철", 10));
        s.add(new Student(2, "박진원", 9));
        s.add(new Student(3, "오세훈", 8));
        s.add(new Student(4, "신승원", 7));

        for(int i=0; i<s.size(); i++){
            Student a = s.get(i);
            System.out.println(a.sno+"\t"+a.sname+"\t"+a.point);
        }
        //List와 LinkedList의 차이
        //일반적인 속도는 LinkedList가 이전 포인터와 다음 포인터가 있어 검색은 훨씬 빠르지만
        //중간 삭제 또는 삽입 시에는 List가 더 빠름.
        //검색력 강화 - LinkedList , 검색량이 많고 삭제 삽입이 빈번함 - List
    }
}
