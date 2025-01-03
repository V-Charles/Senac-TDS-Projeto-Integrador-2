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
public class FornecedorDAO {
    
    public List<Fornecedor> listar(String filtroNome){
        EntityManager em = JPAUtil.getEntityManager();
        List fornecedores = null;
        try {
            String textoQuery = "SELECT f FROM Fornecedor f "
                    + "WHERE (:nomeFornecedor is null OR f.nomeFornecedor LIKE :nomeFornecedor)"
                    + "AND f.ativo = true";
            
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("nomeFornecedor", filtroNome.isEmpty() ? null : "%" + filtroNome + "%");
            fornecedores = consulta.getResultList();
        } finally {
            JPAUtil.closeEntityManager();
        }
        return fornecedores;
    }
}
