package tn.iit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.iit.entity.Address;
import tn.iit.entity.Student;
import tn.iit.repository.AddressRepository;
import tn.iit.repository.StudentRepository;
import tn.iit.request.CreateStudentRequest;
import tn.iit.response.StudentResponse;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	AddressRepository addressRepository;

	public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

		Address address = new Address();
		address.setStreet(createStudentRequest.getStreet());
		address.setCity(createStudentRequest.getCity());

		address = addressRepository.save(address);

		Student student = new Student();
		student.setFirstName(createStudentRequest.getFirstName());
		student.setLastName(createStudentRequest.getLastName());
		student.setEmail(createStudentRequest.getEmail());
		
		student.setAddress(address);
		student = studentRepository.save(student);

		return new StudentResponse(student);
	}
	
	public StudentResponse getById (long id) {
		return new StudentResponse(studentRepository.findById(id).get());
	}
}
