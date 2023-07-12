package sec2;

public class Example4 {
    public static void main(String[] args) {
        // 달력 만들기
        //int c = 1;
        //for(int a=1; a<=5; a++){
            //for(int b=1; b<=7; b++){
            //    System.out.print(c+++"\t");
           // }
           // System.out.print("\n");
       // }

//        //for( int a=1; a<=5; a++){
//           // for(int b=0; b<a; b++){
//             //   System.out.print("*");
//           // }
//           // System.out.print("\n");
//        //}
//
//        for( int i=5; i>=1; i--) {
//            for(int b=0; b<i; b++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        for( int j=1; j<=9; j++){
            for( int i=2; i<=9; i++){
                System.out.printf("%d x %d = %d\t", i, j, i*j);
            }
            System.out.print("\n");
        }


    }
}
