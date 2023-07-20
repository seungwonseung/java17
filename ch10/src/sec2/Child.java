package sec2;

class Parent {

}

class My extends Parent {

}

class Brother extends Parent {

}

class Sister extends Parent {

}

class Sibling extends Parent {

}

class Season extends My {

}

class Sesaw extends Brother {

}

public class Child<T extends My> { //My(상속) 받은 것 까지만 가능
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
