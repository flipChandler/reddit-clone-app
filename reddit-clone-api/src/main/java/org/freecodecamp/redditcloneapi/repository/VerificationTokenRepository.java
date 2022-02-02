package org.freecodecamp.redditcloneapi.repository;

import org.freecodecamp.redditcloneapi.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

}