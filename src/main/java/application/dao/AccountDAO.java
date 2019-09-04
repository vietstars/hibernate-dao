package application.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import application.entities.Account;


@Repository(value = "accountDAO")
@Transactional(rollbackFor = Exception.class)
public class AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// public void save(final Account account) {
	// 	Session session = this.sessionFactory.getCurrentSession();
	// 	session.save(account);
	// }

	// public void update(final Account account) {
	// 	Session session = this.sessionFactory.getCurrentSession();
	// 	session.update(account);
	// }

	// public Account findById(final Integer id) {
	// 	Session session = this.sessionFactory.getCurrentSession();
	// 	return session.get(Account.class, id);
	// }

	// public void delete(final Account account) {
	// 	Session session = this.sessionFactory.getCurrentSession();
	// 	session.remove(account);
	// }

	public List<Account> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Account", Account.class).getResultList(); 
	}
}
