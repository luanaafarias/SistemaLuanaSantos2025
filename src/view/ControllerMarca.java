/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import bean.LbfMarcas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ghostface
 */


public class ControllerMarca extends AbstractTableModel {
    
    private List<LbfMarcas> lstMarca;
    
    public void setList(List<LbfMarcas> lstMarca){
        this.lstMarca = lstMarca;
    }
    
    public LbfMarcas getBean(int rowIndex){
        return lstMarca.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstMarca == null ? 0 : lstMarca.size();
    }

    @Override
    public int getColumnCount() {
        return 4; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LbfMarcas m = lstMarca.get(rowIndex);
        switch (columnIndex) {
            case 0: return m.getLbfIdMarcas();
            case 1: return m.getLbfNomeDaMarca();
            case 2: return m.getLbfPaisDeOrigem();
            case 3: return m.getLbfTelefone();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "País";
            case 3: return "Telefone";
            default: return "";
        }
    }
}
