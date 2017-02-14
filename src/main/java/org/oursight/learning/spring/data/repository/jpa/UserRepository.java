package org.oursight.learning.spring.data.repository.jpa;

import org.oursight.learning.spring.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by neyao@github.com on 2016/4/25.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
