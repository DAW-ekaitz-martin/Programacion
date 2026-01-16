public class E5 {
    public static void main(String[] args) {
        int[] vector = {6,3,17,8,42,9,1,5};
        for (int i = 0; i <= vector.length-1; i++) {
            System.out.print(vector[i]);
            if (i < vector.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
        vector = bubble_sort(vector);
        for (int i = 0; i <= vector.length-1; i++) {
            System.out.print(vector[i]);
            if (i < vector.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
    }
    public static int[] bubble_sort(int[] vector) {
        for (int i = 1; i <= vector.length; i++) {
            for (int j = 0; j < vector.length-i; j++) {
                int aux;
                if (vector[j] > vector[j+1]) {
                    aux = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        return vector;
    }
}
