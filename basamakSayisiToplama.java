import java.util.Scanner;

public class basamakSayisiToplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = inp.nextInt();
       /* int basNumber = 0 ;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basTotal;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;

            basTotal = 0;

            for ( int i = 1; i <= basNumber; i++){
                basTotal += basValue;
            }
            result += basTotal;
            tempNumber /= 10;
        }
        System.out.println(result);

        */

        int toplamBasamakDegeri = 0;

        while (number > 0) {
            toplamBasamakDegeri += number % 10;
            number/=10;
        }
        System.out.println(toplamBasamakDegeri);




    }
}
