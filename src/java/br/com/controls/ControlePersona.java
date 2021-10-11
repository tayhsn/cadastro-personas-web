
package br.com.controls;

import br.com.interfaces.IControle;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tayanne
 */
@WebServlet(urlPatterns = "/entrada")
public class ControlePersona extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramsAcao = req.getParameter("acao");
        String nomeDaClasse = "br.com.actions." + paramsAcao;
        String nome = null;
        
        try {
            Class classe = Class.forName(nomeDaClasse);
            IControle acao = (IControle) classe.newInstance();
            nome = acao.executar(req, resp);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new ServletException(ex);
        }
        
        String[] tipoEndereco = nome.split(":");
        
        if(tipoEndereco[0].equals("forward")) {
            RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/"+tipoEndereco[1]);
            rd.forward(req, resp);
        } else {
            resp.sendRedirect(tipoEndereco[1]);
        }
        
    }
    
}
