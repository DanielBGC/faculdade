package listasmanuais;

public class ListaSimples implements Lista {

    int lista[] = new int[10];
    int contador = 0;

    @Override
    public void addLista(int elemento) {
        if (elemento % 2 == 1) {
            lista[contador++] = elemento;
        }
    }

    @Override
    public void removeLista(int elemento) {
		// TODO Auto-generated method stub
    }

    @Override
    public void imprimeLista() {
        System.out.println("imprimindo lista");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
