import java.util.ArrayList;

public class primeFactors
{
    // Check if a number is prime
    public static boolean isPrime(int n)
    {
        // Assume prime to start
        boolean isPrime = true;

        // 1 is not prime
        if (n == 1) {return false;}

        // Sieve of Eratosthenes to check for divisors
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {isPrime = false; break;}
        }

        return isPrime;
    }

    // Get primes up to n
    public static ArrayList<Integer> primesList(int n)
    {
        // List to keep track of primes
        ArrayList<Integer> primes = new ArrayList<>();

        // Populate list for primes up to and including sqrt(n)
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
                primes.add(i);
        }

        return primes;
    }

    // Get prime factors using the list of primes to check
    public static void primeFactors(int n)
    {
        int current = n;

        // Primes to check
        ArrayList<Integer> primes = primesList(n);

        for (int prime : primes)
        {
            // Assume prime is not in prime factorisation
            int power = 0;

            // Check how many times the prime divides n
            while (current % prime == 0)
            {
                current /= prime;
                power++;
            }

            // Prime all present factors:
            if (power != 0)
                System.out.printf("%d^%d * ", prime, power);
        }

        // Delete hanging "* "
        System.out.print("\b\b");
    }


    public static void main(String[] args)
    {
        primeFactors(238512);
    }
}

