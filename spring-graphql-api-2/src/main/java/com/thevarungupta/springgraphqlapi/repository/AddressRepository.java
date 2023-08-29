package com.thevarungupta.springgraphqlapi.repository;

import com.thevarungupta.springgraphqlapi.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
