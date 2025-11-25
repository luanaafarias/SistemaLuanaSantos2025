/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.LbfUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09192385133
 */


public class Lbf_UsuariosDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(LbfUsuarios.class);
        criteria.add(Restrictions.eq("lbfIdUsuarios", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LbfUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public boolean autenticar(String nome, String senha) {
        try {
            session.beginTransaction();

            String hql = "FROM LbfUsuarios WHERE lbfNome = :nome AND lbfSenha = :senha";
            org.hibernate.Query query = session.createQuery(hql);

            query.setParameter("nome", nome);
            query.setParameter("senha", senha);

            LbfUsuarios usuario = (LbfUsuarios) query.uniqueResult();

            session.getTransaction().commit();

            return usuario != null;

        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Lbf_UsuariosDAO.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);

            return false;
        }
    }
}

