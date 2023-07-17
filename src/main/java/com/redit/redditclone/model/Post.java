package com.redit.redditclone.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String postName;
    @Nullable
    private String url;
    @Lob
    @Nullable
    private String description;
    private Integer voteCount=0;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
    private Instant createdDate;     //The "Instant" class is part of the Java Date and Time API introduced in Java 8. It represents a point in time
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Subreddit subreddit;

}
