package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Leonardo", "leo@gmail.com");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();
        
        System.out.println("O Id gerado foi: " + novoUsuario.getId());
        
        em.clear();
        emf.close();
    }

}
