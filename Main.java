public class Main {
    public static void main(String[] args) {
        Lista listaAppuntamenti = new Lista();

        System.out.println("Creiamo la lista ed inseriamo gli appuntamenti del giorno");
        
        // Aggiungiamo appuntamenti 
        listaAppuntamenti.inserisciInTesta(16.00);
        listaAppuntamenti.inserisciInCoda(16.30);
       // listaAppuntamenti.inserisciInOrdine(17.00);

        System.out.println("Appuntamenti inseriti:");
        listaAppuntamenti.VisualizzaLista();

        // Visualizzazione ricorsiva
        System.out.println("\nAppuntamenti visualizzati ricorsivamente:");
        listaAppuntamenti.VisualizzaListaRicorsiva();

        // Eliminazione della testa
        listaAppuntamenti.eliminaInTesta();
        System.out.println("\nAppuntamenti dopo eliminazione dalla testa:");
        listaAppuntamenti.VisualizzaLista();

        // Eliminazione della coda
        listaAppuntamenti.eliminaInCoda();
        System.out.println("\nAppuntamenti dopo eliminazione dalla coda:");
        listaAppuntamenti.VisualizzaLista();

        // Eliminazione di un appuntamento intermedio
        listaAppuntamenti.eliminazioneIntermedia(16.00);
        System.out.println("\nAppuntamenti dopo eliminazione intermedia:");
        listaAppuntamenti.VisualizzaLista();
    }
}
