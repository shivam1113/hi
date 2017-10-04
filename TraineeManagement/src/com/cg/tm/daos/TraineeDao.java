package com.cg.tm.daos;

import java.util.List;

import com.cg.tm.entities.Trainee;
import com.cg.tm.exceptions.TraineeException;

public interface TraineeDao {
	
		List<Trainee> getEmpList() throws TraineeException;
		Trainee getEmpOnId(int empNo) throws TraineeException;
		void insertNewEmp(Trainee emp)  throws TraineeException;
		
		List<Integer> getEmpNoList() throws TraineeException;
		void updateEmpName(int traineeId, String traineeName,
				String traineeLocation, String traineeDomain) throws TraineeException;
			void deleteEmp(Trainee emp) throws TraineeException;
	}
