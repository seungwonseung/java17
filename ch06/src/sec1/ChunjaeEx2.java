package sec1;

import sec1.Chunjae;
public class ChunjaeEx2 {
    public static void main(String[] args) {
        Chunjae c1 = new Chunjae();

        c1.partno = 1234;
        c1.point = 200;
        c1.name = "김기태";
        System.out.println(Chunjae.PI * 20 * 20);

        Seungwon s1 = new Seungwon();

        int[] k = new int[100];

        Seungwon[] s = new Seungwon[10]; //객체 배열 s[0], s[1] ~ s[9]
        //s[0].num ~ s[9].num
        //s[0].data ~ s[9].data

        for(int a=0; a<s.length; a++) {//객체의 배열은 원ㄴ소를 재생성해야함.
            s[a] = new Seungwon();
            s[a].setNum(a + 1);
            s[a].setData("승원"+(a+1));
        }

        for(int a=0; a<s.length;a++){
            System.out.println(s[a].getNum());
            System.out.println(s[a].getData());
            System.out.println("========================================");
        }
    }

}
