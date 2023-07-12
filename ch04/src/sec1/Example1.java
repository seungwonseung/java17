package sec1;

public class Example1 {
    public static void main(String[] args) {
        int[] a; //선언1 (메모리 할당 x )  타입[] 배열명;
        int b[]; //선언2 (메모리 할당 x )  타입 배열명[];
// 하나의 데이터만 저장하는 것 = primitive type
        int[] c = new int[3]; // 선언과 할당
        int d;

        // System.out.println("a[0]="+a[0]);
        // a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문
        System.out.println("c[0]="+c[0]);
        // System.out.println("d="+d);
        // d는 primitive 타입이므로 반드시 초기화가 필요함

    }
}
