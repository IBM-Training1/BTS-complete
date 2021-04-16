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
		STATUS status = bug.getStatus();
		Optional<Bug> oldBug = bugRepository.findById(bug.getId());
		oldBug.ifPresent(oldbug->{
			STATUS oldstatus = oldbug.getStatus();
			if(oldstatus==STATUS.ASSIGNED)
			{
				if(status==STATUS.NEW) {
					throw new IllegalArgumentException("STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else if(oldstatus==STATUS.OPEN)
			{
				if(status==STATUS.ASSIGNED || status==STATUS.NEW) {
					throw new IllegalArgumentException(" STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else if(oldstatus==STATUS.FIXED)
			{
				if(status==STATUS.ASSIGNED || status==STATUS.NEW ||status==STATUS.OPEN) {
					throw new IllegalArgumentException(" STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else if(oldstatus==STATUS.PENDING_REQUEST)
			{
				if(status==STATUS.ASSIGNED || status==STATUS.NEW ||status==STATUS.OPEN ||status==STATUS.FIXED) {
					throw new IllegalArgumentException(" STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else if(oldstatus==STATUS.RETEST)
			{
				if(status==STATUS.ASSIGNED || status==STATUS.NEW ||status==STATUS.OPEN ||status==STATUS.FIXED ||status==STATUS.PENDING_REQUEST) {
					throw new IllegalArgumentException(" STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else if(oldstatus==STATUS.REOPEN)
			{
				if(status==STATUS.ASSIGNED || status==STATUS.NEW ||status==STATUS.OPEN ||status==STATUS.VERIFIED ||status==STATUS.CLOSED ) {
					throw new IllegalArgumentException(" STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else if(oldstatus==STATUS.VERIFIED)
			{
				if(status==STATUS.ASSIGNED || status==STATUS.NEW ||status==STATUS.OPEN ||status==STATUS.FIXED ||status==STATUS.PENDING_REQUEST || status==STATUS.RETEST || status==STATUS.REOPEN) {
					throw new IllegalArgumentException(" STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else if(oldstatus==STATUS.CLOSED)
			{
				if(status==STATUS.ASSIGNED || status==STATUS.NEW ||status==STATUS.OPEN ||status==STATUS.FIXED ||status==STATUS.PENDING_REQUEST || status==STATUS.RETEST || status==STATUS.REOPEN || status==STATUS.VERIFIED) {
					throw new IllegalArgumentException(" STATUS NOT ALLOWED");
				}
				else {
					bugRepository.save(bug);
					
					
				}
			}
			else {
				bugRepository.save(bug);
			}
			
			
			
		});
		return bug.getStatus();
		
	}
	public BugRepository getBugRepository() {
		return bugRepository;
	}

	public void setBugRepository(BugRepository bugRepository) {
		this.bugRepository = bugRepository;
	}

}
