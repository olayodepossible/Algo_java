package com.possible.array;

public class SelectionSort {

        public  static void selectionSortSolution(int Arr[]){
            int len = Arr.length;

            for (int j = 0; j < len-1; j++){
                int minPosition = j;

                for (int i = j + 1; i < len; i++){

                    if (Arr[i] < Arr[minPosition]){
                        minPosition = i;
                    }
                }

                int temp = Arr[j];
                Arr[j] = Arr[minPosition];
                Arr[minPosition] = temp;
            }

        }


}
