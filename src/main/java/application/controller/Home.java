package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import application.entities.Account;
import application.service.AccountService;

@Controller
public class Home {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value={"/", "/home"})
	public String homepage(Model model) {
		model.addAttribute("accounts", accountService.findAll());
		return "home";
	}

	// @RequestMapping("/customer-save")
	// public String insertCustomer(Model model) {
	// 	model.addAttribute("customer", new Customer());
	// 	return "customer-save";
	// }

	// @RequestMapping("/customer-view/{id}")
	// public String viewCustomer(@PathVariable int id, Model model) {
	// 	Customer customer = customerService.findById(id);
	// 	model.addAttribute("customer", customer);
	// 	return "customer-view";
	// }
	
	// @RequestMapping("/customer-update/{id}")
	// public String updateCustomer(@PathVariable int id, Model model) {
	// 	Customer customer = customerService.findById(id);
	// 	model.addAttribute("customer", customer);
	// 	return "customer-update";
	// }

	// @RequestMapping("/saveCustomer")
	// public String doSaveCustomer(@ModelAttribute("Customer") Customer customer, Model model) {
	// 	customerService.save(customer);
	// 	model.addAttribute("listCustomer", customerService.findAll());
	// 	return "redirect:customer-list";
	// }

	// @RequestMapping("/updateCustomer")
	// public String doUpdateCustomer(@ModelAttribute("Customer") Customer customer, Model model) {
	// 	customerService.update(customer);
	// 	model.addAttribute("listCustomer", customerService.findAll());
	// 	return "redirect:customer-list";
	// }
	
	// @RequestMapping("/customerDelete/{id}")
	// public String doDeleteCustomer(@PathVariable int id, Model model) {
	// 	customerService.delete(id);
	// 	model.addAttribute("listCustomer", customerService.findAll());
	// 	return "redirect:/customer-list";
	// }
}
