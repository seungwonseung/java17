package sec1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//과정관리 프로그램
class Course {
    public int cno; // 과정번호
    public String cname;
    public int cprice; // 수강료
    public double ctime; // 코스 기간
}
public class ListEx4 {
    static List<Course> cList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true; //작업 상태 지속(true), 종료(false)
        int i = 0; //과정 수
        while(ck){
            System.out.println("작업번호[1-6]:");
            int num = sc.nextInt();
            switch(num) {
                case1:
                    i++;
                    System.out.println("과정등록\n");
                 Course c = new Course();
                c.cno = i;
                c.cname = sc.nextLine(); //String 일 때
                System.out.println("단가");
                c.cprice = sc.nextInt();
                System.out.println("소요시간");
                c.ctime = sc.nextDouble();
                cList.add(c)
                break;

                case2:
                System.out.println("과정 검색\n");
                System.out.println("검색할 과정 번호 : ");
                int no = sc.nextInt();
                if(no<=num){
                    Course co = cList.get(i);
                    System.out.println("과정번호 : "+ co.cno);
                    System.out.println("과정이름 : "+co.cname);
                    System.out.println("과정단가 : "+co.cname);
                    System.out.println("소요시간 : "+co.cname);

                case3:

                case4:

                case5:

                case6:
                }

            }
        }
    }
}
