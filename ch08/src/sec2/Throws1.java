package sec2;
//모든 예외 처리는 try~catch~finally 또는 메소드의 throws를 반드시 써야함.
public class Throws1 {
    public static void main(String[] args) throws Exception {
        String name = null;
        nullCheck(name);

        int[] arr = new int[4];
        otherCheck(arr);

        String data = "1004Kimkitae";
        otherCheck(data);
    }

    public static void nullCheck(String a) throws NullPointerException{
        System.out.println(a); //예외 상황이 되었을 경우 NullpointerException이 처리하게
    }

    public static void otherCheck(int[] a) throws ArrayIndexOutOfBoundsException{
        System.out.println(a[5]);
    }

    public static void otherCheck(String a) throws NullPointerException, Exception{
        int data = Integer.parseInt(a);
    }
}
