package sec2;
//제너릭의 제한 -> <T extends 제한클래스>
//제한 클래스의 서브(이하) 클래스만 생성이 허용됨
public class MultiEx3 {
    public static void main(String[] args) {
        // 오류 : Child<Parent> c1 = new Child<Parent>();
        Child<My> c2 = new Child<>();
        // 자기 자신은 만들 수 없음 : Child<Child> c1 = new Child<>();
        Child<Season> c1 = new Child<>();
    }
}
