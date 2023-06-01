package com.leave.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leave.management.models.Leave;

public interface LeaveRepository extends JpaRepository<Leave, Integer> {

}
