package sec1;

public class Shape {
    //member field, member method, 생성자, 상수
//----------------------------------------------------------------------------------
    public String type;
    public int length;
    public double area;
//접근 제한자 : public > protected > default(생략) > private
//public : 어떤 패키지에서도 접근할 수 있음.
//default : 같은 패키지 내에서만 접근 가능.
//private : 현재 클래스 내부에서만 접근할 수 있음.


    //생성자 함수는 클래스 이름이랑 같아야함
    //반드시 멤버 필드는 private를 거는 것이 보통임.
//------------------------------------------------------------------------------------------------------------------
//
    public Shape(){};
    public Shape(String type){
        this.type = type;  //this = 현재 클래스 내부
    }
    public Shape(String type, int length){
        this.type = type;
        this.length = length;

    }
    //멤버 메소드 ----------------------------------------------------------------------------------------
    //명령 (행위) 는 메소드로 만듬
    //     반환타입
    public double calcArea(){
        if(this.type.equals("square")){
            this.area = this.length * this.length;
        } else if(this.type.equals("triangle")){
            this.area = this.length * 10 / 2;
        } else if(this.type.equals("circle")){
            this.area = this.length * this.length * 3.14159;
        } else {
            this.area = 0.0f;
        }
        return area;
    }//---------------------------------------------------------------------------------------------------
    //setter, 앞은 소문자, 그 뒤는 대문자로 시작 setMethod 값
    public void setType(String type){
        this.type = type;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
//-----------------------------------------------------------------------------------------------------
