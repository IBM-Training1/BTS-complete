package com.ibm;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ibm.Bug;
public interface BugRepository extends MongoRepository<Bug,String> {
@Query("{'name':?0}")
	Optional<Bug> findByName(String bugName);
	

}

