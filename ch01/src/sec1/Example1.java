package sec1;

public class Example1 {
    public static void main(String[] args) {
        int a; // 변수 선언
        a = 0; // 변수 초기화
        int b=0; // 변수 선언 및 초기화
        int i=0, j=0, k=0; // 한 번에 선언 및 초기화
        a = a;   i = a + 20;  j = a - 20;
        System.out.println("a="+a); // 한 줄에 값 출력
        System.out.print("i="+i+"\n"); // 한 줄에 여러 번 출력 및 줄바꿈
        System.out.printf("j =%d", j);
        /**기억저장소의 이름 = 변수 (JAVA는 데이터 타입에 따라 선언을 해야함 [변수선언]
         * println = 한 줄에 값 출력
         * print = 한 줄에 여러 값 출력 가능
         *
         * "\n" 줄바꿈
         * %d = 정수, %s
         */
    }
}
