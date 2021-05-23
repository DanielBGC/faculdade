package djdbctransaction;


import ccrudjava8.Contato;
import ccrudjava8.ContatoDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteJDBCTransactionJava8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new TesteJDBCTransactionJava8();
    }

    public TesteJDBCTransactionJava8() {
         
        ContatoDAO contatoDAO = new ContatoDAO();
        ContatoDAOTransaction contatoDAOTransaction = new ContatoDAOTransaction();
        
        String enderecoHoje = "Endereco de hoje: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        contatoDAOTransaction.adicionaEAltera(this.obtemContatoExemplo(),enderecoHoje);
        System.out.println("\n\nDado adicionado:");
        this.imprimeLista(contatoDAO.lista(null));
        
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
}
