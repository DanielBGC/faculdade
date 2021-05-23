package ccrudjava8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteContato {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new TesteContato();
    }

    public TesteContato() {
        List<Contato> contatos = null;
        ContatoDAO contatoDAO = new ContatoDAO();
        
        contatoDAO.adiciona(this.obtemContatoExemplo());
        //System.out.println("\n\nDado adicionado:");
        contatos = contatoDAO.lista(null);
        this.imprimeLista(contatos);
        
        
        /*
        long resultado = contatoDAO.adicionaERetornaId(this.obtemContatoExemplo());
        System.out.println("\n\nDado adicionado: ");
        contatos = contatoDAO.lista(null);
        this.imprimeLista(contatos);
        */
         
         
        /*
        Contato c = contatoDAO.buscaPorCriterioAlternativa1(30l);
        System.out.println("Contato retornado: ");
        System.out.println(c);
        */
        
        /*
        contatos = contatoDAO.buscaPorCriterioAlternativa2(30l);
        System.out.println("Contato(s) retornado(s): ");
        for (Contato contato : contatos) {
            System.out.println(contato);    
        }
        */
              
        
        /*
         contatoDAO.altera(this.obtemContatoExemploAltera());
         System.out.println("\n\nDado alterado:");
         contatos = contatoDAO.lista(null);
         this.imprimeLista(contatos);
        */
        
        /*
         contatoDAO.exclui(this.obtemContatoExemploExclui());
         System.out.println("\n\nDado excluído:");
         contatos = contatoDAO.lista(null);
         this.imprimeLista(contatos);
         */      
    }
    
    private void imprimeLista(List<Contato> contatos) {
        for (Contato c : contatos) {
         System.out.println(c);
         }
    }

    private Contato obtemContatoExemplo() {
        Contato contato = new Contato();
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        contato.setNome("Manezaoooo. Hora: " + hora);
        
        contato.setEndereco("Rua Dr Florestan");
        contato.setEmail("eduardosilvestre@iftm.edu.br");
        contato.setDataNascimento(LocalDate.now());
        return contato;
    }

    private Contato obtemContatoExemploAltera() {
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        Contato contato = new Contato();
        contato.setId(12l);
        contato.setEndereco("Rua ABCD. Com hora: " + hora);
        
        return contato;
    }

    private Contato obtemContatoExemploExclui() {
        Contato contato = new Contato();
        contato.setId(14l);
        return contato;
    }
}
