package com.cg.tm.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.cg.tm.entities.Trainee;
import com.cg.tm.exceptions.TraineeException;

@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	private EntityManager manager;
	
	
	@Override
	public List<Trainee> getEmpList() throws TraineeException {
			
		
		String strQry="SELECT t FROM Trainee t";
		TypedQuery<Trainee> qry= manager.createQuery(strQry,Trainee.class);
		List<Trainee> empList=qry.getResultList();
		
		return empList;
	}


	@Override
	public Trainee getEmpOnId(int empNo) throws TraineeException {
			return manager.find(Trainee.class, empNo);
	}


	@Override
	public void insertNewEmp(Trainee emp) throws TraineeException {
			manager.persist(emp);
		
	}


	@Override
	public void updateEmpName(int traineeId, String traineeName,String traineeDomain,String traineeLocation) throws TraineeException {
		Trainee emp=manager.find(Trainee.class, traineeId);
		emp.setTraineeName(traineeName);
		emp.setTraineeDomain(traineeDomain);
		emp.setTraineeLocation(traineeLocation);
	}
	
	@Override
	public List<Integer> getEmpNoList() throws TraineeException {
			
		
		String strQry="SELECT e.empNo FROM Employee e";
		TypedQuery<Integer> qry= manager.createQuery(strQry,Integer.class);
		List<Integer> empNoList=qry.getResultList();
		
		return empNoList;
	}


	@Override
	public void deleteEmp(Trainee emp) throws TraineeException {
		
		manager.remove(manager.contains(emp)? emp:manager.merge(emp));
	}


}
