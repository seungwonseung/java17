package sec2;

import java.util.List;

public class Multi4 {
    public void method1(List<?> lst) {
        //뭐가 오던 상관 없을 땐 <?> = 와일드 카드
        for(Object obj : lst){
            System.out.println(obj + "\t");
        }
    }

    public int method2(List<? extends Number> lst){ // 목록의 합계
        //                   지정 클래스의 이하.
        int hap = 0;
        for(Number i:lst){
            hap += i.doubleValue();
        }
        return hap;
    }
    public List<? super Integer> method3(List<? super Integer> lst){
        for(int i=0; i<5; i++){
            lst.add(i);
        }
        return lst;
    }

}
