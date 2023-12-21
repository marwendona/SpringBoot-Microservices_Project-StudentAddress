package tn.iit.studentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;
import tn.iit.studentservice.entity.Student;
import tn.iit.studentservice.proxies.AddressController;
import tn.iit.studentservice.repository.StudentRepository;
import tn.iit.studentservice.request.CreateAddressRequest;
import tn.iit.studentservice.request.CreateStudentRequest;
import tn.iit.studentservice.response.AddressResponse;
import tn.iit.studentservice.response.StudentResponse;

@Service
public class StudentService {

    StudentRepository studentRepository;

    AddressController addressController;

    public StudentService(AddressController addressController,StudentRepository studentRepository) {
        this.addressController = addressController;
        this.studentRepository=studentRepository;
    }


    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {

        CreateAddressRequest address = new CreateAddressRequest();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());

        Long addressId =  addressController.createAddress(address).getId();

        Student student = new Student();
        student.setFirstName(createStudentRequest.getFirstName());
        student.setLastName(createStudentRequest.getLastName());
        student.setEmail(createStudentRequest.getEmail());

        student.setAddress(addressId);
        student = studentRepository.save(student);

        return new StudentResponse(student);
    }
    public CreateStudentRequest getSutdentById(Long id) {
        Student student  = studentRepository.findById(id).get();
        AddressResponse addressResponse = addressController.getById(student.getAddress()) ;
        CreateStudentRequest studentRequest = new CreateStudentRequest();
        studentRequest.setCity(addressResponse.getCity());
        studentRequest.setStreet(addressResponse.getStreet());
        studentRequest.setEmail(student.getEmail());
        studentRequest.setFirstName(student.getFirstName());
        studentRequest.setLastName(student.getLastName());
        return studentRequest;

    }


}
