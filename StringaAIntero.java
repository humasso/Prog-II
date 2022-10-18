 /*
   * Esempio di programma che converte il primo argomento da stringa (contenente
   * l'espansione decimale di un numero) al valore del numero stesso.
*/

public class StringaAIntero{
    public static void main(String[] args) {
        String numero = args[0];
        int num = 0;
        for (int i=0; i<numero.length(); i++){
            num = num * 10 + (numero.charAt(i) - '0');
        }
        System.out.println(num);
    }
}