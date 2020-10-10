import java.util.Date;

public class Primes {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println("run time: " + (double) (System.currentTimeMillis() - startTime) / 1000 + " sec");
    }

    public static boolean isPrime(int chiselko) {
        int i = 2;
        while(i * i <= chiselko){
            if(chiselko % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}