/**
IN PARTIAL FULLFILMENT OF THE REQUIREMENTS FOR THE DEGREE OF BS COMPUTER ENGINEERING
COEN 3444 — OBJECT ORIENTED PROGRAMMING

LAB EXERCISE — PROGRAMMING EXERCISES #2
EXERCISE 5 — REVERSE ORDER

@author Theo Leonard Tejada
*/

package TejadaTLP_Act102;

public class TejadaTLP_Act102Exer05 {
    public static void main(String[] args) {
        int[] val = {0, 1, 2, 3};
        int temp;

        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        // reverse the order of the numbers in the array
        int[] b = new int[val.length];
        int j = val.length;
        int i = 0;
        temp = 0;
        do{
            b[j - 1] = val[i]; j--; i++;
        }
        while(i < val.length);
        while(temp < val.length){
            val[temp] = b[temp]; temp++;
        }

        System.out.println("Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    }
}
