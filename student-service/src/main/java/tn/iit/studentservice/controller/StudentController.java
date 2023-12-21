package tn.iit.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.iit.studentservice.request.CreateStudentRequest;
import tn.iit.studentservice.response.StudentResponse;
import tn.iit.studentservice.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public StudentResponse createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
		return studentService.createStudent(createStudentRequest);
	}
	
	@GetMapping("getById/{id}")
	public CreateStudentRequest getById (@PathVariable long id) {
		return studentService.getSutdentById(id);
	}
	
}
