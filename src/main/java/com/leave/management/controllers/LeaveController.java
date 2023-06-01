package com.leave.management.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leave.management.models.Leave;
import com.leave.management.models.LeaveInterval;
import com.leave.management.repositories.LeaveIntervalRepository;
import com.leave.management.repositories.LeaveRepository;

@RestController
public class LeaveController {
    @Autowired
    private LeaveRepository leaveRepository;
	
    @Autowired
    private LeaveIntervalRepository leaveIntervalRepository;
	
	@GetMapping("/leave")
	public Leave getLeaveById(@RequestParam("id") int id)
	{
		System.out.println(id+" hit");
		Optional<Leave> obj=leaveRepository.findById(1);
		return obj.get();
	}
	@PutMapping("/leave")
	public Leave updateLeaveById(@RequestParam("days") int days, @RequestParam("leaveType") String leaveType,
			                     @RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate,
			                     @RequestParam("empId") int empId, 
			                     @RequestParam("leaveId") int leaveId) {
		
		Optional<Leave> obj=leaveRepository.findById(leaveId);
		Leave leave=obj.get();
		if(leaveType.equals("sick")) {
			leave.setSickLeave(leave.getSickLeave()-days);
		}
		else if(leaveType.equals("earned")) {
			leave.setEarnedLeave(leave.getEarnedLeave()-days);
		}
		LeaveInterval li=new LeaveInterval();
		li.setEmpId(empId);
		li.setStartDate(startDate);
		li.setEndDate(endDate);
		leaveIntervalRepository.save(li);
		leaveRepository.save(leave);
		return leave;
	}
}
