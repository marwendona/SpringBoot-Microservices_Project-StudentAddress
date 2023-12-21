package tn.iit.studentservice.proxies;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.iit.studentservice.request.CreateAddressRequest;
import tn.iit.studentservice.response.AddressResponse;

@FeignClient(name =
        "address-service", path = "/api/address")
public interface AddressController {
    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest);

    @GetMapping("getById/{id}")
    public AddressResponse getById(@PathVariable long id);

}
