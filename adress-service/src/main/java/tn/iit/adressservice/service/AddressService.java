package tn.iit.adressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iit.adressservice.entity.Address;
import tn.iit.adressservice.exception.AdressBadRequestException;
import tn.iit.adressservice.repository.AddressRepository;
import tn.iit.adressservice.request.CreateAddressRequest;
import tn.iit.adressservice.response.AddressResponse;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    public AddressResponse createAddress(CreateAddressRequest addressRequest){
        Address address = new Address();
        address.setStreet(addressRequest.getStreet());
        address.setCity(addressRequest.getCity());
        address =addressRepository.save(address);

        return new AddressResponse(address);
    }
    public AddressResponse getAddressById(Long id){
        Address address = addressRepository.findById(id).orElseThrow(()->new AdressBadRequestException(id.toString()));
        return new AddressResponse(address);


    }
}
