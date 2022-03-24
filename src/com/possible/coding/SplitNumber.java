package com.possible.coding;

public class SplitNumber {


    public static int[] solution(int N) {

        if (N == 0) return new int[]{0};
        int [] ans = new int [2];

        int A = N/2;
        int B = N-A;

        int firstValue = setModulo(A);
        int secondValue = setModulo(B);

        if (A%10 == 0){
            ans[0] = A - firstValue;
            ans[1] = B + firstValue;
            return ans;
        }
        else if(B % 10 == 0){
            ans[0] = A + secondValue;
            ans[1] = B - secondValue;
            return ans;
        }
        ans[0] = A;
        ans[1] = B;
        return ans;
    }


    private static int setModulo(int number) {
        int tempNum = number;
        int i = 0;
        int j = 1;
        int k = 0;

        while(tempNum % 10 == 0 && tempNum!=0){
            i = k;
            k = j + i;

            tempNum = tempNum / 10;
            j *=10;
        }
        return k;
    }


    public static int[] solution2(int N) {
        int a = 0;
        int pow = 0;
        int num = N;

        while (num > 1){
            int lastDigit = num % 10;

            a += (lastDigit > 1) ? 1 * Math.pow(10, pow) : 2 * Math.pow(10, pow);

            pow++;
            num -= lastDigit;
            num /= 10;
        }
        return new int[]{a, N - a};
    }
}
