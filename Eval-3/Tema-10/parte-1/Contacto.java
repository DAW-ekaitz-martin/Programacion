public class Contacto implements Comparable<Contacto>{
    String nombre, email;
    int telefono;
    public Contacto(String nombre, String email, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    @Override
    public String toString() {
        return this.nombre + ", Email: " + this.email + ", Teléfono: " + this.telefono;
    }
    @Override
    public int compareTo(Contacto contacto) {
        return this.nombre.compareTo(contacto.getNombre());
    }
}
