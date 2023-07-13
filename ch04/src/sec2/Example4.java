package sec2;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        String code = "970324-1278000"; //0부터 시작
        char m = code.charAt(7); // 특정 인덱스에 있는 문자 반환
        String gender = (m=='1' || m=='3') ? "남" : "여";
        //특정 번째(begin index) 부터 특정 번째 전까지 추출
        String yy = code.substring(0,2); // 괄호 안엔 인수
        String mm = code.substring(2,4); // 괄호 안엔 인수
        String dd = code.substring(4,6); // 괄호 안엔 인수

        System.out.println("성별 코드 : "+m);
        System.out.println("성별 : "+gender);
        //생일 97-03-24
        System.out.println("생년월일 : "+(yy+"-"+mm+"-"+dd));

        String nick = "ShinGseUNgWon";

        int idx = nick.indexOf('g'); //해당 문자의 인덱스를 반환
        System.out.println("g의 문자 인덱스 값 : "+idx);

        idx = nick.indexOf('s'); //해당 문자의 인덱스를 반환
        System.out.println("g의 문자 인덱스 값 : "+idx);

        idx = nick.lastIndexOf('s'); //마지막에서 부터 찾은
        System.out.println("s의 마지막 찾은 경우의 인덱스 값 : "+idx);

        String name1 = nick + "master"; //문자열 결합 연산
        String name2 = nick.concat("master"); //문자열 결합 연산

        //문자열을 문자배열로 : toChaeArray()
        //문자열을 바이트배열로 : getBytes()
        char[] nArr = nick.toCharArray();  //문자열을 => 문자배열로 (s h i n g s e u n g w o n으로 분리됨)
        byte[] bArr = nick.getBytes();     //아스키코드 값이 출력됨 (유니코드값)

        int age = 27;
        float ht = 176.1f;
        boolean ps = true;

        System.out.println("@ 2번째 : "+nArr[2]);
        System.out.println("# 2번째 : "+bArr[2]);

        //특정 타입의 데이터를 문자열로 변환 - valueOf()
        String val1 = String.valueOf(age); //정수 -> 문자열로 변환.
        String val2 = String.valueOf(ht); //실수 -> 문자열로 변환.
        String val3 = String.valueOf(ps); //불 -> 문자열로 변환.


        if(val1.equals("27")) System.out.println("문자열 변환 성공");

        //대문자로(.toUpperCase) / 소문자로(.toLowerCase)
        System.out.println("대문자로 변환 : "+nick.toUpperCase());
        System.out.println("소문자로 변환 : "+nick.toLowerCase());

        //해당 특정 문자를 찾아 바꾸기 = replace(찾는 문자, 바꿀 문자)
        String nick2 = nick.replace('s','t');
        System.out.println("바뀐 값 : "+nick2); // 영문 대소문자를 구분 하기 때문에 대소문자를 잘 구별해서 입력.


        String haha1 = "신승원/신슴원/신송원/신싱원/신성원/신송원";
        String haha2 = "승원1-승원2/승원3-승원4/승원5-승원6";

        //문자열 배열을 특정 구분자로 요소 분리 = split
        String[] stArr1 = haha1.split("/");
        String[] stArr2 = haha2.split("/|-");

        // 문자열 배열을 읽어줌. Arrays.toString(문자열배열)
        System.out.println(Arrays.toString(stArr1)); //알트 엔터
        System.out.println(Arrays.toString(stArr2)); // '|'(or)는 연산자로 구분을 할 수 없음.


        String data1 = "       shin             ";
        String data2 = "shin                    ";
        String data3 = "      shing";

        System.out.println("글자수1 : "+data1.length()); //함수나 메소드는 뒤에 () 들어감
        System.out.println("글자수2 : "+data2.length());
        System.out.println("글자수3 : "+data3.length());


        String trans1 = data1.trim(); //공백 제거 할 때 사용
        String trans2 = data2.trim(); //공백 제거 할 때 사용
        String trans3 = data3.trim(); //공백 제거 할 때 사용

        System.out.println("글자수1 : "+trans1.length());
        System.out.println("글자수2 : "+trans2.length());
        System.out.println("글자수3 : "+trans3.length());

    }
}
