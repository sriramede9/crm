package controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/list")
	public String listCustomers(Model model) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("controller/config.xml");
		System.out.println("context created happily");

		CustomerDao cdao = context.getBean("cimp", CustomerDaoImpl.class);

		List<Customer> allitems = cdao.getAll();

		model.addAttribute("list", allitems);

		System.out.println();

		return "list-customers";
	}

	@RequestMapping("add")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());
		return "addnewcustomer";
	}

	@RequestMapping("formresponse")
	public String formresponse(Model model, @ModelAttribute("customer") Customer cust) {

		System.out.println(cust);

		// boolean containsAttribute = model.containsAttribute("customer"); boolean
		// check

		// System.out.println(containsAttribute);
		// to add our customer
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("controller/config.xml");
		// System.out.println("context created happily");

		CustomerDao cdao = context.getBean("cimp", CustomerDaoImpl.class);

		cdao.addCustomer(cust);

		return "redirect:/customer/list";

	}

	@RequestMapping("updateform")
	public String updateForm(@RequestParam("customerid") Integer theid, Model model) {

		System.out.println("the id is" + theid);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("controller/config.xml");
		// System.out.println("context created happily");

		CustomerDao cdao = context.getBean("cimp", CustomerDaoImpl.class);

		Customer customerbyId = cdao.getCustomerbyId(theid);

		model.addAttribute("customer", customerbyId);

		System.out.println(customerbyId);

		return "addnewcustomer";
	}

}
