/**
 * Created by Yangyang on 2016/12/11.
 */
import java.util.Arrays;

public class Hello {
    public static void main(String[] args){

            new TestThread().start();
            new TestThread().start();

    }

}
class TestThread extends Thread{
    public void run(){
        while (true) {
            System.out.print(Thread.currentThread().getName());
        }
    }
}
