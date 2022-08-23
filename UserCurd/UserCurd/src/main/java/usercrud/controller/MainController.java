package usercrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import usercrud.dao.UserDao;
import usercrud.model.User;

@Controller
public class MainController {

	@Autowired
	private UserDao userdao;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/view")
	public String View(Model m) {

		List<User> users = userdao.getUsers();
		m.addAttribute("users", users);
		return "View";
	}

	@RequestMapping("adduser")
	public String addUser() {
		return "adduserform";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public RedirectView user(@ModelAttribute User user, HttpServletRequest request) {
		System.out.println(user);
		userdao.createUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/delete/{id}")
	public RedirectView deleteuser(@PathVariable("id") int id, HttpServletRequest request) {
		this.userdao.deleteProduct(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/update/{id}")
	public String updateform(@PathVariable("id") int id,Model model) {
		
		User user=this.userdao.getUser(id);
		model.addAttribute("user", user);
		return "updateform";
	}
	
}
