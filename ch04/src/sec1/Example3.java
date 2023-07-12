package sec1;

public class Example3 {
    public static String[] add(String[] originArr, String txt) { //함수1
        String[] newArr = new String[originArr.length + 1]; //새로운 배열은 원래 배열의 데이터에서 하나 더 증가
        for (int i = 0; i < originArr.length; i++) { // 원래 배열데이터를 새로운 배열에 전달하여 복제
            newArr[i] = originArr[i];
        }
        newArr[originArr.length] = txt; //추가되는 원소를 txt 변수로 입력받아 새로운 원소로 추가
        return newArr;
    }

    public static String[] remove(String[] originArr) {  //함수2
        String[] newArr = new String[originArr.length - 1];
        for(int i=0;i<originArr.length-1;i++){
            newArr[i] = originArr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        //원소 추가 요청
        String[] originArr = {"김", "박", "이", "오", "서"}; //원래 데이터
        //originArr = new String[]{"신", "우", "김", "어"} - 값을 재초기화를 한꺼번에 할 수는 있으나
        //originArr[5] = "한선"; //추가할 수 없음
        originArr = add(originArr, "한선" );
        //함수를 호출할 때 원래 배열과 추가 데이터를 같이 대입
        originArr = add(originArr,"이슬비");
        for(String s:originArr){
            System.out.println(s);
        }
        System.out.println("---------------------------------");
        originArr = remove(originArr); // 제거 함수를 호출하여 원래 배열을 대입
        for(String s:originArr){
            System.out.println(s);
        }

    }
}

