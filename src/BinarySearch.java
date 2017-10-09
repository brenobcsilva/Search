import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {

    int searchElementBinary(int numList[], int toSearch) {

        int startIndex = 0;
        int endIndex = numList.length - 1;
        int midIndex = (startIndex + endIndex) / 2;
        int midElement = numList[midIndex];
        int foundIndex = -1;

        while (startIndex <= endIndex) {
            if (midElement < toSearch) {
                startIndex = midIndex + 1;
                midIndex = (startIndex + endIndex) / 2;
                midElement = numList[midIndex];
            } else if (midElement > toSearch) {
                endIndex = midIndex - 1;
                midIndex = (startIndex + endIndex) / 2;
                midElement = numList[midIndex];
            } else {
                foundIndex = midIndex;
                break;
            }
        }
        return foundIndex;
    }
}
