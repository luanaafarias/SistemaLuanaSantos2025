/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LbfFuncionarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09192385133
 */

public class LbfFuncionariosDAO extends AbstractDAO {

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
    public List<LbfFuncionarios> list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LbfFuncionarios.class);
        criteria.add(Restrictions.eq("lbfIdFuncionarios", codigo));
        List<LbfFuncionarios> lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

  
    @Override
    public List<LbfFuncionarios> listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LbfFuncionarios.class);
        List<LbfFuncionarios> lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    // Teste simples do DAO
    public static void main(String[] args) {
        LbfFuncionariosDAO dao = new LbfFuncionariosDAO();

        List<LbfFuncionarios> funcionarios = dao.listAll();
        for (LbfFuncionarios f : funcionarios) {
            System.out.println(f.getLbfIdFuncionarios() + " - " + f.getLbfNome());
        }

        System.out.println("DAO de funcionários funcionando!");
    }
}
