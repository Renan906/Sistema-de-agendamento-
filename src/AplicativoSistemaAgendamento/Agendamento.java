/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplicativoSistemaAgendamento;

/**
 *
 * @author Renan
 */
public class Agendamento {
    
    private String descricao;
    private String data;
    private String hora;
    
    public String obterDescricao(){
        return descricao;
    }
    public String obterData(){
        return data;
    }
    public String obterHora(){
        return hora;
    }

    public void atualizarDescricao(String descricao){
        this.descricao = descricao;
}
    public void atualizarData(String data){
        this.data = data;
}
    public void atualizarHora(String hora){
        this.hora = hora;
}

}
