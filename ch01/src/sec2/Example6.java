package sec2;

public class Example6 {
    public static void main(String[] args) {
        int a = 100; // 100 = 2진수
        int b = 0b100; // 0b = 2진수, 실제 연산과 논리연산 등을 수행
        int c = 0100; // 0 == 8진수, 권한 부여 및 수행 또는 회수
        int d = 0x100; // 0x == 16진수, 실제 물리적 주소 또는 메모리 주소
        // 물리적주소 == 맥 어드레스(mac address)
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);

    }
}
