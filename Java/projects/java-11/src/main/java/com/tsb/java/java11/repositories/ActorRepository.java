package com.tsb.java.java11.repositories;

import com.tsb.java.java11.entities.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActorRepository extends MongoRepository<Actor, String> {
}
