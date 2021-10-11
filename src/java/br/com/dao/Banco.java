
package br.com.dao;

import br.com.models.Persona;
import br.com.models.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Tayanne
 */
public class Banco {
    private static int id = 1;
    private static List<Persona> personasList = new ArrayList<>();
    private static List<Usuario> usuariosList = new ArrayList<>();
    
    static {
        Persona p1 = new Persona();
        p1.setId(id++);
        p1.setNome("Tayanne");
        p1.setGenero("Feminino");
        
        Persona p2 = new Persona();
        p2.setId(id++);
        p2.setNome("Anildo");
        p2.setGenero("Masculino");
        
        personasList.add(p1);
        personasList.add(p2);
        
        Usuario usu1 = new Usuario(id++, "tayh", "123");
        usuariosList.add(usu1);
    }
    
    public void adicionar(Persona p) {
        p.setId(Banco.id++);
        Banco.personasList.add(p);
    }
    
    public void remover(int id) {
        Iterator<Persona> it = personasList.iterator();
        while(it.hasNext()){
            Persona p = it.next();
            if(p.getId() == id) it.remove();
        }
    }
    
    public Persona getPersonaById(int id) {
        for(Persona p : personasList) {
            if(p.getId() == id) return p;
        }
        return null;
    }
    
    public List<Persona> getPersonas() {
        return Banco.personasList;
    }
    
    public Usuario existeUsuario(String login, String senha) {
        for(Usuario u : usuariosList) {
           if(u.validar(login, senha)) return u;
        }
        return null;
    }
}
