package CodeWars.src.squares_decompose;

public class Decompose {
    /*
    Given a positive integral number n, return a strictly increasing sequence (list/array/string depending on the language) of numbers, so that the sum of the squares is equal to n².

    If there are multiple solutions (and there will be), return as far as possible the result with the largest possible values:
    Examples

    decompose(11) must return [1,2,4,10]. Note that there are actually two ways to decompose 11², 11² = 121 = 1 + 4 + 16 + 100 = 1² + 2² + 4² + 10² but don't return [2,6,9], since 9 is smaller than 10.

    Other solutions: https://www.codewars.com/kata/54eb33e5bc1a25440d000891/solutions/java
     */
    public String decompose(long n) {
        if(n<5) return null;

        String squares= "";
        long bigger=n, target=n*n, sum=0;

        while (sum!=target && bigger>1){
            bigger--;
            sum=0;
            squares="";
            for (long i=bigger; i >0 && sum<target ; i--) {
                if(sum+i*i<=target) {
                    sum += i * i;
                    squares=i+" "+squares;
                }
            }

        }
        if(sum==target && bigger>1)
            return squares.trim();
        else return null;
    }
}
