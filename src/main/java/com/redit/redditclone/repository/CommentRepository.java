package com.redit.redditclone.repository;

import com.redit.redditclone.model.Comment;
import com.redit.redditclone.model.Post;
import com.redit.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPost(Post post);

    List<Post> findAllByUser(User user);

}
