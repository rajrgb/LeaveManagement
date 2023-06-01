package com.leave.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leave.management.models.LeaveInterval;

public interface LeaveIntervalRepository extends JpaRepository<LeaveInterval, Integer>{

}
