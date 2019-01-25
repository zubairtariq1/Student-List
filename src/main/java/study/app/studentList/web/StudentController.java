package study.app.studentList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping(value="/hello", method=  RequestMethod.GET)
		public String showList(Model model) {
		//ArrayList to store Student objects
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		//Now i'll create 3 student objects
		
		Student studentOne = new Student("Zubair", "Tariq");
		Student studentTwo = new Student("Felix", "Bloch");
		Student studentThree = new Student("Anastasiia", "Burkova");
		
		//adding objects to the list
		
		studentList.add(studentOne);
		studentList.add(studentTwo);
		studentList.add(studentThree);
		
		model.addAttribute("student", studentList);
		
		
		return "studentList.html";
	}
		
	
}
