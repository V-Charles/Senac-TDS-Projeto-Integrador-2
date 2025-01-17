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
public class MovimentacaoDAO {
    
    public List<MovimentacaoEstoque> listar(String filtroProduto, String filtroFornecedor, String filtroId, boolean filtroEntrada, boolean filtroSaida, boolean filtroReposicao){
        EntityManager em = JPAUtil.getEntityManager();
        List<MovimentacaoEstoque> movimentacoes = new ArrayList<>();
        try {
            String textoQuery = "SELECT m FROM MovimentacaoEstoque m " +
                    "JOIN m.produto p " +
                    "JOIN m.fornecedor f " +
                    "WHERE (:nomeProduto IS NULL OR p.nomeProduto LIKE :nomeProduto) " +
                    "AND (:nomeFornecedor IS NULL OR f.nomeFornecedor LIKE :nomeFornecedor) " +
                    "AND (:id IS NULL OR m.id = :id) ";
            
            List<TipoMovimentacao> tipos = new ArrayList<>();
            if(filtroEntrada) tipos.add(TipoMovimentacao.ENTRADA);
            if(filtroSaida) tipos.add(TipoMovimentacao.SAIDA);
            if(filtroReposicao) tipos.add(TipoMovimentacao.REPOSICAO);
            
            if(!tipos.isEmpty()){
                textoQuery += "AND m.tipoMovimentacao IN :tipo ";
            }
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("nomeProduto", filtroProduto.isEmpty() ? null : "%" + filtroProduto + "%");
            consulta.setParameter("nomeFornecedor", filtroFornecedor.isEmpty() ? null : "%" + filtroFornecedor + "%");
            Integer idFiltro = filtroId.isEmpty() ? null : Integer.parseInt(filtroId);
            consulta.setParameter("id", idFiltro);
            
            if(!tipos.isEmpty()){
                consulta.setParameter("tipo", tipos);
            }
            movimentacoes = consulta.getResultList();
        } catch (NumberFormatException e) {
            System.out.println("Erro gerado: " + e.getMessage());
        } finally {
            JPAUtil.closeEntityManager();
        }
        return movimentacoes;
    }
}
