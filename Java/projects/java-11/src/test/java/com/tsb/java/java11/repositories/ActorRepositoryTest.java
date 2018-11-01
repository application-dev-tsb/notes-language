package com.tsb.java.java11.repositories;

import com.tsb.java.java11.entities.Actor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static java.lang.String.format;

@Slf4j
@DataMongoTest
@ExtendWith(SpringExtension.class)
public class ActorRepositoryTest {

    @Autowired
    ActorRepository actorRepository;

    @Test
    void shouldPersistActor() {
        var actor = new Actor();
        actor.setName(format("Actor: %s", System.currentTimeMillis()));

        actorRepository.save(actor);
        log.info("Actor Saved: {}", actor);
    }

    @Test
    void shouldFindActors() {
        actorRepository.findAll().forEach((var a) -> {
            log.info("Found Actor: {}", a);
        });
    }
}
