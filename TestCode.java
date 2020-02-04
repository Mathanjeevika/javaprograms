import java.io.*;

public class TestCode {
    static int staticVal = 0;
    static {
        System.out.println("In the static block");
        staticVal = 20;
        vaTest(1, 2, 3);
        vaTest(true, false, true);
    }

    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " + "Number of args: " + v.length + " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...) " + "Number of args: " + v.length + " Contents: ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    /**
     * This is the comment for main method
     ***/
    public static void main(String[] args) {
        Person per = new Person();
        per.regNo = 10;
        per.setName("testing");
        System.out.println(per.getRegNo());
        System.out.println("In Y Val ");
        System.out.println("The Private val " + per.getName());
        int y = 20;
        for (int x = 0; x < 10; x++) {
            System.out.println(y);
            y = y - 4;
        }
        System.out.println("THestatic val " + staticVal);
    }
}

/**
 * This is the comment
 **/
class Person {
    protected int regNo;
    protected String str;
    private String name;

    public int getRegNo() {
        return this.regNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class githubcheckclass {
    int x;
    int y;
}
