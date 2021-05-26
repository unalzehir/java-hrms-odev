package kodlama.hrmsnew.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrmsnew.business.abstracts.JobPositionService;
import kodlama.hrmsnew.dataAccess.abstracts.JobPositionDao;
import kodlama.hrmsnew.entity.concrete.JobPosition;



@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public void add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		
	}
}
