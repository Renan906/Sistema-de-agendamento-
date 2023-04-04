/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplicativoSistemaAgendamento;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Renan
 */
public class JanelaCadastroAgendamento extends AbstractTableModel {
    private static final int COLUNA_DESCRICAO = 0;
    private static final int COLUNA_DATA = 1;
    private static final int COLUNA_HORA = 2;
    
    private String[] colunas = new String[]{"Tarefa", "Data", "Horário"};
    private ArrayList<Agendamento> agendamentos;
    
    public JanelaCadastroAgendamento(){
        this.agendamentos = new ArrayList<Agendamento>();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public int getRowCount(){
        return agendamentos.size();
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
}
    
    @Override
    public Object getValueAt(int row, int col){
        Agendamento agendamento = agendamentos.get(row);
        switch(col){
            case COLUNA_DESCRICAO:
                return agendamento.obterDescricao();
            case COLUNA_DATA:
                return agendamento.obterData();
            case COLUNA_HORA:
                return agendamento.obterHora();
        }
        return"";
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column){
        Agendamento agendamento = agendamentos.get(row);
        switch(column){
            case COLUNA_DESCRICAO:
                agendamento.atualizarDescricao(aValue.toString());
                break;
            case COLUNA_DATA:
                agendamento.atualizarData(aValue.toString());
                break;
            case COLUNA_HORA:
                agendamento.atualizarHora(aValue.toString());
                break;
        }
    }
    
    public Agendamento obterAgendamento(int indice){
        return agendamentos.get(indice);
    }
    public void incluirAgendamento(Agendamento agendamento){
        agendamentos.add(agendamento);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo, ultimo);
    }
    public void atualizarAgendamento(int indice, Agendamento agendamento){
        agendamentos.set(indice, agendamento);
        fireTableRowsUpdated(indice, indice);
    }
    public void excluirAgendamento(int indice){
        agendamentos.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
    
    
}
