import java.util.*;
import java.util.Timer;
////שיפרתי את השיעורי בית של האובייקטים מלראות רק את פעולת האובייקט למיני משחק אינטרקטיבי הקורה בטרמינל
////נ.ב. הוספתי את מתודת Thread.sleep באמצעות האתר של oracle.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Player Jermey = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see Jeremy run? 1 for yes and 0 for no");
        int OneorZero = scanner.nextInt();

        if (OneorZero == 1) {
            Jermey.run();
        }
        else if (OneorZero == 0) {
            System.out.println("Well, you misses an extraordinary action of Jeremy, it will blow your mind. Are you changing your mind? 1 for yes and 0 for no");
        }
        Scanner scannerone = new Scanner(System.in);
        int OneorZeroFirst = scannerone.nextInt();
        if (OneorZeroFirst == 1) {
                    Jermey.run();
                }
                else if (OneorZeroFirst == 0) {
                    Thread.sleep(2000);
                    System.out.println("Well Than...");
                    Thread.sleep(2000);
                    System.out.println("*Takes out gun and loads it*");
                    Thread.sleep(2000);
                    System.out.println("LISTEN TO ME!");
                    Thread.sleep(2000);
                    System.out.println("IF YOU DON'T WANT SOMETHING BAD TO HAPPEN!");
                    Thread.sleep(2000);
                    System.out.println("*draws weapon straight to your head*");
                    Thread.sleep(2000);
                    System.out.println("SO WHAT DO YOU CHOOSE?! 1 for watching Jeremy's action or 0 for something bad");
            }
        Scanner scannertwo = new Scanner(System.in);
        int OneorZeroSecond = scannerone.nextInt();
                if (OneorZeroSecond == 1) {
                    Thread.sleep(2000);
                    System.out.println("Great, happy you understood the meaning of watching Jeremy's action.");
                    Thread.sleep(2000);
                    Jermey.run();
                    Thread.sleep(5000);
                    System.out.println("Hello.");
                    Thread.sleep(2000);
                    System.out.println("This is the narrator speaking.");
                    Thread.sleep(2000);
                    System.out.println("I have something to tell you.");
                    Thread.sleep(2000);
                    System.out.println("Congrats!");
                    Thread.sleep(2000);
                    System.out.println("*Confetti shots*");
                    Thread.sleep(2000);
                    System.out.println("You rescued yourself and now you can keep on with your life.");
                    Thread.sleep(2000);
                    System.out.println("Anyway, keep to live your good life.");
                    Thread.sleep(3000);
                    System.out.println("THE GOOD END");
                }
                else if (OneorZeroSecond == 0) {
                    System.out.println("Well...");
                    Thread.sleep(2000);
                    System.out.println("You left me no choice");
                    Thread.sleep(2000);
                    System.out.println("*Gun shot*");
                    Thread.sleep(5000);
                    System.out.println("Hello.");
                    Thread.sleep(2000);
                    System.out.println("This is the narrator speaking.");
                    Thread.sleep(2000);
                    System.out.println("I have something to tell you.");
                    Thread.sleep(2000);
                    System.out.println("In your next life, when someone is threading you with a gun, do as he says, OK?");
                    System.out.println("Anyway, have fun in your next life.");
                    Thread.sleep(3000);
                    System.out.println("THE BAD END");
                }
        }
    }       