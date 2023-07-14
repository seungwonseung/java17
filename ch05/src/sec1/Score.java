package sec1;
//추가 클래스를 적을 수 있지만 메인 클래스가 public이 걸려있어야함.
public class Score {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Score(){}
    //
    public Score(int num) {
        this.num = num;
    }

    public Score(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public Score(int num, String name, int kor) {
        this.num = num;
        this.name = name;
        this.kor = kor;
    }

    public Score(int num, String name, int kor, int eng) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public Score(int num, String name, int kor, int eng, int mat) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
}

