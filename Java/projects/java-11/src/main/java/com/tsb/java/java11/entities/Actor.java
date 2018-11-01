package com.tsb.java.java11.entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Actor {

    @Id
    String id;

    String name;

    List<SocialMedia> socialMediaIds;

    @Data @Builder
    public static class SocialMedia {
        String id;
        String name;
        Type type;

        public static enum Type {
            FACEBOOK, YOUTUBE, INSTAGRAM
        }
    }
}
