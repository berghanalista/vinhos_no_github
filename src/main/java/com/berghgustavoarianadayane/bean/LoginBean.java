
package com.berghgustavoarianadayane.bean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.PrimeFaces;

/**
 *
 * @author berghlinux
 */
@Named
@SessionScoped
public class LoginBean implements Serializable{
    
    private Usuario usuario;

    public Usuario getUsuario() {
        if (usuario==null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    public String logar(){
        String retorna = null;
        if (usuario.getNome().equals("Roozembergh")&& usuario.getSenha().equals("mengo")) {
            retorna = "/index.xhtml?faces-redirect=true";
             PrimeFaces.current().resetInputs("form-login:usuario-nome");
            return retorna;
            
        }else{
            return null;
        }
       
    }
    
}
