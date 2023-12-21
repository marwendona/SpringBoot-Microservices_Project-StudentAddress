package tn.iit.adressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.adressservice.request.CreateAddressRequest;
import tn.iit.adressservice.response.AddressResponse;
import tn.iit.adressservice.service.AddressService;


@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/create")
	public AddressResponse createStudent (@RequestBody CreateAddressRequest createAddressRequest) {
		return addressService.createAddress(createAddressRequest);
	}
	
	@GetMapping("getById/{id}")
	public AddressResponse getById (@PathVariable long id) {
		System.out.println("ok");
		return addressService.getAddressById(id);
	}
	
}
