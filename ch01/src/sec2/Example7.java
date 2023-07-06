package sec2;

public class Example7 {
    public static void main(String[] args) {
        //byte(1)<char(2)<short(2)<int(4)<long(8)
        //float(4)<double(8)

        //자동형변환(auto casting) : 해당 타입에서 크기가 같거나 더 큰 타입에 대입되었을 때 발생.
        int data1 = 1004;
        float data2 = data1;
        System.out.println("data1="+data1);
        System.out.println("data2="+data2);

        char data3 = 'K';
        int data4 = data3;
//아스키코드
        System.out.println("data3="+data3);
        System.out.println("data4="+data4); // 유니코드번호 65352를 넘지 않음.

        int data5 = 2048;
        byte data6 = (byte) data5; // (byte) 높은 바이트에서 낮은 바이트로 형변환 시 대신 알 수 없는 데이터로 바뀜 - 강제 형변환

        System.out.println("data5="+data5);
        System.out.println("data6="+data6);

    }
}
