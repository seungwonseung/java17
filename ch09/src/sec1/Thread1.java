package sec1;
//쓰레드
public class Thread1 {
    public static void main(String[] args) {
        int[] arr = {95, 60, 85, 70, 90, 80};
        String[] str = {"김기태", "이슬비", "박나연", "박진원", "오태훈", "신승원"};
        for(int i=0;i<arr.length;i++){
            System.out.println("이름 :"+str[i]);
            //전체 Single Thread, Thread는 6개
            try {
                Thread.sleep(1000);
                //대기 시간 부여하고, 지정한 밀리초 만큼 Wait되며,
                //그 시간이 지나면 자동으로 Wake Up 된다.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
