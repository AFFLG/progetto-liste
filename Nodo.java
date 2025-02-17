// classe nodo (LISTE)

public class Nodo
{
    public Object dati;
    public Nodo link;

    public Nodo(Object oggetto)
    {
        dati = oggetto;
        link = null;
    }

    public Object getDati()
    {
        return dati;
    }

    public void setLink(Nodo link)
    {
        this.link = link;
    }

    public Nodo getLink()
    {
        return link;
    }
}
