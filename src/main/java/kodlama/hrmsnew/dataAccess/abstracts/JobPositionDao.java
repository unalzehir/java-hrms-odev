package kodlama.hrmsnew.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrmsnew.entity.concrete.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{
	
}
