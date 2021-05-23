package listasmanuais;

public class TestaEstrutura {
	
	public static void main(String args[]) {
            //Lista lista = new ListaSimples();
            Lista lista = new ListaDupla();
            
            lista.addLista(2);
            lista.addLista(3);
            lista.addLista(4);
            lista.addLista(5);
            lista.addLista(6);
            lista.addLista(7);
            lista.addLista(12);
            lista.addLista(8);
            lista.addLista(9);
            lista.addLista(10);
            lista.addLista(11);
            
            lista.imprimeLista();
       }
}
