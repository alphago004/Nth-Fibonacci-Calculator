public class Fibonacci
{
    public static void main (String [] args)
    {
        System.out.println("It is from recursion "+fib (5));
        System.out.println("It is from dynamic "+dynamic(46));
    }


    static int count = 0;
    public static int fib(int n)  // Fibonacci using recursion
    {
        count++;
        if (n<0)
        return 0;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int sum = fib (n-1)+ fib (n-2);
        return sum;
    }


    public static int dynamic(int n)
    {
        int memo[] = new int[1000];
        memo[0]=0;
        memo[1] = 1;

        for (int i = 2; i<=n; i++)
        //int sum = dynamic (n-1)+ dynamic (n-2);
        {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

}