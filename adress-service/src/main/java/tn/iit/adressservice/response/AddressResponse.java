package tn.iit.adressservice.response;

import jakarta.persistence.Column;
import tn.iit.adressservice.entity.Address;

public class AddressResponse {

	private Long id;
	private String street;


	private String city;


	public AddressResponse(Address address ) {
		this.id = address.getId();
		this.street = address.getStreet();
		this.city = address.getCity();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
