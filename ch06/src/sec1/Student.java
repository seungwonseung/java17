package sec1;

public class Student {
    // 필드
    private int no;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    //접근제한자 반환타입 메서드명([타입 매개변수]){return 해당 반환 타입 데이터값 or 변수} 메소드의 기본형

    //1. 리턴X(void), 매개변수X
    public void method1(){
        System.out.println("메드1");
    }

    //2. 리턴 O, 매개변수X
    public int method2(){
        int a = 1004;
        return a;
    }

    //3. 리턴 없, 매개변수 있
    public void method3(int a){
        System.out.println("당신은 "+a);
    }

    //4. 리턴 있, 매개변수 있
    public int method4(int a){
        return a*a;
    }
}
