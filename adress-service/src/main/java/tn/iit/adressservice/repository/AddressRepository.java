package tn.iit.adressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.adressservice.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
