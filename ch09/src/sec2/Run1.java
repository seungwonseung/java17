package sec2;
//Runnable : 실행 가능한 객체를 만들기 위한 인터페이스 =>
// 사용자가 상속받아 새로운 클래스 생성하여 활용
class SBRunnable implements Runnable {
    @Override // 싱글 쓰레드
    public void run() {
        String[] str = {"오세훈", "신예은", "여은영", "서광", "신승원", "너굴맨"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //출석을 부르기
        for(String name:str){
            System.out.println("출석체크 : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//public class Run1 {
    //public static void main(String[] args) {
        //Runnable sbRun1; //선언부
        //sbRun1 = new SBRunnable(); //생성부
        //Thread t1 = new Thread(sbRun1);
        //t1.start(); //start() 하면 알아서 run()이 됨.

   // }
//}

class SCRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"팀1", "팀2", "팀3", "팀4", "팀5", "팀6"};
        try {
            Thread.sleep(500); //대기 시간
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //퇴실체크
        for(String name:str) {
            System.out.println("퇴실체크 : " + name);
            try {
                Thread.sleep(1500); //내부 대기 시간
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Run1{
    public static void main(String[] args) {
        Runnable sbRun1;
        sbRun1 = new SBRunnable();
        Thread t1 = new Thread(sbRun1);
        t1.start();

        sbRun1 = new SCRunnable();
        Thread t2 = new Thread(sbRun1);
        t2.start();
    }
}