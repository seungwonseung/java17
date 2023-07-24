// 달력만들기
package sec1;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;

public class Makecal {
    public static void main(String[] args) {
        //사용자 데이터 입력 받음.
        Scanner scan = new Scanner(System.in);
        System.out.println("년도를 입력하시오 : ");
        int year = scan.nextInt();

        System.out.println("월을 입력하시오 : ");
        int month = scan.nextInt();

        //Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);

        //해당 달의 마지막 일자
        int lastDay = calendar.getActualMaximum(Calendar.DATE);

        // 시작 요일 얻기
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(year + "년" + month + "월" + "\n");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        calendar.set(year, month - 1, 1);

        //현재 일
        int currentDay = 1;

        //반복문을 통해 달력 출력
        for (int i = 0; i < 43; i++) {
            if (i < startDay) {
                System.out.println("\t");
            } else {
                System.out.printf("%02d\t", currentDay); //% : 명령의 시작, 0 : 채워지는 문자, 2 : 총 자릿 수, d : 10진수
                currentDay++;
            }

            if (i % 7 == 0) {
                System.out.println();
            }

            if (currentDay > lastDay) {
                break;
            }


        }
    }
}
