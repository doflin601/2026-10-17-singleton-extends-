package qqq;

class SiTest {
    private static SiTest singleton = new SiTest();
    private SiTest() {
    }
    public static SiTest getInstance() {
        return singleton;
    }
}

public class Ex02 {
    static void main(String[] args) {

        SiTest t1 = SiTest.getInstance();
        SiTest t2 = SiTest.getInstance();

        if (t1 == t2) {
            System.out.println("같다.");
        } else {
            System.out.println("다르다.");
        }
    }
}
