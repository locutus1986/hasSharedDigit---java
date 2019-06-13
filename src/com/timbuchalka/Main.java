package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10, 19));
    }

    public static boolean hasSharedDigit(int i, int k){

        if(i >= 10 && i < 99 && k > 10 && k <= 99){
            int iDigitOne = i%10;
            i /= 10;
            int iDigitTwo = i;

            int kDigitOne = k%10;
            k/=10;
            int kDigitTwo = k;

            if(iDigitOne == kDigitOne || iDigitOne == kDigitTwo || iDigitTwo == kDigitTwo){
                return true;
            }
        }

        return false;
    }
}
