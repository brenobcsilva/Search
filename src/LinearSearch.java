public class LinearSearch {

    int searchElementLinear(int numList[], int toSearch) {
        int foundIndex = -1;
        for (int i = 0; i < numList.length; i++) {

            if (numList[i] == toSearch) {
                foundIndex = i;
            }
        }
        return foundIndex;
    }

}
