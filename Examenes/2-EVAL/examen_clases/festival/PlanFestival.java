package festival;

public class PlanFestival {
    LineaPlan[] plan = new LineaPlan[20];
    int cant_planes = 0;//Para saber cuantos planes hay dentro del array.

    /**
     * Esta funcion añade conciertos indicando el número de entradas que el usuario quiere para ese concierto.
     * @param concierto
     * @param numero_entradas
     * @return Retorna un booleano en función de si se ha podido añadir el el concierto al plan o no;
     */
    public boolean addConcierto(Concierto concierto, int numero_entradas) {
        boolean planAniadido = true;
        boolean existente = false;//Comprueba si el concierto ya existe entro del array.
        for (int i = 0; i < this.cant_planes; i++) {
            //Si la linea ya existe
            if (concierto.codigo.equals(this.plan[i].concierto.codigo)) {
                //Si hay entradas disponibles, las añado a la misma linea
                if (this.plan[i].concierto.aforo > numero_entradas) {
                    this.plan[i].concierto.aforo -= numero_entradas;
                    System.out.println("El concierto existia en el plan, " + numero_entradas + " entradas nuevas añadidas.");
                } 
                else {
                    System.out.println("No hay " + numero_entradas + " entradas disponibles para este concierto");
                    planAniadido = false;
                }
                existente = true;
                break;
            }
        }
        if (!existente) {
            LineaPlan nuevo_plan = new LineaPlan(concierto, numero_entradas);
            this.plan[this.cant_planes] = nuevo_plan;
            this.plan[this.cant_planes].concierto.aforo -= numero_entradas;
            this.cant_planes ++;
            System.out.println("El concierto no existia en el plan, " + numero_entradas + " entradas nuevas añadidas.");
        }
        return planAniadido;
    }
    /**
     * Esta función elimina un concierto del plan
     * @param concierto
     * @return Retorna un booleano en función de si se ha podido realizar la acción o no;
     */
    public boolean removeConcierto(Concierto concierto) {
        boolean existente = false;
        for (int i = 0; i < this.cant_planes; i++) {
            //Si la linea ya existe
            if (concierto.codigo.equals(this.plan[i].concierto.codigo)) {
                this.plan[i].concierto.aforo += this.plan[i].numero_de_entradas;
                this.plan[i] = null;
                for (int j = i; j < this.cant_planes-1; j++) {
                    this.plan[j] = this.plan[j+1];
                }
                System.out.println("El concierto ha sido eliminado del plan.");
                existente = true;
                this.cant_planes --;
            }
        }
        if (!existente) {
            System.out.println("El concierto no se encuentra dentro del plan.");
        }
        return existente;
    }
    /**
     * Actualiza el número de entradas para un concierto
     * @param concierto
     * @param numero_entradas
     * @return Retorna un booleano en función de si se ha podido realizar la acción o no;
     */
    public boolean cambiarEntradas(Concierto concierto, int nuevo_numero_entradas) {
        boolean entradas_modificadas = false;
        for (int i = 0; i < this.cant_planes; i++) {
            //Si la linea ya existe
            if (this.plan[i].concierto.codigo.equals(concierto.codigo)) {
                if (nuevo_numero_entradas != 0) {
                    if (this.plan[i].numero_de_entradas > nuevo_numero_entradas) {
                        //Primero quito las entradas anteriores
                        this.plan[i].concierto.aforo += this.plan[i].numero_de_entradas;
                        //Y luego añado las nuevas
                        this.plan[i].concierto.aforo -= nuevo_numero_entradas;
                        System.out.println("Cantidad de entradas actualizada.");
                    }
                    else {
                        int entradas_a_comprobar = nuevo_numero_entradas - this.plan[i].numero_de_entradas;
                        if (this.plan[i].concierto.aforo > entradas_a_comprobar) {
                            this.plan[i].concierto.aforo -= entradas_a_comprobar;
                            System.out.println("Cantidad de entradas actualizada.");
                            entradas_modificadas = true;
                        } 
                        else {
                            System.out.println("No hay suficientes entradas disponibles para este concierto");
                        }
                    }
                }
                else {
                    removeConcierto(concierto);
                }
            }
            else {
                System.out.println("No existe el concierto en el plan");
            }
        }
        return entradas_modificadas;
    }
    /**
     * Calcula los subtotales de todos los conciertos del plan
     * @return Retorna el totalSinDescuento
     */
    public double totalSinDescuento() {
        double suma_de_subtotales = 0;
        for (int i = 0; i < this.cant_planes; i++) {
            suma_de_subtotales += this.plan[i].subtotal(this.plan[i].concierto.precio_entrada, this.plan[i].numero_de_entradas);
        }
        return suma_de_subtotales;
    }

    /**
     * Calcula el porcentaje a aplicar en función del número de conciertos
     * @return Devuelve el porcetaje que se aplicará
     */
    public int porcentajeDescuento() {
        if (this.cant_planes <= 2) {
            return 0;
        }
        else if (this.cant_planes <= 4) {
            return 10;
        }
        else {
            return 20;
        }
    }

        /**
         * Aplica el descuento calculado anteriormente
         * @return Devuelve el total con descuento
         */
    public double totalConDescuento() {
        double porcentaje_a_aplicar = (double)porcentajeDescuento() / 100;
        double cantidad_a_descontar = (double)totalSinDescuento() * porcentaje_a_aplicar;
        double resultado = totalSinDescuento() - cantidad_a_descontar;
        return resultado;
    }
    /**
     * Detecta solapamientos y los muestra
     */
    public void detectarSolapamientos() {
        boolean hay_solapamientos = false;
        for (int i = 0; i < this.cant_planes; i++) {
            for (int j = i+1; j < this.cant_planes; j ++) {
                if(this.plan[i].concierto.escenario.equals(this.plan[j].concierto.escenario)) {
                    //Si la hora de fin de un corcierto
                    int hora_inicio_en_minutos_i = this.plan[i].concierto.hora_inicio * 60 + this.plan[i].concierto.minuto_inicio;
                    int hora_inicio_en_minutos_j = this.plan[j].concierto.hora_inicio * 60 + this.plan[j].concierto.minuto_inicio;
                    int hora_final_en_minutos_i = this.plan[i].concierto.hora_fin * 60 + this.plan[i].concierto.minuto_fin;
                    int hora_final_en_minutos_j = this.plan[j].concierto.hora_fin * 60 + this.plan[j].concierto.minuto_fin;
                    if (hora_inicio_en_minutos_j >= hora_inicio_en_minutos_i && hora_inicio_en_minutos_j <= hora_final_en_minutos_i ||
                        hora_final_en_minutos_j >= hora_inicio_en_minutos_i && hora_final_en_minutos_j <= hora_final_en_minutos_i
                    ){
                        System.out.println(this.plan[i].concierto.codigo + "(" + this.plan[i].concierto.hora_inicio + ":" + this.plan[i].concierto.minuto_inicio + ")" + 
                            " solapa con " + this.plan[j].concierto.codigo + "(" + this.plan[j].concierto.hora_inicio + ":" + this.plan[j].concierto.minuto_inicio + ")"
                        );
                        hay_solapamientos = true;

                    }
                }
            }
        }
        if(!hay_solapamientos) {
            System.out.println("No hay solapamientos en este festival");
        }
    }
    /**
     * Ordena el array que hay en PlanFestival en base al precio de la entrada en orden ascendente
     */
    public void ordenarPorPrecio() {
        LineaPlan nuevalinea;
        for (int i = 0; i < this.cant_planes; i++) {
            for (int j = i+1; j < this.cant_planes; j++) {
                if (this.plan[i].concierto.precio_entrada > this.plan[j].concierto.precio_entrada) {
                    nuevalinea = this.plan[j];
                    this.plan[j] = this.plan[i];
                    this.plan[i] = nuevalinea;
                }
            }
        }
        for (int i = 0; i < this.cant_planes; i++) {
            System.out.println(this.plan[i].concierto);
        }
    }
    /**
     * Genera el pase para el festival con toda la infomación y los posibles solapamientos
     */
    public void generarPase() {
        for (int i = 0; i < this.cant_planes; i++) {
            System.out.println(this.plan[i].concierto + " " + "x"+this.plan[i].numero_de_entradas + " Subtotal: " + this.plan[i].subtotal(this.plan[i].concierto.precio_entrada, this.plan[i].numero_de_entradas) + "$");
        }
        System.out.println("--------------------------------------");
        System.out.println("SUBTOTAL GENERAL: " + totalSinDescuento());
        System.out.println("DESCUENTO: " + porcentajeDescuento() + "%");
        System.out.println("TOTAL: " + totalConDescuento());
        System.out.println("CONFLICTOS DETECTADOS: ");
        detectarSolapamientos();
    }
}
