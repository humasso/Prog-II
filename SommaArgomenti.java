public class SommaArgomenti {
/*
* Esempio di programma che riceve un elenco di interi come argomenti sulla
* linea di comando e ne emette la somma.
*
* Una volta compilato, un esempio di esecuzione è
*
*  java SommaArgomenti 1 2 3
*
*/
    public static void main(String[] args) {
        int somma = 0;
        for(int i =0; i<args.length; i++){
            somma += Integer.parseInt(args[i]);
        }
        System.out.println(somma);
    }
}
