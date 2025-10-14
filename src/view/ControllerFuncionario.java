/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LbfFuncionarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ghostface
 */


public class ControllerFuncionario extends AbstractTableModel {
    
    private List<LbfFuncionarios> lstFuncionario;
    
    public void setList(List<LbfFuncionarios> lstFuncionario){
        this.lstFuncionario = lstFuncionario;
    }
    
    public LbfFuncionarios getBean(int rowIndex){
        return lstFuncionario.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstFuncionario == null ? 0 : lstFuncionario.size();
    }

    @Override
    public int getColumnCount() {
        return 4; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LbfFuncionarios f = lstFuncionario.get(rowIndex);
        switch (columnIndex) {
            case 0: return f.getLbfIdFuncionarios();
            case 1: return f.getLbfNome();
            case 2: return f.getLbfCargo();
            case 3: return f.getLbfSalario();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "Cargo";
            case 3: return "Salário";
            default: return "";
        }
    }
}
