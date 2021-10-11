
package br.com.actions;

import br.com.dao.Banco;
import br.com.interfaces.IControle;
import br.com.models.Persona;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tayanne
 */
public class CarregarDados implements IControle {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        
        Banco banco = new Banco();
        Persona persona = banco.getPersonaById(id);
        req.setAttribute("persona", persona);
        
        return "forward:formEditar.jsp";
    }
    
}
