package sec1;

public class GenEx1 {
    public static void main(String[] args) {
        Gen1 g1 = new Gen1();
        g1.method1("신승원");
        //일반 클래스로 만들어진 필드의 값은 오로지 한 타입 밖에 지원되지 않으므로
        // t 필드는 String 이므로 setT()의 저장되는 값은 String으로만 저장해야함.

        //g1.setT(20);
    }
}
