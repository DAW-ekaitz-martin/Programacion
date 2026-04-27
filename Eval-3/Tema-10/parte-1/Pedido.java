public class Pedido implements Comparable<Pedido>{
    int id, prioridad;
    String fecha;
    double importe;
    public Pedido(String fecha, int id, int prioridad, double importe) {
        this.id = id;
        this.fecha = fecha;
        this.importe = importe;
        this.prioridad = prioridad;
    }
    public String getFecha() {
        return fecha;
    }
    public int getId() {
        return id;
    }
    public double getImporte() {
        return importe;
    }
    public int getPrioridad() {
        return prioridad;
    }
    @Override
    public String toString() {
        return "ID: " + this.id + ", fecha: " + this.fecha + ", Prioridad: " + this.prioridad + ", Importe: " + this.importe;
    }
    @Override
    public int compareTo(Pedido pedido) {
        String[] fechaSplitada1 = this.fecha.split("-");
        String[] fechaSplitada2 = pedido.getFecha().split("-");
        //Si las fechas son distintas compruebo año, mes y luego dia
        if(this.fecha != pedido.getFecha()) {
            //Si los años son distintos los ordeno en base al año
            if(Integer.parseInt(fechaSplitada1[0]) != Integer.parseInt(fechaSplitada2[0])) {
                return  Integer.parseInt(fechaSplitada1[0]) - (Integer.parseInt(fechaSplitada2[0]));
            }
            //Sino ordeno en base al mes
            else if (Integer.parseInt(fechaSplitada1[1]) != Integer.parseInt(fechaSplitada2[1])) {
                return  Integer.parseInt(fechaSplitada1[1]) - (Integer.parseInt(fechaSplitada2[1]));
            }
            //Sino ordeno en base al dia
            else {
                return  Integer.parseInt(fechaSplitada1[2]) - (Integer.parseInt(fechaSplitada2[2]));
            }
        }
        //Si las fechas son iguales, da igual cómo ordenar
        else {
            return this.fecha.compareTo(pedido.getFecha());
        }
        
    }
}
