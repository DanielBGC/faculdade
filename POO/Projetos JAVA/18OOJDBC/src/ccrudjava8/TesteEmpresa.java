package ccrudjava8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TesteEmpresa {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new TesteEmpresa();
    }

    public TesteEmpresa() {
        
        EmpresaDAO empresaDAO = new EmpresaDAO();
        
        empresaDAO.adiciona(this.obtemEmpresaExemplo());
        System.out.println("\n\nDado adicionado:");
        
        List<Empresa> empresas = empresaDAO.lista(null);
        this.imprimeLista(empresas);
    }
    
    private void imprimeLista(List<Empresa> empresas) {
        for (Empresa c : empresas) {
         System.out.println(c);
         }
    }

    private Empresa obtemEmpresaExemplo() {
        Contato contato = new Contato();
        contato.setId(2l);
        
        Empresa empresa = new Empresa();
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        empresa.setNome("IFTM UPT. Hora: " + hora);
        empresa.setContato(contato);
        
        return empresa;
    }
}
