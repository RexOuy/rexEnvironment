package net.rexouy.thinkinjavademo.Chapter5;

/**
 * 5-12
 * tank类
 * @Author RexOuy
 * @Date 2021/11/9
 */
public class Answer12 {
    String status;
    String name;
    Answer12(String status,String name) {
        this.status = status;
        this.name = name;
    }

    void emptyTank() {
        status = "empty";
    }

    void fullTank() {
        status = "full";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("====in finallize now of "+name+"====");
        if (status == null || !status.equals("empty")) {
            System.out.println("tank is not empty");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Answer12 a = new Answer12("full","a");
        Answer12 b = new Answer12("empty","b");
        a = null;
        b = null;
        System.gc();
//        System.runFinalization();
    }
}
