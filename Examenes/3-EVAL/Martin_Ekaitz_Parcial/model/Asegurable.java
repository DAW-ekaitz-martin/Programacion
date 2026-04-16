package model;

public interface Asegurable {
    default String contratarSeguro() {
        return "Seguro contrato con éxito";
    }
    String mostrarCondicionesSeguro();
}
