package composite;

import java.util.ArrayList;
import java.util.List;

public class Foto implements Grafico {

    private List<Grafico> filhos = new ArrayList<>();

    public void adicionarGrafico(Grafico grafico) {
        filhos.add(grafico);
    }

    public void removerGrafico(Grafico grafico) {
        filhos.remove(grafico);
    }

    @Override
    public void desenhar() {
        System.out.println("Foto:");
        for (Grafico grafico : filhos) {
            grafico.desenhar();
        }

    }

}
