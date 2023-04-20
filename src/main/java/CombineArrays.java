
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int idx = 0;
        for (int i=0;i<arr1.length;i++) {
            res[idx] = arr1[i];
            idx++;
        }
        for (int i=0;i<arr2.length;i++) {
            res[idx] = arr2[i];
            idx++;
        }
        return res;
    }
}
