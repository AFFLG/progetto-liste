//classe lista 
public class Lista
{
    private Nodo head;
    private int Num_elementi;

    public Lista()
    {
        head = null;
        Num_elementi = 0;
    }

    public void VisualizzaLista() {
        Nodo n = head;
        if (n == null) {
            System.out.println("La lista è vuota.");
            return;
        }
        while (n != null) {
            System.out.println(n.getDati());
            n = n.getLink();
        }
    }

    public void VisualizzaRicorsivo(Nodo n) 
    {

        // metodo per visualizzare la lista in modo ricorsivo
        if(n == null)
        {
            return;
        }
        System.out.println(n.getDati());
        VisualizzaRicorsivo(n.getLink());
    }

    public void VisualizzaListaRicorsiva()
    {
        VisualizzaRicorsivo(head);
    }

    public void inserisciInTesta(Object dati)
    {

        // metodo per inserire in testa un elemento
        Nodo n = new Nodo(dati);
        n.setLink(head);
        head = n; //aggiorniamo gli elementi
        Num_elementi ++;
    }

    public void inserisciInCoda(Object dati) {
        Nodo n = new Nodo(dati);
    
        if (head == null) {
            head = n;  // Se la lista è vuota, metti il nodo come testa
        } else {
            Nodo p = head;
            while (p.getLink() != null) {
                p = p.getLink();  // Scorri fino all'ultimo nodo
            }
            p.setLink(n);  // Collega l'ultimo nodo al nuovo nodo
        }
    
        Num_elementi++;
    }

   /*  public void InserimentoInOrdine(Object dati)
    {
        //metodo per inserimento intermedio
        if(head == null)
        {
            inserisciInTesta(dati);
        
        }else
        {
            if(dati.Comparable(head.getDati()))
            {
                inserisciInTesta(dati);
            }else
            {

        Nodo n = new Nodo(dati);
        Nodo p = head;             // p = prima
        Nodo d = head.getLink();  // d = dopo 
        
        while (d != null && d.getDati().controllo(dati)) 
        {
             p = d;
             d = d.getLink();

        }
        if(d == null)
        {
            inserisciInCoda(dati);
        }else
        {
            n.setLink(d);
            p.setLink(n);
            Num_elementi ++;
        }
      }
    }
 }
*/

    public void eliminaInTesta()
    {
        //metodo eliminazione testa nella lista
        if(head == null)
        {
            return;
        }
        head = head.getLink();
        Num_elementi --;
    }


    public void eliminaInCoda() {
        if (head == null) {  // Se la lista è vuota
            return;
        }
    
        if (head.getLink() == null) { 
            head = null;
        } else {
            Nodo pe = head;            // Penultimo nodo
            Nodo u = head.getLink();  // Ultimo nodo
    
            while (u.getLink() != null) { 
                pe = u;
                u = u.getLink();
            }
    
            pe.setLink(null);  
        }
    
        Num_elementi--;
    }
    


    public void eliminazioneIntermedia(Object dati) {
        if (head == null) return; // Lista vuota, niente da eliminare
        
            if (head.getDati().equals(dati)) { // Se il dato da eliminare è in testa
                head = head.getLink();
                Num_elementi--;
                return;
            }
        
        Nodo prima = head;
        Nodo dopo = head.getLink(); // Nodo successivo alla testa
        
        while (dopo != null && !(dopo.getDati().equals(dati))) { 
                prima = dopo;
                dopo = dopo.getLink();
            }
        
        if (dopo != null) { // Se abbiamo trovato il nodo da eliminare
                prima.setLink(dopo.getLink());
                Num_elementi--;
            }
        }
   }
