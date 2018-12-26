import static java.lang.Thread.sleep;

public class Mfu {
    int scan;//Отсканировано
    int pr;//Напечатано
    public Mfu() {
        this.scan = 0;
        this.pr = 0;
    }

    public synchronized void scan(){
        this.scan++;
        System.out.println("Отсканировано: " + Integer.toString(this.scan));
        try {
            sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printDoc(){
        this.pr++;
        System.out.println("Отпечатано: " + Integer.toString(this.pr));
        try {
            sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

