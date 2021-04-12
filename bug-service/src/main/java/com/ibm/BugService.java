package com.ibm;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugService {
	@Autowired
	BugRepository bugRepository;

	/**
	 * create bug
	 * 
	 * @param bug
	 * @return the id
	 */
	public String createBug(Bug bug) {
		Bug savedBug = bugRepository.save(bug);
		return savedBug.getId();
	}

	/**
	 * 
	 * @param bugId
	 * @return bug details
	 */
	
	public Optional<Bug> getBugById(String bugId) {
		return bugRepository.findById(bugId);
	}

	public List<Bug> getBugs() {
		return bugRepository.findAll();
	}

	public STATUS updateBugStatus(@Valid Bug bug) {
		bugRepository.save(bug);
		return bug.getStatus();
	}
	public BugRepository getBugRepository() {
		return bugRepository;
	}

	public void setBugRepository(BugRepository bugRepository) {
		this.bugRepository = bugRepository;
	}

}
