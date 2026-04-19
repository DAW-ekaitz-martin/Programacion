import java.util.ArrayList;
import java.util.Collections;

public class E10 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ekaitz Martin");
        nombres.add("Enrique Fernadez");
        nombres.add("Marcelo Diaz");
        nombres.add("Nacho Iglesias");
        
        Collections.sort(nombres, (n1, n2) -> {
            String[] n1Split = n1.split(" ");
            String[] n2Split = n2.split(" ");
            if (n1Split[1] != n2Split[1]) {
                if (n1Split[1].compareToIgnoreCase(n2Split[1]) > 0) { //Si el apellido de n1 es "mas grande" que el de n2, Que quiere decir eso? Que va antes o después en el abecedario?
                    //Intuyo que si el if da positivo, es porque el apellido de n1 viene más tarde en el abecedario(está en una posición más alta)    
                    return n2.compareTo(n1); //Por lo que devuelvo primero n2.(ascendente)
                }
                else {
                    //Sino es más grande, como ya he comprobado que son distintos, devuelvo n1 primero(porque por descarte n2 es más grande)
                    return n1.compareTo(n2);
                }
            }
            else {
                if (n1Split[0] != n2Split[0]) {
                    //Si los apellidos son iguales y los nombres diferentes, ordeno por nombre en orden descendente
                    if (n1Split[0].compareToIgnoreCase(n2Split[0]) > 0) { //Si el nombre de n1 es más grande(va mas tarde en el abecedario), lo muestro antes  
                        return n1.compareTo(n2);
                    }
                    else {
                        return n2.compareTo(n1);
                    }
                }
                //Si los nombres también son iguales, devuelvo n1 mismamente porque son identicos el nombre y apellido
                else {
                    return n1.compareTo(n2);
                }
                
            }
            
        });
    }
}
