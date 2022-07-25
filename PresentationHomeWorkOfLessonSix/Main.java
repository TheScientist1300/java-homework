import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
int numbers[];
numbers = new int[10];
int n = 10;
int a[] = new int[n];
int sum = 0;
Scanner s = new Scanner(System.in);
for (int i = 0; i < n; i++) {
System.out.println ("Enter number: ");
a[i] = s.nextInt();
sum = sum + a[i];

}
System.out.println("The sum of numbers is "+sum);
    }
}
