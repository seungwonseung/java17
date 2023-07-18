package sec1;

import org.w3c.dom.ls.LSOutput;

public class Dragonfly implements Flying{
    @Override
    public void fly() {
        System.out.println("잠자리가 날아갑니다.");
    }
}
