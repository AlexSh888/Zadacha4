import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) throws FileNotFoundException {
        int n;
        String imya_file = "file.txt";
        Scanner sc = new Scanner(new File(imya_file));
        n= sc.nextInt();

        double[] myFancyArray;
        myFancyArray = new double[n];
//прочитать массив из файла

            for (int i=0; i<myFancyArray.length; i++) {
                myFancyArray[i] = sc.nextDouble();
            }
//определить медианное значение
        Arrays.sort(myFancyArray);
        double median;
        if (myFancyArray.length % 2 == 0)
            median = (myFancyArray[myFancyArray.length/2] + myFancyArray[myFancyArray.length/2 - 1])/2;
        else
            median = myFancyArray[myFancyArray.length/2];
        System.out.println(median);
    }
}
