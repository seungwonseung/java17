package sec2;

public class ColEx2 {
    public static void main(String[] args) {
        Week[] wk = Week.values();
        for(Week w:wk){
            System.out.println(w.korean+"["+w.chinese+"]");
        }
        System.out.println(Week.Monday.ordinal());
    }
}
