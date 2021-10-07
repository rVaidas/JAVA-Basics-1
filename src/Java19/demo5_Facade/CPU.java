package Java19.demo5_Facade;

public class CPU {

    public void freeze() {
        System.out.println("CPU freeze");
    }

    public void jump(long position) {
        System.out.println("CPU jump to " + position);
    }

    public void execute() {
        System.out.println("CPU execute");
    }
}
