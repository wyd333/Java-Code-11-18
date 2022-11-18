public class Test {
    public int a = 10;
    public int b = 100;
    public void fun1() {
        System.out.println("我是父类中的！");
    }
}

class B extends Test {
    public int b = 666;
    public int c = 0;
    public void fun2() {
        System.out.println("我是子类中的！");
    }

    public void fun1(int a) {
        System.out.println(a + "我是子类中的！");
    }

    public void fun3() {
        System.out.println(a);
        System.out.println(b);
        fun1();
        fun2();
        int a  = 0;
        fun1(a);
    }
}
