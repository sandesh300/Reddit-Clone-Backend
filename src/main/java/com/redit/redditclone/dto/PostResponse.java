package com.redit.redditclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    private Long id;
    private String postName;
    private String url;
    private String description;
    private String username;
    private String subredditName;
    private String voteCount;
    private String commentCount;
    private String duration;
    private String upVote;
    private String downVote;
}
