/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import utilitarios.JPAUtil;

/**
 *
 * @author Vinicius charles
 */
public class ProdutoDAO {
    
    public List<Produto> listar(String filtroNome){
        EntityManager em = JPAUtil.getEntityManager();
        List produtos = null;
        try {
            String textoQuery = "SELECT p FROM Produto p " + 
                    "WHERE (:nomeProduto IS NULL OR p.nomeProduto LIKE :nomeProduto)";
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("nomeProduto", filtroNome.isEmpty() ? null : "%" + filtroNome + "%");
            produtos = consulta.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
        return produtos;
    }
}
