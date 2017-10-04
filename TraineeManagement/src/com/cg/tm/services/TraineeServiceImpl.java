package com.cg.tm.services;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.tm.daos.TraineeDao;
import com.cg.tm.entities.Trainee;
import com.cg.tm.exceptions.TraineeException;

@Service
@Transactional	//Important as transaction gets handled here in
public class TraineeServiceImpl implements TraineeService {

	@Resource
	private TraineeDao dao;
	
	@Override
	public List<Trainee> getEmpList() throws TraineeException {
		return dao.getEmpList();
	}

	@Override
	public Trainee getEmpOnId(int empNo) throws TraineeException {

		return dao.getEmpOnId(empNo);
	}

	@Override
	public void insertNewEmp(Trainee emp) throws TraineeException {
		dao.insertNewEmp(emp);
	}

	@Override
	public void updateEmpName(int traineeId, String traineeName,String traineeLocation,String traineeDomain) throws TraineeException {
		dao.updateEmpName(traineeId, traineeName,traineeLocation,traineeDomain);
		
	}

	@Override
	public List<Integer> getEmpNoList() throws TraineeException {
		// TODO Auto-generated method stub
		return dao.getEmpNoList();
	}

	@Override
	public void deleteEmp(Trainee emp) throws TraineeException {
		dao.deleteEmp(emp);		
	}

}
