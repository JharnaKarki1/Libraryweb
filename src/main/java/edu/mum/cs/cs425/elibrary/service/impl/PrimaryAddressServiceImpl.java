package edu.mum.cs.cs425.elibrary.service.impl;

import edu.mum.cs.cs425.elibrary.model.PrimaryAddress;
import edu.mum.cs.cs425.elibrary.repository.PrimaryAddressRepository;
import edu.mum.cs.cs425.elibrary.service.PrimaryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrimaryAddressServiceImpl implements PrimaryAddressService {

    @Autowired
    private PrimaryAddressRepository primaryAddressRepository;

    @Override
    public PrimaryAddress addNewPrimaryAddress(PrimaryAddress primaryAddress) {
        return primaryAddressRepository.save(primaryAddress);
    }
}
