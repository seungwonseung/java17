package sec1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int su;
        try {
            System.out.println("숫자입력 : ");
            su = sc.nextInt();
        } catch(InputMismatchException e){
            System.out.println("문자 입력함. 숫자로 입력해야함.");
        } catch (Exception e){
            System.out.println("원인 불명");
            e.printStackTrace();
        }
    }
}
