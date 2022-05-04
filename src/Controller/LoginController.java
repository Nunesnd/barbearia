package Controller;

import View.Login;

public class LoginController {

    private final Login view;

    public LoginController( Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema(){
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no BD");
        
        this.view.exibeMensagem("Metodo FizTrefa executado");
    }
    
}
