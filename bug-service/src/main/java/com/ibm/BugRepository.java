package com.ibm;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.ibm.Bug;
public interface BugRepository extends MongoRepository<Bug,String> {

}

