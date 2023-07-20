package sec2;

class Student {
    public String concept;
}
public class MultiEx1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        Multi1 mul1 = new Multi1<Student, String>();
        //                       키(필드),  값(타입)
        mul1.setValue("신승원");


    }
}
