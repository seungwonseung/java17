package sec2;

import sec1.Qna;

public class Example4 {
    public static void main(String[] args) {
        Qna q1 = new Qna();
        q1.setTitle(Qna.DUMMY); //먼저 셋팅을 하고
        System.out.println(q1.getTitle()); //출력

        Qna q2 = new Qna();
        q2.setTitle(Qna.DUMMY); //먼저 셋팅을 하고
        System.out.println(q2.getTitle()); //출력
    }
}
