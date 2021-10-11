
package br.com.actions;

import br.com.dao.Banco;
import br.com.interfaces.IControle;
import br.com.models.Persona;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tayanne
 */
public class ListarPersonas implements IControle {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Persona> listaPersonas = banco.getPersonas();
        req.setAttribute("personas", listaPersonas);
        
        return "forward:/listarPersonas.jsp";
    }
    
}
