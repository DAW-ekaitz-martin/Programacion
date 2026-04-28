
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E20 {
    public static void main(String[] args) {
        ArrayList<Double> notasA1 = new ArrayList<>();
        ArrayList<Double> notasA2 = new ArrayList<>();
        ArrayList<Double> notasA3 = new ArrayList<>();
        notasA1.add(8.9);
        notasA1.add(7.9);
        notasA1.add(5.9);
        notasA1.add(9.9);

        notasA2.add(2.9);
        notasA2.add(5.9);
        notasA2.add(5.9);
        notasA2.add(3.9);

        notasA3.add(8.9);
        notasA3.add(3.9);
        notasA3.add(8.9);
        notasA3.add(3.9);

        Map<String, ArrayList<Double>> notas = new HashMap<>();
        Map<String, Double> medias = new HashMap<>();
        notas.put("Ekaitz", notasA1);
        notas.put("Mateo", notasA2);
        notas.put("Walid", notasA3);
        for(Map.Entry<String, ArrayList<Double>> en : notas.entrySet()) {
            double media = 0;
            for(int i = 0; i < en.getValue().size(); i++) {
                media += en.getValue().get(i);
            }
            media /= en.getValue().size();
            medias.put(en.getKey(), media);
        }
        ArrayList<Double> mediaList = new ArrayList<>();
        for(Map.Entry<String, Double> en : medias.entrySet()) {
            mediaList.add(en.getValue());
        }
        Collections.sort(mediaList, (m1, m2) -> {
            if((double)m1-(double)m2 > 0) {
                return 1;
            }
            else {
                return -1;
            }
        });
        System.out.println("RANKING DE MEDIAS");
        for(Map.Entry<String, Double> en : medias.entrySet()) {
            for(int i = 0; i < mediaList.size(); i++) {
                if(mediaList.get(i)== en.getValue()) {
                    System.out.println("La nota media del alumno " + en.getKey()+ " es " +  en.getValue());
                    break;
                }
            }
            
            
        }
        //System.out.println(mediaList);
    }
}
