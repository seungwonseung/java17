package sec2;

import sec1.Shape; //서로 패키지가 다른 경우 임포트, Shape 클래스는 현재 클래스인 Example1 클래스와 다른 패키지인 sec1이 존재하므로
                    //import가 필요함.

//String 클래스와 같이 base 클래스인 경우는 사용자 정의 클래스와 다르게
// java 언어 안에 내장 되어 있으므로 별도의 import가 필요 없음.
public class Example1 {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();

        //클래스명 인스턴스명 = new 생성자함수()
        Shape s1 = new Shape();
        s1.type = "square";
        s1.length = 50;

        double d2 = s1.calcArea();
        System.out.println("현재 도형의 면적은 ? "+s1.area);

        Shape s2 = new Shape("square");
        Shape s3 = new Shape("circle", 20);
    }
}
