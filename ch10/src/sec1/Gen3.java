package sec1;

interface InterGen3<T> {
    T method1();    //반환타입을 범용화(Generic)할 경우
}

public class Gen3 implements InterGen3<String> {
    @Override
    public String method1() {
        return "하하허허호호후후";
    }
}
