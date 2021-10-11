
package br.com.actions;

import br.com.interfaces.IControle;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tayanne
 */
public class Logout implements IControle {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.removeAttribute("usuarioLogado"); //remove o atributo logado
        session.invalidate(); //remove todos os objetos associados ao cookie
        return "redirect:entrada?acao=FormLogin";
    }
    
}
