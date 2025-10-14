/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LbfProdutos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author u09192385133
 */

public class LbfProdutosDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LbfProdutos.class);
        criteria.add(Restrictions.eq("lbfIdProdutos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LbfProdutos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        LbfProdutosDAO dao = new LbfProdutosDAO();
        List lista = (List) dao.listAll();
        System.out.println("Total de produtos: " + lista.size());
    }
}
