public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int chiselko) {
        for (int i = 2;i<chiselko;i++){
            if (chiselko % i == 0){
                return false;
            }
        }
        return true;
    }
}