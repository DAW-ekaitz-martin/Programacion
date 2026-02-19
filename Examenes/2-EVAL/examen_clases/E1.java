import festival.*;
public class E1 {
    public static void main(String[] args) {
        Festival mi_festival = new Festival("Mi festival");
        Concierto badBunny = new Concierto("BB", "Bad Bunny", "main", 12, 30, 13, 30, 55, 200);
        Concierto drake = new Concierto("DK", "Drake", "main", 11, 30, 13, 30, 15, 200);
        Concierto jcole = new Concierto("JC", "J Cole", "main_2", 12, 30, 13, 30, 35, 200);
        Concierto macmiller = new Concierto("MC", "Mac Miller", "main_3", 12, 30, 13, 30, 25, 200);
        Concierto rihanna = new Concierto("RH", "Rihanna", "main_4", 12, 30, 13, 30, 37, 200);
        PlanFestival mi_plan = new PlanFestival();

        //Añadir los conciertos al festival
        mi_festival.registrarConcierto(badBunny);
        mi_festival.registrarConcierto(drake);
        mi_festival.registrarConcierto(jcole);
        mi_festival.registrarConcierto(macmiller);
        mi_festival.registrarConcierto(rihanna);
        //Prueba de la funcion addConcierto()
        System.out.println("AÑADIR CONCIERTO: ");
        mi_plan.addConcierto(badBunny, 7);
        System.out.println(badBunny.getAforo());
        mi_plan.addConcierto(badBunny, 7);
        System.out.println(badBunny.getAforo());
        //Intentar comprar más entradas que el aforo disponible.
        mi_plan.addConcierto(badBunny, 187);
        System.out.println(badBunny.getAforo());

        //Prueba función removeConcierto()
        System.out.println("ELIMINAR CONCIERTO EXISTENTE: ");
        mi_plan.removeConcierto(badBunny);
        System.out.println(badBunny.getAforo());
        System.out.println("ELIMINAR CONCIERTO QUE NO EXISTE: ");
        mi_plan.removeConcierto(drake);

        //Prueba función cambiarEntradas()
        System.out.println("CAMBIAR ENTRADAS: ");
        mi_plan.addConcierto(jcole, 7);
        System.out.println(jcole.getAforo());
        mi_plan.cambiarEntradas(jcole, 20);
        System.out.println(jcole.getAforo());
        System.out.println("CAMBIAR ENTRADAS DE UN CONCIERTO INEXISTENTE: ");
        mi_plan.cambiarEntradas(badBunny, 6);
        System.out.println("CAMBIAR ENTRADAS A VALOR 0: ");
        mi_plan.cambiarEntradas(jcole, 0);
        System.out.println(jcole.getAforo());

        //Total sin descuento
        System.out.println("CALCULAR TOTAL SIN DESCUENTO: ");
        mi_plan.addConcierto(badBunny, 2);
        mi_plan.addConcierto(jcole, 2);
        System.out.println(mi_plan.totalSinDescuento() + "$");

        //Calcular descuento
        System.out.println("CALCULAR DESCUENTO: ");
        mi_plan.addConcierto(drake, 2);
        mi_plan.addConcierto(macmiller, 2);
        mi_plan.addConcierto(rihanna, 2);
        
        System.out.println("Precio sin descuento: " + mi_plan.totalSinDescuento() + "$");
        System.out.println("Precio con descuento: " + mi_plan.totalConDescuento() + "$");

        //COMPROBAR SOLAPAMIENTOS
        System.out.println("COMPROBAR SOLAPAMIENTOS: ");
        mi_plan.detectarSolapamientos();

        //ORDENAR POR PRECIO
        System.out.println("ORDENAR POR PRECIO: ");
        mi_plan.ordenarPorPrecio();

        //GENERAR PASE
        System.out.println("");
        System.out.println("");
        System.out.println("PASE FESTIVAL: ");
        mi_plan.generarPase();

        //BUSCAR CONCIERTO
        System.out.println("");
        System.out.println("BUSCAR CONCIERTO: ");
        System.out.println(mi_festival.buscarConcierto("BB"));
    }
}
