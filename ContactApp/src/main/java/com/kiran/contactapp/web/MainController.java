package com.kiran.contactapp.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.engine.query.spi.ReturnMetadata;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kiran.contactapp.command.UserCommand;
import com.kiran.contactapp.domain.User;
import com.kiran.contactapp.service.UserService;

import javafx.scene.web.HTMLEditorSkin.Command;

@Controller

public class MainController {

	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String testsave() {
		return "index";
	}

	@GetMapping("/userregisterform")
	public String userRegisterForm(Model model) {

		UserCommand userCommand = new UserCommand();
		model.addAttribute("command", userCommand);

		if (model.containsAttribute("usersave")) {

		} else {
			model.addAttribute("usersave", "register");
		}

		return "userregister";
	}

	@PostMapping("/userregistersave")
	public String userRegisterSave(RedirectAttributes redirectAttribute,
			@ModelAttribute("command") @Valid UserCommand userCommand, BindingResult result, Model model) {

		if (result.hasErrors()) {
			System.out.println("no");
			return "userregister";

		}

		Integer userId = null;
		try {
			userId = userService.saveUser(userCommand.getUser());
		} catch (DataIntegrityViolationException e) {

		}

		if (userId != null) {
			redirectAttribute.addFlashAttribute("usersave", "saved");
		} else {
			redirectAttribute.addFlashAttribute("usersave", "notsaved");
		}

		return "redirect:/userregisterform";
	}

	@GetMapping("/loginform")
	public String loginForm() {

		return "loginform";
	}


	@PostMapping("/loginauthenticate")
	public String login(RedirectAttributes attribute, @RequestParam("name") String name,
			@RequestParam("password") String password, Model model, HttpSession session) {

		User user = userService.loginAuthenticate(name, password);
		if (user != null) {
			session.setAttribute("name", user.getName());
			session.setAttribute("id", user.getUserId());
			return "redirect:/userdashboard";
		} else {
			attribute.addFlashAttribute("error", "User not available");
			return "redirect:/loginform";
		}

	}

	@GetMapping("/userdashboard")
	public String userDashboard(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
		if (session.getAttribute("name") == null) {
			redirectAttributes.addFlashAttribute("error", "login to continue");
			return "redirect:/loginform";
		} else {
			return "userdashboard";
		}
	}

	@GetMapping("/userlogout")
	public String userLogout(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
			session.invalidate();
			redirectAttributes.addFlashAttribute("error", "Logged Out");
			return "redirect:/loginform";
	 
	}

	@GetMapping("/usercontacts")
	public String userContacts(Model model, HttpSession session, RedirectAttributes redirectAttributes) {
		if (session.getAttribute("name") == null) {
			redirectAttributes.addFlashAttribute("error", "login to continue");
			return "redirect:/loginform";
		} else {
			return "usercontacts";
		}

	}

}
