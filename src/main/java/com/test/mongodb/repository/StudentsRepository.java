package com.test.mongodb.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.mongodb.model.Students;

public interface StudentsRepository extends MongoRepository<Students, String> {
	
	Students findBy_id(ObjectId _id);

}
