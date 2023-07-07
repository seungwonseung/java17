package sec1;

public class Example4 {
    public static void main(String[] args) {
        // 32 16 8 4 2 1
        //  0  1 0 1 0 0 == 20
        //  0  0 1 1 1 0 == 14

        int a = 20;
        int b = 14;

        //비트연산
        System.out.println("/n"+"+a & b :"+(a&b)); // 0 0 1 0 0 입력이 모두 1이어야 함. == 4
        System.out.println("a | b :"+(a|b)); // 11110 == 30
        System.out.println(" ~a :"+(~a)); // 배치 상 반대의 배치가 나옴 ( 보수 ) 각 자리가 9가 나오게 해야함.
        System.out.println("a ^ b :"+(a^b)); //11010 같으면 0 다르면 1
        System.out.println("a >> 2 : "+(a>>2)); // 시프트 연산 나누기 시프트 레지스터 오나 왼곱 2중도 있음.(<<<은 없음)
    }
}
