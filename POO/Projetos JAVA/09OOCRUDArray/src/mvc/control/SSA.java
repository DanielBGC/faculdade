/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.control;

import mvc.model.Filme;
import mvc.model.FilmeDAORAM;
import mvc.model.Usuario;
import mvc.model.UsuarioDAORAM;
import mvc.view.GUI;

/**
 *
 * @author EDYA
 */
public class SSA {
    
    UsuarioDAORAM usuarioDAORAM = new UsuarioDAORAM();
    GUI gui = new GUI();
    FilmeDAORAM filmeDAORAM = new FilmeDAORAM();

    public SSA() {
        //preencher as informações do usuário
        filmeDAORAM.getFilmes();

        //SUPONHA QUE A CLASSE FILME PRECISA DE USUÁRIOS.
        //NAS DUAS ALTERNATIVAS É POSSÍVEL MANIPULAR TODOS OS USUÁRIOS.
        //A ALTERNATIVA 1: 
        //(i) encapsula melhor os dados
        //(ii) é como se tivesse passando uma instância do banco para qualquer parte do seu programa
        filmeDAORAM.metodoQualquerUsaUsuarios1(usuarioDAORAM);
        filmeDAORAM.metodoQualquerUsaUsuarios2(usuarioDAORAM.getUsuarios());
        
        do {
            int opcaoUsuario = gui.menuBoasVindas();

            //o loop do programa como outros exemplos
            switch (opcaoUsuario) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    break;
                
            }
            
        } while (true);
        //dao.inserir(null);
    }
    
    public static void main(String[] args) {
        new SSA();
    }
    
}
