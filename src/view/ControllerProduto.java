/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LbfProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ghostface
 */

public class ControllerProduto extends AbstractTableModel {
    
    private List<LbfProdutos> lstProduto;
    
    public void setList(List<LbfProdutos> lstProduto){
        this.lstProduto = lstProduto;
    }
    
    public LbfProdutos getBean(int rowIndex){
        return lstProduto.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProduto == null ? 0 : lstProduto.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LbfProdutos p = lstProduto.get(rowIndex);
        switch (columnIndex) {
            case 0: return p.getLbfIdProdutos();
            case 1: return p.getLbfNomeDoProduto();
            case 2: return p.getLbfMarcas();
            case 3: return p.getLbfPreco();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        switch (columnIndex) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "Marca";
            case 3: return "Preço";
            default: return "";
        }
    }
}
