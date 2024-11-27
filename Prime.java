public class Prime {

    public static void main(String[] args) {
        int n=48;
if (isPrime(n)) {
    System.out.println(n + "prime number.");
} else {
    System.out.println(n + "not prime number.");
}
    }
public static boolean isPrime(int number) {
if (number <= 1) {
    return false;
}
for (int i = 2; i * i <= number; i++) {
    if (number % i == 0) {
        return false;
    }
}
return true;
}
}