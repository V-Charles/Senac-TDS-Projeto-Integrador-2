/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package entidades;

/**
 *
 * @author Vinicius charles
 */
public enum TipoMovimentacao {
    
    ENTRADA("Entrada"),
    SAIDA("Saída"),
    REPOSICAO("Reposição");
    
    TipoMovimentacao(String descricao){
        this.nome = descricao;
    }
    
    private String nome;
    
    @Override
    public String toString(){
        return nome;
    }
}
