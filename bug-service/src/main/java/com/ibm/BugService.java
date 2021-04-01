package com.ibm;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

	public void updateBug(@RequestBody Bug bug) {
		bugRepository.save(bug);
	}
	public BugRepository getBugRepository() {
		return bugRepository;
	}

	public void setBugRepository(BugRepository bugRepository) {
		this.bugRepository = bugRepository;
	}
}
