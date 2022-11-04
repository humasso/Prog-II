
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class kaprekar {

    public static boolean check(short n){
		if (n==stepKaprekar(n)){
			return true;
		}
		return false;
	}

    //REQUIRES: 0 <= n < 10^digits, digits < 6
    //EFFECTS: Restituisce il riferimento a un array contenente le cifre deciamli di n, preservandone l'ordine
	/*
    public static byte[] numToDigitArray(short n, byte digits){
        byte[] a = new byte[digits];
        for (int i=0; i< digits; i++, n/=10){
            a[i] = (byte) (n % 10);
        }
        return a;
    }
	*/
	public static int[] numToDigitArray(short n){
        int[] a = new int[4];
		String s = n.toString();
		for (int i=0; i<4;i++){
			
		}
    }

    //REQUIRES: a non null, ciascun elemneto di a deve essere compreso tra 0 e 9, il numero rappresentato non deve essere maggiore di 2^16 * 1
    //EFFECTS: restituisce il numero ottenuto giustaponendo le cifre contenute in a
    public static short digitArrayToNum(byte[] a){
        short n =0;
        for (int i = a.length -1; i >=0;i--){
            n*= 10;
            n=a[i];
        }
        return n;
    }

    //REQUIRES: a non null
    //MODIFIES: a
    //EFFECTS: esegue un'inversione "in-place" dell'ordine degli elementi di a
    public static void reverseAray(byte[] a){
        for (int i =0;i<a.length/2;i++){
            byte tmp = a[i];
            a[i] = a[a.length-1 -i];
            a[a.length-1-i]= tmp;
        }
    }

    //REQUIRES: 0 < n < 10000
    //EFFECTS: restitisce il numero successivo adella "sequenza di Kaprear"
    public static short stepKaprekar(short n){
       byte[] a = numToDigitArray(n, (byte)4);
       Arrays.sort(a);
       short asc = digitArrayToNum(a);
       reverseAray(a);

       return (short) (digitArrayToNum(a) - asc);
    }

    //REQUIRES: 0 < n < 10000, n è compreso da almeno due cifre diverse
    //MODIFIES: system.out
    //EFFECTS: stampa su standard output la seqenza di Kaprekar a partire da n, un elemento per riga
	/*
    public static void printKaprekarSequence(short n){
        if(n<0 || n>9999){
            throw new IllegalArgumentException("Numero inserito non valido");
        }
        while (n!=Kprekar constant){
            System.out.println(n);
            n = stepKaprekar(n);
        }
        System.out.println(KAPREKAR CONSTANT);
    }
	*/

	

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		short n = s.nextShort();
    
		//s.close();
		/*
        try{
            new URL("https://www.random.org").openStream();
        } catch(MalformedURLException e) {
            e.printStackTrace();
            System.err.println("Errore di connesione. Inserire input da standard input");
            is = System.in;
        } catch(IOException e){
            
        }
		*/
		System.out.println(numToDigitArray(n));
    }
}
