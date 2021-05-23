package controleremoto;

public class ControleRemotoDuduCorporation implements ControleRemoto {
     private double pi = Math.PI;
     private double potenciacao = Math.pow(2, 3);
     
     
    @Override
    public void ligar() {
        double resultado = pi * potenciacao;
        
       if (resultado < 20) {
           System.out.println("televisao ligou");
       }
    }

    @Override
    public void desligar() {
        
    }

    @Override
    public int trocarCanal(int x) {
        return 1000;
    }
}
