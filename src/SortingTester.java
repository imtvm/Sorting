public class SortingTester {
    public static void main (String[] args){
        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();
        StalinSort ss = new StalinSort();
        int[] testArray = {54,23,67,1,45,176,2,32,21};

        printArray("BubbleSort",bs.bubbleSort(testArray));
        printArray("MergeSort", ms.mergeSort(testArray));
        printArray("StalinSort", ss.stalinSort(testArray));
    }

    public static void printArray(String type, int[] a){
        System.out.print(type + ": ");
        for (int i =0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
