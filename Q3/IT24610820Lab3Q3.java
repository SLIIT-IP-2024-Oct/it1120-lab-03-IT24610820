import java.util.Scanner;

public class IT24610820Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();

        int count5000 = amount / 5000;
        amount = amount % 5000;
        System.out.println("5000 Notes - "+count5000);

        int count1000 = amount / 1000;
        amount = amount % 1000;
        System.out.println("1000 Notes - " + count1000);

        int count500 = amount / 500;
        amount = amount % 500;
        System.out.println("500 Notes - " + count500);

        int count200 = amount / 200;
        amount = amount % 200;
        System.out.println("200 Notes - " + count200);

        int count100 = amount / 100;
        amount = amount % 100;
        System.out.println("100 Notes - " + count100);

        int count50 = amount / 50;
        amount = amount % 50;
        System.out.println("50 Notes - " + count50);

        int count20 = amount / 20;
        amount = amount % 20;
        System.out.println("20 Notes - " + count20);

        int count10 = amount / 10;
        amount = amount % 10;
        System.out.println("10 Coins -" + count10);

        int count5 = amount / 5;
        amount = amount % 5;
        System.out.println("5 Coins - " + count5);

        int count2 = amount / 2;
        amount = amount % 2;
        System.out.println("2 Coins - " + count2);

        int count1 = amount / 1;
        amount = amount % 1;
        System.out.println("1 Coins - " + count1);

        input.close();
    }
}
