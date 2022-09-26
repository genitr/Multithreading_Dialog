public class ThreadDialog extends Thread{

    @Override
    public void run() {
        try{
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я " + getName() + ". Всем привет!");
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
