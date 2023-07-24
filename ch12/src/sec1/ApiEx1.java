package sec1;

public class ApiEx1 {
    public static void main(String[] args) {
        /*
        java.lang 패키지 : 별도의 import 과정이 필요없는 기본 클래스

        * Object : 자바에서 최상위 클래스
          System : 기본 입출력(키보드 입력, 모니터 출력), JVM 동작 제어
          Class  : (Class.forName) 외부 라이브러리의 특정 클래스를 로딩
          String : 문자열을 다루기 위한 클래스
          StringBuffer/StringBuilder : 문자열을 조작(분리/합치기/구조변환) 클래스
          Math : 수학/삼각을 위한 처리 클래스
          Wrapper : Character, Byte, Short, Integer, Long, Float, Double,
          Boolean 등으로 구성되어 있으며, Primitive Type은 멤버를 가질 수 없으므로,
          Reference Type인 해당 Wrapper를 활용하여 메서드를 활용할 수 있음.
          */
        int a = 1004; //Primitive Type
        Integer b = 1004; //Wrapper Type

        int a1 = b; //UnBoxing : 원래 b는 Wrapper Type이었으나, Primitive 타입으로 바꾸는 과정
        Integer b1 = a; //Boxing : Primitive -> Wrapper

        String val1 = "1004";
        //int val2 = Integer.parseInt(val1); // 문자열을 정수형으로 변환 parseInt()
        boolean res = isInteger(val1);
        System.out.println("변환 가능한 숫자인지 판단 : "+res);
        if(res){
            int val2 = Integer.parseInt(val1);
            System.out.println("결과값 : "+val2);
        }


        String val3 = "365.24781";
        res = isDouble(val3);
        System.out.println("변환 가능한 숫자인지 판단 : "+res);
        if (res) {
            Double val4 = Double.parseDouble(val3);
            System.out.println("결과값 : "+val4);
        }

    }
    public static Boolean isInteger(String val1){
        try{
            Integer.parseInt(val1);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static Boolean isDouble(String val3){
        try{
            Double.parseDouble(val3);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
