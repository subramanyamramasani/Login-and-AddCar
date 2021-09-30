package org.websparrow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.websparrow.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
