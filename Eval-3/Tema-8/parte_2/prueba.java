public class prueba {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(buscarBinaria(array,-4));
    }
    public static int buscarBinaria(int[] ordenados, int objetivo) {
		boolean encontrado = false;
		int posInicio = 0;
		int posFin = ordenados.length-1;
		int posBuscar = (ordenados.length-1)/2;
        int i = 0;
		while(i <= ordenados.length/2) {
			
			if(ordenados[posBuscar] == objetivo) {
				encontrado = true;
                break;
			}
			else if(ordenados[posBuscar] < objetivo) {
				posInicio = posBuscar;
                int diferencia = (posFin - posInicio)/2;
                if (diferencia < 1) {
                    diferencia = 1;
                }
				posBuscar += diferencia;
			}
			else {
				posFin = posBuscar;
                int diferencia = (posFin - posInicio)/2;
                if (diferencia < 1) {
                    diferencia = 1;
                }
				posBuscar -= diferencia;
			}
            i++;
		}
        if (!encontrado) {
            return -1;
        }
		return posBuscar;
	}
}
