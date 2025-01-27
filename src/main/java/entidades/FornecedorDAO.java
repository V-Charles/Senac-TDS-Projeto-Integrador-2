/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import utilitarios.JPAUtil;

/**
 *
 * @author Vinicius charles
 */
public class FornecedorDAO {
    
    public void cadastrar(Fornecedor f){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public void atualizar(Fornecedor f){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(f);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public void excluir(Fornecedor f){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            f.setAtivo(false);
            em.merge(f);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public Fornecedor obter(int id){
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Fornecedor.class, id);
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public List<Fornecedor> listarTodos(){
        EntityManager em = JPAUtil.getEntityManager();
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        try {
            String textoQuery = "SELECT f FROM Fornecedor f WHERE f.ativo = true";
            Query consulta = em.createQuery(textoQuery);
            fornecedores = consulta.getResultList();
        }catch(Exception e) {
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
        return fornecedores;
    }
    
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
