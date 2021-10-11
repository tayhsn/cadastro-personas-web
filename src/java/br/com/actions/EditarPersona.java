
package br.com.actions;

import br.com.dao.Banco;
import br.com.interfaces.IControle;
import br.com.models.Persona;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tayanne
 */
public class EditarPersona implements IControle {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("txtNome");
        String genero = req.getParameter("txtGenero");
        
        String paramsData = req.getParameter("txtData"); // recebe a data sem formatação;;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //cria instancia do formatador
        Date dataNascimento = null; // cria variavel que vai receber a data formatada
        try {
            dataNascimento = sdf.parse(paramsData); //tenta formatar | parse = metodo do formatador
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        
        Banco banco = new Banco();
        
        Persona persona = banco.getPersonaById(id);
        persona.setNome(nome);
        persona.setGenero(genero);
        persona.setDataNascimento(dataNascimento);
        
        return "redirect:entrada?acao=ListarPersonas";
    }
    
}
