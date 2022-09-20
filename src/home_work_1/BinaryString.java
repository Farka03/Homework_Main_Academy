package home_work_1;

import java.util.Scanner;

public class BinaryString {
        public static void main(String[] args) {
            System.out.print("Please, enter a number in decimal format : ");
            byte number = new Scanner(System.in).nextByte();
            System.out.print("The number in binary form will take the form : " + fromDecimalToBinary(number));
        }

        public static String fromDecimalToBinary(byte number) {
            StringBuilder result = new StringBuilder();
            int absNumb = Math.abs(number);
            for (int pow = 7; pow >= 0; pow--) {
                if ((int)(absNumb / Math.pow(2, pow)) > 0) {
                    result.append("1");
                    absNumb %= Math.pow(2, pow);
                }
                else result.append("0");
            }
            if (number < 0) {
                char[] resToCharArr = result.toString().toCharArray();
                for (int i = 0; i < resToCharArr.length; i++) {
                    resToCharArr[i] = resToCharArr[i] == '0' ? '1' : '0';
                }
                for (int i = resToCharArr.length - 1; i >= 0; i--) {
                    if (resToCharArr[i] == '0') {
                        resToCharArr[i] = '1';
                        break;
                    }
                    resToCharArr[i] = '0';
                }
                result = new StringBuilder(new String(resToCharArr));
            }
            return result.toString();
        }
    }

