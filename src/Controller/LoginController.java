package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController( Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        //pegar nome de usuario e senha (view
        Usuario usr = helper.obterModelo();
        
        //pesqusar usuario no BD        
        UsuarioDAO usrDAO = new UsuarioDAO();
        Usuario usrAutenticado = usrDAO.selectPorNomeESenha(usr);
        //se usr e pwd true envia para tela de menu
        if (usrAutenticado != null){
            //navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
        //se usr e pwd false mostrar messagem de erro ou inválido
        view.exibeMensagem("Usuário e senha inválidos.");
        }
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no BD");
        
        this.view.exibeMensagem("Metodo FizTrefa executado");
    }
    
}
