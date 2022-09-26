public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread[] myThreadDialog = {
                new ThreadDialog(),
                new ThreadDialog(),
                new ThreadDialog(),
                new ThreadDialog()
        };

        for (int i = 0; i < myThreadDialog.length; i++) {
            myThreadDialog[i].setName("Поток" + (i + 1));
        }

        ThreadGroup mainGroup = new ThreadGroup("mainTh");

        Thread[] myThread = new Thread[myThreadDialog.length];

        for (int i = 0; i < myThreadDialog.length; i++) {
            myThread[i] = new Thread(mainGroup, myThreadDialog[i]);
            myThread[i].start();
        }

        Thread.sleep(15000);
        mainGroup.interrupt();

    }
}
