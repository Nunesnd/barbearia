package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
    public static void main (String[] args){
        
        Cliente cliente = new Cliente(1, "Alex", "Rua da Silva", "4567898");
        
        System.err.println("Primeira linha "+ cliente.getNome());
        
        //System.err.println("Segunda linha "+ cliente.getId());
        //System.err.println("Terceira linha "+ cliente.getEndereco());
        //System.err.println("Quarta linha "+ cliente.getCep());
        
        
        Usuario user = new Usuario(1, "Ana", "jhgfdertyui", "Qualquer");
        
        //System.out.println("Quinta linha "+ user.getId());
        //System.out.println("Sexta linha "+ user.getNivelAcesso());
        //System.out.println("Setima linha "+ user.getSenha());
        
        Servico serv = new Servico(1, "Barba", 15);
        
        Agendamento agendaa = new Agendamento(1, cliente, serv, 0, "21/05/2022 13:00");
        
        System.out.println(agendaa.getCliente().getNome());
        
    }
}
