import java.util.Random;

public class CustomThread extends Thread{
    Callback callback;

    public CustomThread(Callback callback) {
        this.callback = callback;
    }

    @Override
    public void run() {
        Random random = new Random();
        callback.sacarPorPantalla(String.valueOf(random.nextInt(4000)));
    }
}
