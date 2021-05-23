package csimulacaodaolist;

import java.util.ArrayList;
import java.util.List;

public class Filmes {

    private List<Filme> list = null;

    public Filmes(List<Filme> list) {
        this.list = list;

    }

    public boolean adiciona(Filme filme) {
        list.add(filme);
        return true;
    }

    public boolean remove(Filme filme) {
        list.remove(filme);
        return false;
    }

    public boolean altera(Filme filme) {
        
        return false;
    }

    public List<Filme> listaTodos() {
        return list;
    }

    public List<Filme> encontraPorCriterio(Filme filme) {
        return null;
    }

    public Filme encontraPorCodigo(long codigo) {
        
        for (int i = 0; i < list.size(); i++) {
            if (codigo == list.get(i).getId()) {
                return list.get(i);
            }
        }
        return null;
        
    }
    public List<Filme> encontraPorNome(String nome) {
        List<Filme> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (nome.equals(list.get(i).getNome())) {
                temp.add(list.get(i));
            }
        }
        
        return temp;
    }
}
