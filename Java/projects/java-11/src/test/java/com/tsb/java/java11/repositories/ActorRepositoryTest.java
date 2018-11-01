package com.tsb.java.java11.repositories;

import com.tsb.java.java11.entities.Actor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static com.tsb.java.java11.entities.Actor.SocialMedia.Type.FACEBOOK;
import static com.tsb.java.java11.entities.Actor.SocialMedia.Type.INSTAGRAM;
import static java.lang.String.format;

@Slf4j
@DataMongoTest
@ExtendWith(SpringExtension.class)
public class ActorRepositoryTest {

    @Autowired
    ActorRepository actorRepository;

    @Test
    void shouldPersistActor() {
        var actor = new Actor(); //java10: local type inference
        actor.setName(format("Actor: %s", System.currentTimeMillis()));
        actor.setSocialMediaIds(List.of( //java9: collection factory
                Actor.SocialMedia.builder()
                        .id("asdasdasdasdsa")
                        .name("Test")
                        .type(FACEBOOK)
                        .build(),
                Actor.SocialMedia.builder()
                        .id("asdasdasdasdsa")
                        .name("Test")
                        .type(INSTAGRAM)
                        .build()
        ));

        actorRepository.save(actor);
        log.info("Actor Saved: {}", actor);
    }

    @Test
    void shouldFindActors() {
        actorRepository.findAll().forEach((var a) -> { //java11: useless???, local type inference in lambdas
            log.info("Found Actor: {}", a);
        });
    }
}
