package model;

public interface Revisable {
    default String realizarRevision() {
        return "Revisión realizada";
    }
    String mostrarNormasRevision();
}
