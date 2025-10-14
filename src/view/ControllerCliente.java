/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LbfClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ghostface
 */

public class ControllerCliente extends AbstractTableModel {
    
    private List<LbfClientes> lstCliente;
    
    public void setList(List<LbfClientes> lstCliente){
        this.lstCliente = lstCliente;
    }
    
    public LbfClientes getBean(int rowIndex){
        return lstCliente.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstCliente == null ? 0 : lstCliente.size();
    }

    @Override
    public int getColumnCount() {
        return 4; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LbfClientes c = lstCliente.get(rowIndex);
        switch (columnIndex) {
            case 0: return c.getLbfIdClientes();
            case 1: return c.getLbfNome();
            case 2: return c.getLbfCpf();
            case 3: return c.getLbfRg();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "CPF";
            case 3: return "RG";
            default: return "";
        }
    }
}
