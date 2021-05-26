package kodlama.hrmsnew.business.abstracts;

import java.util.List;

import kodlama.hrmsnew.entity.concrete.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
	void add(JobPosition jobPosition);
}
