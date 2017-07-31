package ru.spb.splat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fruitjazzy on 31.07.17.
 */
@Controller
public class GreetingController {
	/**
	 * ${...} : Variable expressions.
	 *{...} : Selection expressions.
	 #{...} : Message (i18n) expressions.
	 @{...} : Link (URL) expressions.
	 ~{...} : Fragment expressions.
	 * @param name
	 * @param model
	 * @return
	 * @throws InterruptedException
	 */

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) throws InterruptedException {
		model.addAttribute("name", name);

		return "greeting";
	}


	@RequestMapping("/send")
	public String send(Model model) throws InterruptedException {
		System.out.println("azazaz");
		return "greeting";
	}
}