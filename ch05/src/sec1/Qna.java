package sec1;

//Board 클래스를 상속 받아서 만듦
public class Qna extends Board{
    public static final String DUMMY = "테스트글제목";

    private int level;
    private int parno;


    public Qna() {super();}

    public Qna(int no) {
        super(1);
    }

    //생성자
    //get 받아서 내보냄 , set 정보를 받아옴.

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }

    @Override
    public void method2() {
        System.out.println("Qna입니다.");
    }
}
