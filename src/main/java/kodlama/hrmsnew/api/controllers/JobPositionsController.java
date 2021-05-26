package kodlama.hrmsnew.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrmsnew.business.abstracts.JobPositionService;
import kodlama.hrmsnew.entity.concrete.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}

	@PostMapping("/getall")
	public void add(@RequestBody JobPosition jobPosition){
		this.jobPositionService.add(jobPosition);
	}
}
