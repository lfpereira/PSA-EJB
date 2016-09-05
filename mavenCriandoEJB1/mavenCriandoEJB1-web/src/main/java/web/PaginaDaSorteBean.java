package web;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author 12111087
 */
@Named
@RequestScoped
public class PaginaDaSorteBean {

    @EJB
    private negocio.SorteadorBeanLocal sorteadorBean;

    public int getNumero() {
        return sorteadorBean.getNumero();
    }
}