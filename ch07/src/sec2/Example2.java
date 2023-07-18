package sec2;

import sec1.Outer;
import sec1.Outer.*;

public class Example2 {
    public static void main(String[] args) {
        Outer out1 = new Outer();
        out1.setItem1(100);
        out1.setItem2("김기태");
        out1.method1();
        System.out.println("=========================================");
        //외부클래스.내부클래스 인스턴스명 = 외부인터스턴스.new 내부생성자함수();
        Outer.Inner in1 = out1.new Inner();
        in1.setItem3(200);
        in1.setItem4("천재");
        in1.method2();
        System.out.println("=========================================");

    }

    //이중 클래스인 Outer.java 안에 있는 Dbl 클래스의 객체를 생성하는 방법
    //out1.db = Dbl클래스 타입의 멤버필드에 위한 생성
    //out1getDbl(); - 메소드 호출에 의한 생성
}
}
