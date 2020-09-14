package com.SpringDemo.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringDemo.mvc.Model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	/*
	 * @RequestMapping("/student-form") public String studentForm() { return
	 * "student-form"; }
	 */

	/*
	 * @RequestMapping("/processForm") public String processForm() { return
	 * "student-data"; }
	 */

	// using model
	/*
	 * @RequestMapping("/processForm") public String processForm(HttpServletRequest
	 * request, Model model) { String name = request.getParameter("studentName");
	 * model.addAttribute("newStudent", name.toUpperCase()); return "student-data";
	 * }
	 */

	// using @RequestParam
	/*
	 * @RequestMapping("/processForm") public String
	 * processForm(@RequestParam("studentName") String name, Model model) {
	 * model.addAttribute("newStudent", name.toUpperCase() + "Soni"); return
	 * "student-data"; }
	 */

	@RequestMapping("/student-form")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		return "student-data";
	}

}
