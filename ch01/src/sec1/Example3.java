package sec1;

public class Example3 {
    /**
     * 변수명 규칙
     * 1. 영문 소문자로 표시
     * 2. 변수에 예약어는 사용할 수 없음
     * 3. 변수명 중간에 공백을 사용할 수 없음
     * 4. 시작시 $ 또는 _(언더스코어)로 시작할 수 있음.
     * 5. 대문자와 소문자가 서로 엄격히 다름. (linux - 영어 대소문자 구분, window - 영어 대소문자 구분 안 함.)
     *
     * 관례
     * 1. 변수가 어떠한 역할을 하는지 누구나 쉽게 알 수 있도록
     * 2. 여러 단어로 변수명을 정할 경우
     * - 스네이크(파스칼케이스) 방식 또는 카멜방식으로 연결함.
     * ex1) chunjaeitcenter => chunjae_it_center [스네이크방식] - python 선호
     * ex2) chunjaeitcenter => chunjaeItCenter [카멜방식] - java 선호
     * 3. 어떠한 경우라도 개발기준서를 기준으로 접두어나 접두사를 붙여 정함.
     * ex1) 단순 데이터 저장일 경우 - 해당 변수는 모두 set으로 시작 == setKim
     */
    int a, a1, $a, _a;
    //int Aa; - 대문자로 시작 X
    // int k*j - 연산자 변수 X
    // int 1a - 숫자로 시작 X
    // int a b; - 변수명 중간에 띄어쓰기 X
    // int class; - 예약어 변수명으로 사용 X


}
