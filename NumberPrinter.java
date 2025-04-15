class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter();
        NumberPrinter t2 = new NumberPrinter();
        t1.start();
        t2.start();
    }
}
