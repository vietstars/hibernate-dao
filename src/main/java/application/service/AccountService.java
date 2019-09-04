package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import application.dao.AccountDAO;
import application.entities.Account;

@Service
@Transactional
public class AccountService {

	@Autowired
	private AccountDAO accountDAO;

	public List<Account> findAll() {
		return accountDAO.findAll();
	}

	// public Account findById(final int id) {
	// 	return accountDAO.findById(id);
	// }

	// public void save(final Account account) {
	// 	accountDAO.save(account);
	// }

	// public void update(final Account account) {
	// 	accountDAO.update(account);
	// }

	// public void delete(final int id) {
	// 	Account account = accountDAO.findById(id);
	// 	if (account != null) {
	// 		accountDAO.delete(account);
	// 	}
	// }
}
