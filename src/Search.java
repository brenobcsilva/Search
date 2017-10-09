import java.io.*;
import java.util.Scanner;

public class Search {

    public static void main(String args[]) throws IOException {
        System.out.print("Enter integer to search: ");
        Scanner scan = new Scanner(System.in);
        int numList[] = new int[15000];
        int toSearch = scan.nextInt();
        int i = 0;
        FileInputStream fstream = new FileInputStream("sorted15000.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String data;
        while ((data = br.readLine()) != null)   {
            String[] tmp = data.split(" ");    //Split space
            for(String s: tmp)
                numList[i++] = Integer.parseInt(s);
        }

        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();

        long startTimeLinear = System.nanoTime();
        int linear = linearSearch.searchElementLinear(numList, toSearch);
        long endTimeLinear   = System.nanoTime();
        long totalTimeLinear = endTimeLinear - startTimeLinear;

        long startTimeBinary = System.nanoTime();
        int binary = binarySearch.searchElementBinary(numList, toSearch);
        long endTimeBinary   = System.nanoTime();
        long totalTimeBinary = endTimeBinary - startTimeBinary;

        System.out.println("Linear Search : "
                + linear + " index " + " at " + totalTimeLinear + " nano time");
        System.out.println("Binary Search : "
                + binary + " index " + " at " + totalTimeBinary + " nano time");


    }

}
