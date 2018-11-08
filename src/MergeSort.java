import java.util.Arrays;

public class MergeSort {

    private int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length+b.length];

        int i,j,k;
        i=j=k=0;

        while(i < a.length && j < b.length){

            if (a[i] <= b[j]){

                merged[k] = a[i];
                i++;
                k++;

            }else{

                merged[k] = b[j];
                j++;
                k++;

            }
        }
        while (i < a.length){

            merged[k] = a[i];
            i++;
            k++;

        }
        while (j < b.length){

            merged[k] = b[j];
            j++;
            k++;

        }

        return merged;
    }

    public int[] mergeSort(int[] a) {

        if (a.length <= 1){return a;}

        int[] tempA = new int[a.length/2], tempB = new int[a.length/2+1];

        tempA = Arrays.copyOfRange(a, 0, a.length/2);
        tempB = Arrays.copyOfRange(a, a.length/2, a.length);

        tempA = mergeSort(tempA);
        tempB = mergeSort(tempB);

        return merge(tempA, tempB);
    }

}
