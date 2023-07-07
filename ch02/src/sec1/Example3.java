package sec1;

public class Example3 {
    public static void main(String[] args) {
            /*관계 연산 [ ==(일치/-이다), !=(불일치/-아니다), >(초과/후)
             >=(이상/이후), <(미만/전), <=(이하/이전)*/
        int su1 = 90;
        int su2 = 85;
        int su3 = 88;


        //논리연산 : and(&&), or(||), not(!)
        System.out.println("su1 == su2 : "+(su1==su2));
        System.out.println("su1 != su2 : "+(su1!=su2));
        System.out.println("su1 > su2 : "+(su1>su2));
        System.out.println("su1 >= su2 : "+(su1>=su2));
        System.out.println("su1 < su2 : "+(su1<su2));
        System.out.println("su1 <= su2 : "+(su1<=su2));

        //and
        System.out.println("\n"+"su1 >= su1 && su2 >= su3 : "+(su1 >= su2 && su2 >= su3));
        System.out.println("su1 <= su2 && su2 >= su3 : "+(su1 <= su2 && su2 >= su3));
        System.out.println("su1 >= su2 && su2 <= su3 : "+(su1 >= su2 && su2 <= su3));
        System.out.println("su1 <= su2 && su2 <= su3 : "+(su1 <= su2 && su2 <= su3));

        //or
        System.out.println("\n"+"su1 >= su1  || su2 >= su3 : "+(su1 >= su2 || su2 >= su3));
        System.out.println("su1 <= su2  || su2 >= su3 : "+(su1 <= su2 || su2 >= su3));
        System.out.println("su1 >= su2  || su2 <= su3 : "+(su1 >= su2 || su2 <= su3));
        System.out.println("su1 <= su2  || su2 <= su3 : "+(su1 <= su2 || su2 <= su3));

        //not 연산
        System.out.println("\n"+"!(su1>=su2) : "+(!(su1>=su2)));
        System.out.println("!(su1<=su2) : "+(!(su1<=su2)));
    }
}
