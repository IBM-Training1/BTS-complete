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

	public String createBug(@RequestBody Bug bug) {
		Bug savedBug = bugRepository.save(bug);
		return savedBug.getId();
	}
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
