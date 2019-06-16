package controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.CustomerDao;
import dao.CustomerDaoImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/list")
	public String listCustomers(Model model) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"controller/config.xml");
		System.out.println("context created happily");
		
		CustomerDao cdao=context.getBean("cimp",CustomerDaoImpl.class);
		
		System.out.println(cdao.getAll());

		return "list-customers";
	}
}
