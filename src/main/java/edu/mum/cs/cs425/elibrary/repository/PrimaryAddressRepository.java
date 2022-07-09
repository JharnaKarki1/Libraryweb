package edu.mum.cs.cs425.elibrary.repository;

import edu.mum.cs.cs425.elibrary.model.PrimaryAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryAddressRepository extends JpaRepository<PrimaryAddress, Integer> {
}
