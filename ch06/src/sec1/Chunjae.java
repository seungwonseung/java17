package sec1;

class Sunhwa{ //constructor
    private int seq;
    private int date;

    public Sunhwa(){
        this(1);
    }
    public Sunhwa(int seq){
        this(seq, 23);
    }
    public Sunhwa(int seq, int date){
        this.seq = seq; this.date = date;
    }
}
class Seungwon{ // getter, setter
    private int num = 1;
    private String data = "신승원";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
public class Chunjae {
    //멤버 필드 = 멤버 변수 , 멤버 상수
    private int no;
    protected int point;
    int partno;
    public String name;
    public final static double PI = 3.141592; //상수

    public void setValue(int no){ //private 메머는
        this.no = no;
    }
}
//public 클래스는 클래스에 단 하나
//get = 필드에 저장된 값을 가져오는 목적
//set = 저장하는 목적