/* Q: https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true */

/* Collection Framework */

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
     Collections.reverse(a);
     return a;
    }
  

}
