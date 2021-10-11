package br.com.actions;

import br.com.dao.Banco;
import br.com.interfaces.IControle;
import br.com.models.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tayanne
 */
public class Login implements IControle {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String login = req.getParameter("txtLogin");
        String senha = req.getParameter("txtSenha");
        
        Banco banco = new Banco();
        Usuario usuario = banco.existeUsuario(login, senha);
        
        if(usuario != null) {
            HttpSession sessao = req.getSession();
            sessao.setAttribute("usuarioLogado", usuario);
            return "redirect:entrada?acao=Home";
        } else {
            return "redirect:entrada?acao=FormLogin";
        }
    }
    
}
