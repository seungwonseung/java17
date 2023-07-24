package sec1;


import java.text.SimpleDateFormat; // 표시 형식 지원
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;

public class ApiEx2 {
    public static void main(String[] args) {
        Date now = new Date(); //현재 날짜와 시간
        System.out.println(now);

        //날짜를 String으로 변환
        String strNow = now.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        // String today1 = sdf.format(strNow); 자바8 미만
        String today2 = sdf.format(now); // 자바8 이상
        // System.out.println("문자열에 표시형식 날짜로 표시 : "+today1);
        System.out.println("날짜에 표시형식 날짜로 표시 : "+today2);

        int y = now.getYear() + 1900; // 1900년 기준
        int M = now.getMonth() + 1; // 0부터 시작함
        int d = now.getDate();
        int w = now.getDay(); // 요일
        int h = now.getHours();
        int m = now.getMinutes();
        int s = now.getSeconds();
        System.out.println(y + "년" + M +"월"+ d + "일");
        System.out.println(h + "시" + m + "분" + s + "초");

        //Calender cal = new Calender(); - 자바8 이상은 추상체와 정적 구조로 구성, 별도의 객체를
        Calendar n = Calendar.getInstance();

        //자바8 이상은 LocaleDate을 활용하여 시간대나 지역의 지역성을 나타냄

    }
}

/*
* Locale : 권역(각 권역별로 언어나 통화, 시간 등의 단위가 통일된 지역) == ko
* Timezone : 시간대(국가별로 시간대를 설정한 범위의 이름) == kr
* ko - KR
* en - US*/
