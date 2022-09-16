import java.util.*;

public class Main {

    public static void digital(int houre, int min, int sec) throws InterruptedException {
        if (houre > 12 || min > 60 || sec > 60) {
            System.out.println("Error!");
        } else {
            for (int d = 0; d < 1000; d++) {
                sec++;
                if (sec > 60) {
                    sec = 0;
                    min++;
                    if (min > 60) {
                        min = 0;
                        houre++;
                        if (houre > 24) {
                            houre = 0;
                        }
                    }
                }
                System.out.printf("%02d : %02d : %02d", houre, min, sec);
                Thread.sleep(1000); // Make loop slow ,so clock look Real
                System.out.print("\033[H\033[2J"); // clear screen
                System.out.flush(); // clear screen
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set Time :");
        System.out.println("Hour ,Minute ,Seconds");
        int houre = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();

        digital(houre, min, sec);
        sc.close();
    }
}