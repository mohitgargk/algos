/**
 * Created by mogargaa65 on 30/06/2015.
 */
public class Number2Word {

    public static  void main(String[] args) {
        long input = 135377829210l;
        System.out.println(input + " " +toWords(input));
    }

    private static String[] denominations = {
        "ONLY", "THOUSAND", "MILLION", "BILLION", "TRILLION", "QUADRILLION" } ;

    private static String[] hunderedPlaces = {
        "", "ONE", "TWO", "THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE" };

    private static String[] tenPlaces = { // -1 means carry
        "-1","-1","TWENTY", "THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY" };

    private static String[] onePlaces = {
        "", "ONE", "TWO", "THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FORTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"  };

    public static String toWords(long n) {

        String out = "";
        int level = 0;

        while (n!=0) {
            out = " " + toWords( n%1000, level) + out;
            level++;
            n = n/1000;
        }

        return out;
    }

    private static String toWords(long n, int level) {

        String out = " ";
        out += " " + tripletToWords(n);
        out += " " + denominations[level];
        return out;

    }

    // Triplet
    private static String tripletToWords(long n) {
        String out = "";

        int msb = (int) n/100;
        int midsb = (int) (n%100)/10;
        int lsb = (int) n%10;


        out += " " + hunderedPlaces[msb];
        if(tenPlaces[midsb]!="-1")
            out += " " + tenPlaces[midsb];
        else
            lsb += midsb*10;
        out += " " + onePlaces[lsb];

        return out;
    }



}
