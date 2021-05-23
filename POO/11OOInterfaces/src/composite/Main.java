package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Grafico> lista = new ArrayList<>();

        Foto f = new Foto();
        Linha l = new Linha();
        Texto t = new Texto();
        
        lista.add(l);
        lista.add(t);

        f.adicionarGrafico(new Linha());
        f.adicionarGrafico(new Retangulo());
        lista.add(f);

        for (Grafico grafico : lista) {
            grafico.desenhar();
        }

    }

}
