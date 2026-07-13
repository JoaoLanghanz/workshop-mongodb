package com.langhanz.workshopmongodb.repository;

import com.langhanz.workshopmongodb.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
