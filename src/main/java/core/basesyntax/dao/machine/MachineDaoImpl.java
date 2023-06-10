package core.basesyntax.dao.machine;

import core.basesyntax.dao.AbstractDao;
import core.basesyntax.exception.DataProcessingException;
import core.basesyntax.model.machine.Machine;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class MachineDaoImpl extends AbstractDao implements MachineDao {

    public MachineDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Machine save(Machine machine) {
        Transaction transaction = null;
        try (Session session = sessionFactory.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(machine);
            transaction.commit();
            return machine;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert machine " + machine, e);
        }
    }

    @Override
    public List<Machine> findByAgeOlderThan(int age) {
        try (Session session = sessionFactory.getSessionFactory().openSession()) {
            int currentYear = LocalDate.now().getYear();
            int targetYear = currentYear - age;
            Query<Machine> query = session.createQuery("FROM Machine WHERE year < :age", Machine.class);
            query.setParameter("age", targetYear);
            return query.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find machine by age greater than: " + age, e);
        }
    }

}
