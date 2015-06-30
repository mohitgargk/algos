/**
 * Created by mogargaa65 on 30/06/2015.
 */
public class Number2Word {

    public static  void main(String[] args) {
        long input = 135377829210l;
        System.out.println(toWords(input));
    }

    private static enum denominations {
        ONLY(0), THOUSAND(1), MILLION(2), BILLION(3), TRILLION(4), QUADRILLION(5);

        final int level;

        denominations(int val) {
            this.level = val;
        }

    }

    private static enum places {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ;
        final int num;
        places(int val) {
            num=val;
        }
    }

    private static enum tenPlaces {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
        final int num;
        places(int val) {
            num=val;
        }
    }


    public static String toWords(long n) {
        String out = "";




        return out;
    }

    private static String toWords(int n, int level) {
        String out = "";




        return out;

    }

    private static String toWords(int n) {
        String out = "";




        return out;

    }



}
