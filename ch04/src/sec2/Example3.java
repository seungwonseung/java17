package sec2;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        Date today = new Date();
        //new = 객체 생성
        String data1 = "2023-07-13"; //기본 변수 타임
        String data2 = new String("2023-07-13"); //레퍼런스 타입 - 힙의 주소값만 나옴
        //equals == 힙 안의 데이터를 가져와서 비교함.

        if(data1 == data2)System.out.println("서로 같음");
        else System.out.println("서로 다름");
        //문자열과 객체 타입은 값이 같다고 하더라도 등호(==)로 비교할 수 없으므로
        //값 비교를 위해서는 equals()를 사용하여 비교하여야 함.
        if(data1.equals(data2))System.out.println("서로 같음");
        else System.out.println("서로 다름");


        //코드설계
        String info = "";
        String name = "신승원";
        int age = 43;
        float ht = 176.1f;

        //숫자에 문자 하나라도 더하기가 되면 문자열로 변환됨.
        info = name + age + ht;
        System.out.println("info="+info);

    }
}
