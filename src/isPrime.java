public class isPrime
{
    public static void isPrime(int n)
    {
        // Assume prime to start
        boolean prime = true;

        // 1 is not prime
        if (n == 1) {return;}

        // Sieve of Eratosthenes to check for divisors
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {prime = false; break;}
        }

        // Print result
        if (prime) {System.out.printf("%n%d is prime", n);}
        else {System.out.printf("%n%d is not prime", n);}
    }

    public static void main(String[] args)
    {
        isPrime(66049);
    }
}