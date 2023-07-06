package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        //byte b2 = -129; 해당 표현범위보다 작음(언더플로우)
        //byte b3 = 128; 해당 표현범위보다 크면(오버플로우)

        char c1 = 'k';
        //char c2 = -1; 언더플로우
        //char c3 = 65536; 오버플로우

        short d1 = 1;
        short d2 = 2;//언더플로우
        short d3 = 3;//오버플로우

        long e1 = 2;
        long e2 = 2;//언더플로우
        long e3 = 3;//오버플로우

        float f1 = 3;
        float f2 = 2;//언더플로우
        float f3 = 3;//오버플로우

        int g1 = 1;
        int g2 = 2;//언더플로우
        int g3 = 2;//오버플로우

    }
}
