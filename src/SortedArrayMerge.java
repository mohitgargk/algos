/**
 * Created by mogargaa65 on 01/07/2015.
 */
public class SortedArrayMerge {

    public static void main(String[] args) {

        int[] n = {1,4,6,9,10,11};
        int[] nm = {2,3,5,7,8, -1, -1, -1, -1, -1, -1};

        int[] res = merge(n, nm);

        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] merge(int[] n, int[] nm) {

        int msize = 0;
        int nsize = n.length;

        int i=0;
        while(nm[i]!=-1) {
            i++;
        }
        msize = i;

        int nCounter = nsize-1;
        int nmCounter = msize -1;

        int resCounter = nm.length-1;

        while(nCounter!=-1 || nmCounter!=-1) {

            if(nCounter==-1 && nmCounter!=-1) { // copy nmCounter stuff
                nm[resCounter] = nm[nmCounter];
                nmCounter--;
            }
            else if(nCounter!=-1 && nmCounter==-1) { // copy nCounter stuff
                nm[resCounter] = n[nCounter];
                nCounter--;
            }
            else { // check for larger one
                if(n[nCounter] >= nm[nmCounter]) {
                    nm[resCounter] = n[nCounter];
                    nCounter--;
                }
                else {
                    nm[resCounter] = nm[nmCounter];
                    nmCounter--;
                }
            }
            resCounter--;
        }

        return nm;
    }
}
