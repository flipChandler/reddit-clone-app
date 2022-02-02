package org.freecodecamp.redditcloneapi.repository;

import org.freecodecamp.redditcloneapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
