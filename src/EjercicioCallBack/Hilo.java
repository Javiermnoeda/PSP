package EjercicioCallBack;

public class Hilo extends Thread{
    @Override
    public void run() {
        try {
            sleep(4000);
            Main.numaleatorio = (int) (Math.random()*(20-4+1)+4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
