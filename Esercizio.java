import java.util.Scanner;

class Esercizio {

public class Program {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, n;

        System.out.println("Inserire il numero di elementi: ");
        n = input.nextInt();
        int[] u = new int[n], r = new int[n], s = new int[n];
        double[] m = new double[n];

        for (i = 0; i <= n - 1; i++) {
            do {
                System.out.println("Immetti il " + i + 1 + "° numero intero positivo: ");
                u[i] = input.nextInt();
            } while (u[i] < 0);
        }
        for (i = 0; i <= n - 1; i++) {
            r[i] = random.nextInt(11);
            System.out.println("Numero casuale in [0,10] avente " + i + 1 + "° posizione: " + r[i]);
        }
        for (i = 0; i <= n - 1; i++) {
            s[i] = random.nextInt(8 - 3 + 1) + 3;
            System.out.println("Numero casuale in [3,8] avente " + i + 1 + "° posizione: " + s[i]);
        }
        for (i = 0; i <= n - 1; i++) {
            m[i] = (double) (u[i] + r[i] + s[i]) / 3;
            System.out.println(Integer.toString(i + 1) + "° elemento media: " + m[i] + " = (" + u[i] + " + " + r[i] + " + " + s[i] + ")/3");
        }
        int t;

        System.out.println("Inserire T: ");
        t = input.nextInt();
        System.out.println("Elementi di U con cui la loro somma sia: " + t);
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                if (u[i] + u[j] == t) {
                    System.out.println(Integer.toString(u[i]) + " + " + u[j] + " = " + t);
                }
            }
        }
    }
}