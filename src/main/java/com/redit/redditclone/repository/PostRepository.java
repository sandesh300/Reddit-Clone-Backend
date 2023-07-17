package com.redit.redditclone.repository;

import com.redit.redditclone.model.Post;
import com.redit.redditclone.model.Subreddit;
import com.redit.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

List<Post> findAllBySubreddit(Subreddit subreddit);

List<Post> findByUser(User user);
}
