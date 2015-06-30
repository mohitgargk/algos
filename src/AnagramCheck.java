import java.util.HashMap;

/**
 * Created by mogargaa65 on 30/06/2015.
 * http://www.geeksforgeeks.org/microsoft-interview-experience-set-55-for-software-engineer-2/
 */
public class AnagramCheck {

    public static void main(String[] args) {


        System.out.println("Is Silent and Listen anagram? " + checkAnagram("silent", "listen"));

    }

    public static boolean checkAnagram(String sa, String sb) {

        char[] a = sa.toCharArray();
        char[] b = sb.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<a.length; i++) {

            Character key = new Character(a[i]);
            Integer val = new Integer(1);

            if(map.containsKey(key)) {
                val = map.get(key);
                val++;
            }
            else {
                map.put(key, val);
            }
        }

        for(int i=0; i<a.length; i++) {

            Character key = new Character(b[i]);
            Integer val = new Integer(1);

            if(map.containsKey(key)) {
                val = map.get(key);
                if(val!=1)
                    val--;
                else if(val==1)
                    map.remove(key);
            }
            else {
                return false;
            }
        }

        if(map.isEmpty())
            return true;

        return  false;
    }
}
