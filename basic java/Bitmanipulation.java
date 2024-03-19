import java.util.Scanner;

public class Bitmanipulation {
    public static void main(String[] args) {
        // GET BIT OPERATION
        // for get bit operation we use binary AND operator
        // int num = 5; // binary 101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // if ((bitMask & num) == 0) {
        // System.out.println("the bit at " + pos + " of the number " + num + " is 0");
        // } else {
        // System.out.println("the bit at " + pos + " of the number " + num + " is 1");
        // }

        // SET BIT OPERATION
        // for set bit operation we use binary OR
        // int num = 5; // 101 in binary
        // int pos = 1;
        // int bitMask = 1 << pos;
        // int newNum = num | bitMask; // newNum becomes 111( 101 OR 010) which is 7 in
        // decimal
        // System.out.println(newNum);

        // CLEAR BIT OPERATION
        // for clear bit operation we first use binary NOT(~) on bitmask then perform
        // binary AND with the given number
        // int num = 5; // binary 0101
        // int pos = 2;
        // int bitMask = 1 << pos; // bitMask = 0100
        // int notBitMask = ~(bitMask); // notBitMask = 1011
        // int newNum = notBitMask & num; // newNum = 1011 & 0101 = 0001
        // System.out.println(newNum); // 0001 is 1 in decimal

        // UPDATE OPERATION
        // if we have to update the bit to 1 then we can use setbit method
        // if we have to update the bit to 0 then we can use clear bit method
        // int num = 5; // binary 101
        // int pos = 2;
        // int bitMask = 1 << pos;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter 1 to set and 0 to clear");
        // int operation = sc.nextInt();
        // if (operation == 1) {
        // int newNum = bitMask | num; // 0101 |0100 = 0101
        // System.out.println(newNum); // prints 5 in decimal
        // } else {
        // int notBitMask = ~(bitMask); // 1011
        // int newNum = notBitMask & num; // 1011 & 0101 = 0001
        // System.out.println(newNum); // prints 1 in decimal

        // }

    }
}
 