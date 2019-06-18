package controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
