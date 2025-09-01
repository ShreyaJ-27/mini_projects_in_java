import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        //COUNTDOWN
        Scanner sc = new Scanner(System.in);
        System.out.print("How many seconds to countdown?: ");
        int start=sc.nextInt();

        for(int i =start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("🎊✨HAPPY NEW YEAR!!✨🥳🎉");

        sc.close();
        /*
        This Exception typically occurs when a thread running the method is interrupted while
        it is sleeping,waiting or otherwise paused in its execution.
         */
    }
}
