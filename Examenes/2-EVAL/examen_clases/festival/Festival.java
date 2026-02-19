package festival;
public class Festival {
    Concierto[] catalogo_conciertos = new Concierto[20];
    String nombre;
    int cant_conciertos = 0;

    public Festival(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Función para registrar conciertos en el festival. 
     * @param concierto
     */
    public void registrarConcierto(Concierto concierto) {
        this.catalogo_conciertos[this.cant_conciertos] = concierto;
        this.cant_conciertos ++;
    }

    public Concierto buscarConcierto(String codigo) {
        Concierto concierto_nulo = null;
        for (int i = 0; i < this.cant_conciertos; i++) {
            if (codigo.equals(this.catalogo_conciertos[i].codigo)) {
                return this.catalogo_conciertos[i];
            }
        }
        System.out.println("El concierto no se encuentra en el catálogo");
        return concierto_nulo;
    }
}
