package sec1;

public class Example2 {
    public static void main(String[] args) {
        int[] a = {90, 75, 80, 85};//선언과 초기화를 동시에
        int b[] = {85, 100, 70, 90};

        int[] c = new int[4]; // 공간을 미리 만듬
        c[0] = 100; // 데이터 제공
        c[1] = 100;
        c[2] = 100;
        c[3] = 100;
        //c[4] = 100;

        int[] d;   //선언만
        d = new int[]{90, 80, 85, 60}; //할당과 초기화 동시 진행
        d[4] = 100; // 추가 할당시에는 오류가 없으나 실제 할당은 되지 못하여 오류 발생

        for (int i = 0; i < a.length; i++) {
            System.out.println(i + "번째 데이터 : " + a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + "번째 데이터 : " + b[i]);
        }
        for (int p : c) { //p <= c[0] , c[1], c[2] ...
            System.out.println(p);
        }
        for (int p : d){
            System.out.println(p);
        }
    }
}
// Exception = 실행 오류 에러 <-> Syntax = 문법 오류 (예외처리)
// Index 4 out of bounds for length 4 = 인덱스와 array가 맞지 않음.