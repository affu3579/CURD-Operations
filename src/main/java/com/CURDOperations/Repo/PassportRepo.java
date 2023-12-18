package com.CURDOperations.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CURDOperations.Entity.PassportEntity;

public interface PassportRepo extends JpaRepository<PassportEntity, Integer> {

}
