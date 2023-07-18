package sec2;

import sec1.Student;

public class StudentEx1 {
    public static void main(String[] args) {
        Student st1 = new Student();

        //메소드1 , 리턴x, 매개변수x
        st1.method1(/*매개변수*/);

        //메소드2 , 리턴 o, 매개변수 x
        int a = st1.method2();
        System.out.println(a);
        System.out.println(st1.method2());

        //메소드3
        st1.method3(1004);

        //메소드4
        int b = st1.method4(1004);
        System.out.println(b);
        System.out.println(st1.method4(1004));
    }
}
