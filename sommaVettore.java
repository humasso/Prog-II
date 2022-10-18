public class sommaVettore {
    /*
     * Funzione che restituisce la somma dei valori avuti per argomento
     * 
     * REQUIRES: valore != null
     * MODIFIES: niente
     * EFFECTS: restituisce un intero s uguale alla somma di tutti gli elementi dei vettori valori.
     */
    static int SommaVettore(int[] valori){
        int somma = 0;
        for ( int i =0; i<valori.length;i++){
            somma += valori[i];
        }

        return somma;
    }

    public static void main(String[] args) {
        int[] peso = new int[]{50,60,90};
        int[] telefoni = new int[]{1,4,2,5,2};
    
        System.out.println(SommaVettore(peso));
       
        System.out.println(SommaVettore(telefoni));
    }
}
