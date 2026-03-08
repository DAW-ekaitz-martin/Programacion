package instituto;

public interface Inscribible {
    /**
     * devuelve si pudo inscribirlo
     * @param a
     * @return
     */
    boolean inscribir(Alumno a);
    int plazasDisponibles();
}
