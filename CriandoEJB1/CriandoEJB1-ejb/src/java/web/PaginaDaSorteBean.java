/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author 13108286
 */
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import negocio.SorteadorLocal;

@Named
@RequestScoped
public class PaginaDaSorteBean {

    @EJB(name = "sorteadorBean")
    private SorteadorLocal sorteadorBean;

    public int getNumero() {
        return sorteadorBean.getNumero();
    }
 
}

