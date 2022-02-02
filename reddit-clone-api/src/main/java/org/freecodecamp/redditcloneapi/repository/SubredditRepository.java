package org.freecodecamp.redditcloneapi.repository;

import org.freecodecamp.redditcloneapi.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

}
