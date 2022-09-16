package com.rfsolutionit.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rfsolutionit.workshopmongo.domain.Post;
import com.rfsolutionit.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
