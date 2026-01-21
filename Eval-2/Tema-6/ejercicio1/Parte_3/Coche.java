public class Coche {
    
    String marca;
    //Persona propietario;
    Coche (String marca, int par) {
        this.marca = marca;
        //this.propietario = propietario;
    }
    void mostrarInformacion() {
        System.out.println(this.marca);
        /*System.out.println("Info del propietario: ");
        System.out.println(this.propietario.nombre);
        System.out.println(this.propietario.edad);
        System.out.println(this.propietario.direccion);*/
    }
    /*void cambiarPropietario(Persona nuevoPropietario) {
        this.propietario = nuevoPropietario;
    }*/

}
