/**
 * Created by mogargaa65 on 30/06/2015.
 *  * http://www.geeksforgeeks.org/microsoft-interview-experience-set-55-for-software-engineer-2/
 */


public class SumFind {

    public static  void main(String[] args) {

        String input = "1356,438,23,77,82,92,100,";

        System.out.println(checkSum(input));

    }

    public static boolean checkSum(String in) {

        char[] input = in.toCharArray();

        long z=-1,y=-1,x=-1;
        int zDigitCounter = 0;
        boolean flag = true;

        for(int i=input.length-1; i>=0; i--) {

            if (input[i] == ',') { // check only when z is completely build

                if(x==z+y && flag)
                    return true;

                x = y;
                y = z;
                z = 0;
                zDigitCounter = 0;
            }
            else {
                z = z +  ( Character.getNumericValue(input[i]) * (long) Math.pow(10, zDigitCounter));
                zDigitCounter++;
            }

        }

        return  false;



    }
}
