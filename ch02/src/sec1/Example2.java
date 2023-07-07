package sec1;

public class Example2 {
    public static void main(String[] args) {
        //대입연산 : [ =, +=, -=, /=, *= ]
        int su = 0;

        su+=10; // su = su + 10;
        System.out.println("su+=10 => "+su);

        su-=5; // su = su - 5
        System.out.println("su-=5 => "+su);

        su*=10; // su = su * 10
        System.out.println("su*=10 => "+su);

        float num = 0.0f;
        int su2 = su;

        su/=4;
        /* 중요 : 정수 나누기 정수이 결과는 정수로 자동 형변환 */
        num = su2 / 4.0f;
        // num = (float) su2 / 4;  // su = su / 4
        System.out.println("su*=/4 => "+su);
        System.out.println("su*=/4 => "+num);


        //증감연산 : [ ++, -- ]등의 전위와 후위 존재.
        int a = 10, b = 10;
        //a=a+1 , a+=1, a++, ++a
        System.out.printf("\na++의 결과 : %d\n", a++); // 후위 연산
        System.out.println("나중 출력 : "+a+"\n");

        System.out.printf("++b의 결과 : %d\n", ++b); // 전위 연산
        System.out.println("나중 출력 : "+b+"\n");

        System.out.printf("b--의 결과 : %d\n", b--); //후위 연산
        System.out.println("b의 나중 값 : "+b+"\n");

        System.out.printf("a--의 결과 : %d\n", --a);
        System.out.println("a의 나중 값 : "+a+"\n");

    }
}
