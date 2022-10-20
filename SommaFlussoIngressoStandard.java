import java.util.Scanner;


public class SommaFlussoIngressoStandard {
/*
 * Un esempio di programma che legge un elenco di interi dal flusso di
 * ingresso standard (stdin) e ne emette la somma.
 *
 * Una volta compilato, un esempio di esecuzione è
 *
 *  java FlussoIngressoStandard
 *
 * a cui far seguire un elenco di interi terminato da ^D (ossia premendo i
 * tasti ctrl e D contemporaneamente).
 *
 */
    public static void main(String[] args) {
        int somma = 0;
        try (Scanner s= new Scanner(System.in)){
            while (s.hasNextInt()){
                somma += s.nextInt();
            }
        }
        System.out.println(somma);
    }
}
