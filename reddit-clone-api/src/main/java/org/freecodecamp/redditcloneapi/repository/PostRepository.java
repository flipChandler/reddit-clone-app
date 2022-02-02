package org.freecodecamp.redditcloneapi.repository;

import org.freecodecamp.redditcloneapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
