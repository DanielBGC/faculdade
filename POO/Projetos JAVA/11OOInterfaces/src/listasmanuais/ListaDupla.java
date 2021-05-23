package listasmanuais;

public class ListaDupla implements Lista {

    int lista[] = new int[10];
    int contador = 0;

    @Override
    public void addLista(int elemento) {
        if (elemento % 2 == 0) {
            lista[contador] = elemento;
            contador++;
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
    void metodoX() {}

}
