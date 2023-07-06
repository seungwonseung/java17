package sec1;

public class Example2 {
    public static void main(String[] args) {
        //기본 타입 primitive 타입은 표현 범위가 있고, 표현범위가 벗어나면 오류 ;
        // 반드시 초기화, 문자열은 초기화 아지 않아도 괜찮음.
        boolean a = true; //논리형 변수 1(byte)
        byte b = 127; //바이트 변수: -128~127 (1byte)
        char c = 'k'; //문자 변수 (2byte)
        short d = 32767; //반정도정수 : -32768 ~ 32767 (2byte)
        int e = 785367800; //단정도정수 : 4byte
        long f = 7853678000L; //배정도정수 : 4byte ->(+L : 8byte)
        float g = 3.141592f; // f == 실수로 표현할 때 사용, 단정도실수 -> 4byte
        double h = 3.141592; // 배정도실수 : 8byte - 뒷 실수가 늘어날 때 d 붙임.
        double i = 3.1415920000000000d;
        int j =8;
        int k = j+20;

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("i="+i);
        System.out.println("j="+j);

        
        /**
         * 1byte == 256가지의 용량을 저장 가능하지만, 129는 overflow임 <-> underflow, -128~127(byte의 표현범위)
         * 표현범위 : -2의 n-1승 ~ 2의 n-1 승 -1, n == bit 수
         * har는 싱글 코드 ('')[정보표시엔 1bit] => [저장 후엔 2byte]
         * 0 == F or 1 == T (1bit)
         * 1byte = 8bit
         */
    }
}
