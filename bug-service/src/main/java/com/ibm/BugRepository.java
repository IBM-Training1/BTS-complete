package com.ibm;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ibm.Bug;
public interface BugRepository extends MongoRepository<Bug,String> {
//@Query("{'name':?0}")
List<Bug> findByStatus(STATUS status);
//ignore case sensitive in bug name
Optional<Bug> findByNameIgnoreCase(String bugName);
List<Bug> findByStatusAndNameIgnoreCase(STATUS status, String name);
	

}

