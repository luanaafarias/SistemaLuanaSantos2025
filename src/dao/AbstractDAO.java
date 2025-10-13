/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author u09192385133
 */
public abstract class AbstractDAO {
    
    protected Session session;
    
    public AbstractDAO() {
        SessionFactory sessionFactory = Hibernate.Util.getSessionFactory();
        session = sessionFactory.openSession();
    }
    
    public abstract void insert(Object object);
    public abstract void update(Object object);
    public abstract void delete(Object object);
    public abstract Object list(int codigo);
    public abstract Object listAll();
    
}