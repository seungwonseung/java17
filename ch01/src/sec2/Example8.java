package sec2;


public class Example8 {
    public static void main(String[] args) {
        String name = "신승원";
        int age = 27;
        double wt = 82;
        System.out.print("이름 :"+name+"\n나이 : "+age+"\n체중 :"+wt); // 줄바꿈 하려면 "\n" 써야함.
        System.out.print("\n출력문 예시2\n ");
        System.out.println("이름 : \""+name+"\" \t나이 : \'"+age+"\' \t체중 : "+wt);
        System.out.println("출력문 예시3");
        System.out.printf("이름 : \"%s\",\t나이 : \'%d\',\t체중 : %3.2f",
                name, age, wt);
        int num1 = 127;
        //System.out.println("", num1); //이진수는 출력 형식 문자가 없다.
        /*
        * %b: 2진수
        * %o: 8진수
        * %x: 16진수 -> 파이썬, C언어
        * 각 진수에 해당하는 숫자를 문자열로 바꾸게 됨으로 나중에 숫자로 변환하면,
        * 그 숫자 그대로 10진수 표기함. 그러므로 절대 바꾼 데이터는 연산을 하지 않도록 해야함.*/


        String bin = Integer.toBinaryString(num1); // 이진수로 바꿔서 문자로 저장
        String oct = Integer.toOctalString(num1); // 8진수로 바꿔서 문자로 저장
        String hex = Integer.toHexString(num1); // 16진수로 바꿔서 문자로 저장
        System.out.println("\n2진수 : "+bin);
        System.out.println("\n8진수 : "+oct);
        System.out.println("\n16진수 : "+hex);
        System.out.println("\n10진수 : "+num1);

        int b1 = 0b101111;
        int o1 = 0746;
        int x1 = 0x4fc;

        //int k = Integer.parseInt(bin) + Integer.parseInt(oct) + Integer.parseInt(hex);
        //System.out.println("더한 결과1 : " +k);
        //System.out.println(Integer.parseInt()); - 정수로 바꿔줌.

        System.out.println("b1="+b1);
        System.out.println("o1="+o1);
        System.out.println("x1="+x1);

        int j = b1 + o1 + x1;
        System.out.println("j");

    }
}
