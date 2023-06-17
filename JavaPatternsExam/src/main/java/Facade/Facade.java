package Facade;

public class Facade {
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;

    public Facade() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
    }

    public void operation() {
        System.out.println("doing ops");
        subSystem1.operation();
        subSystem2.operation();
    }
}
