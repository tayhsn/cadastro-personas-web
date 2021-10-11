
package br.com.actions;

import br.com.dao.Banco;
import br.com.interfaces.IControle;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tayanne
 */
public class RemoverPersona implements IControle {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int paramsId = Integer.parseInt(req.getParameter("id"));
        
        Banco banco = new Banco();
        banco.remover(paramsId);
        
        return "redirect:entrada?acao=ListarPersonas";
    }
    
}
