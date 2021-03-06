package org.freecodecamp.redditcloneapi.repository;

import org.freecodecamp.redditcloneapi.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

}
