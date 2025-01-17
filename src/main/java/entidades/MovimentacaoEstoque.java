/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

/**
 *
 * @author Vinicius charles
 */

@Entity
public class MovimentacaoEstoque {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "produtoId")
    private Produto produto;
    
    @ManyToOne
    @JoinColumn(name = "fornecedorId")
    private Fornecedor fornecedor;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoMovimentacao")
    private TipoMovimentacao tipoMovimentacao;
    
    private int quantidadeMovimentada;
    private LocalDate dataMovimentacao;
    
    public MovimentacaoEstoque(){
    }

    public MovimentacaoEstoque(int id, Produto produto, Fornecedor fornecedor, TipoMovimentacao tipoMovimentacao, int quantidadeMovimentada, LocalDate dataMovimentacao) {
        this.id = id;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidadeMovimentada = quantidadeMovimentada;
        this.dataMovimentacao = dataMovimentacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getQuantidadeMovimentada() {
        return quantidadeMovimentada;
    }

    public void setQuantidadeMovimentada(int quantidadeMovimentada) {
        this.quantidadeMovimentada = quantidadeMovimentada;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
}
