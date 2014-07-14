package pl.jaskowski;


        import co.paralleluniverse.fibers.Fiber;
        import co.paralleluniverse.fibers.SuspendExecution;

public class QuasarExample {

    public void test() {
        new Fiber<Integer>() {
            @Override
            protected Integer run() throws SuspendExecution, InterruptedException {
                return 0;
            }
        }.start();

    }

    public static void main(String[] s) {
        QuasarExample qe = new QuasarExample();
        qe.test();
    }
}

