package sec1;

import java.util.Date;

public class Example5 {
    public static void main(String[] args) {
        Date birth = new Date(); // shift + ent
        System.out.println(birth);
        System.out.println("확인 1 : "+(birth instanceof Date));

        //삼항 연산자 : 조건 ? 참 : 거짓
        int point = 84;
        //조건                      만족할 때 : 만족하지 않을 때
        String pan = point >= 80 ? "합격" : "불합격";
        System.out.println("판정 : "+pan);
    }
}
