package com.kaushaltop;

import java.util.Scanner;

public class MyMethods {

    private static Scanner scanner = new Scanner(System.in);

    public static void separatingArrayElementDigits(int[] array) {

        for (int i=0; i<array.length; i++) {

            while (array[i] > 0) {

                int lastDigitOfArrayEle = array[i]%10;

                array[i] /= 10;

                System.out.println(Integer.toString(lastDigitOfArrayEle));
            }
        }
    }

    public static void getArrayEleMidValue(int[] array) {

        int count = 0;
        int start = 0;
        int a;
        
        String  result = null;

        int[] getMid = new int[1000];

        for (int i=0; i<array.length; i++) {

            a = array[i];
            String num = Integer.toString(a);

            if (num.length() % 2 != 0) {

                if (a>=0 && a<=9) {

                    System.out.println("Number is a single digit.");

                } else {

                    result = String.valueOf(num.charAt(num.length()/2));

                    System.out.println("The mid digit of " + a + " is " +  result);

                    count++;

                    for (int j=start; j<=start; j++) {

                        //storing values
                        getMid[j] = Integer.parseInt(result);
                    }

                    System.out.println("Stored in array :)");
                    for (int k=0; k<count; k++) {

                        System.out.println(getMid[k]);
                    }
                    start++;
                }

            } else {

                System.out.println("No middle number.");
            }
        } //for loop end
    }
}
