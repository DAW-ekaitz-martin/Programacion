package app;
import model.*;
public class GestionAlquiler {
    Vehiculo[] vehiculos = new Vehiculo[3];
    private int numVehiculos = 0;
    /**
     * Esta función añade vehiculos al registro de vehiculos ampliando la longitud del resitro si es necesario
     * @param vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo) {
        if (this.numVehiculos >= 3) {
            Vehiculo[] nuevoVehiculos = new Vehiculo[this.vehiculos.length+1];
            for (int i = 0; i <= this.vehiculos.length-1; i++) {
                nuevoVehiculos[i] = this.vehiculos[i];
            }
            this.vehiculos = nuevoVehiculos;

        }
        this.vehiculos[this.numVehiculos] = vehiculo;
        this.numVehiculos ++;
        /*if (this.numVehiculos == 2) {
            this.vehiculos = Arrays.copyOf(this.vehiculos, this.vehiculos.length+1);
        }
        this.vehiculos[this.numVehiculos] = vehiculo;
        this.numVehiculos ++;*/
    }
    /**
     * Esta función lista todos los vehiculos que se encuentran en el registro
     */
    public void listarVehiculos() {
        boolean hayVehiculos = false;
        for (int i = 0; i <= this.vehiculos.length-1; i++) {
            if (this.vehiculos[i] != null) { //Para que no muestre los nulos si hay menos de 3 vehiculos
                System.out.println(i + "-" + this.vehiculos[i]);
                hayVehiculos = true;
            }
            
        }
        if (!hayVehiculos) {
            System.out.println("La lista de vehiculos está vacia");
        }
    }
    /**
     * Elimina el vehiculo que se encuentra en una posicion específica, eliminando la longitud del registro siempre que sea superior a tres
     * @param posicion
     */
    public void eliminarVehiculo(int posicion) {
        if (posicion < 0 || posicion >= this.vehiculos.length) {
            System.out.println("No hay vehiculos en esa posicion");
        }
        else {
            Vehiculo[] nuevoVehiculos;
            if (this.vehiculos.length <= 3) {
                nuevoVehiculos = new Vehiculo[3];
            }
            else {
                nuevoVehiculos = new Vehiculo[this.vehiculos.length-1];
            }
            int pos = 0;
            for (int i = 0; i <= this.vehiculos.length-1; i++) {
                if (i != posicion) {
                    nuevoVehiculos[pos] = this.vehiculos[i];
                    pos ++;
                }
            }
            this.vehiculos = nuevoVehiculos;
        }
        
    }
}


