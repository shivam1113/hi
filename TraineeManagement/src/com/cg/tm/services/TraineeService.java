package com.cg.tm.services;

import java.util.List;

import com.cg.tm.entities.Trainee;
import com.cg.tm.exceptions.TraineeException;

public interface TraineeService {

	List<Trainee> getEmpList() throws TraineeException;
	Trainee getEmpOnId(int empNo) throws TraineeException;
	void insertNewEmp(Trainee emp)  throws TraineeException;
	
	List<Integer> getEmpNoList() throws TraineeException;
	void updateEmpName(int traineeId, String traineeName, String traineeDomain,
			String traineeLocation) throws TraineeException;
	void deleteEmp(Trainee emp) throws TraineeException;
}
