package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTxt_log_usr().getText();
        String senha = view.getTxt_log_pwd().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
        
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTxt_log_usr().setText(nome);
        view.getTxt_log_pwd().setText(senha);
    }
    
    public void limparTela(Usuario modelo){
        
        view.getTxt_log_usr().setText("");
        view.getTxt_log_pwd().setText("");
    }
    
}
