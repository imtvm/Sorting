import java.util.Random;

public class StalinSort {

    public int[] stalinSort(int[] a){
        int chance = getAvg(a);
        int[] tempAr = new int[a.length];

        for (int i = 0; i < a.length; i ++){
            if (!isElim(chance)){
                tempAr[i] = a[i];
            }else{
                tempAr[i] = -1;
            }
        }
        
        int numOfBlanks = countElements(a, -1);
        int[] finalAr = new int[tempAr.length-numOfBlanks];

        for (int i = 0, j = 0; i < tempAr.length;i++){
            if (tempAr[i] != -1){
                finalAr[j] = tempAr[i];
                j++;
            }
        }
        return finalAr;
    }

    private boolean isElim(int chance){
        Random rnd = new Random();
        int rndNum = 1 + rnd.nextInt(100);
        if (rndNum > chance){
            return false;
        }else{
            return true;
        }
    }

    private int getAvg(int[] a){
        int avg = 0;
        for (int i : a){
            avg += i;
        }
        return avg = avg / a.length;
    }

    public int[] stalinSortV1(int[] a){
        int[] tempA = new int[a.length];
        for (int i = 0; i < tempA.length-1; i++){
            if (i > 0 && !(i + 1 > tempA.length)){
                if (a[i] < a[i-1] || a[i] > a[i+1]){
                    tempA[i] = 0;
                }else if(a[i] > a[i-1] && a[i] < a[i+1]){
                    tempA[i] = a[i];
                }
            }else if (i == 0 ){
                if (a[i] > a[i+1]){
                    tempA[i] = 0;
                }else if(a[i] < a[i+1]){
                    tempA[i] = a[i];
                }
            }else if (i+1 > tempA.length){
                if (a[i] < a[i-1]){
                    tempA[i] = 0;
                }else if(a[i] > a[i-1]){
                    tempA[i] = a[i];
                }
            }
        }

        int[] finalA = new int[a.length - countElements(a, 0)];

        for (int i = 0, j = 0; i < tempA.length; i++){
            if (tempA[i] != 0){
                finalA[i] = tempA[i];
                j++;
            }
        }

        return finalA;
    }

    private int countElements(int[] a, int target){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == target){
                count++;
            }
        }
        return count;
    }

}
