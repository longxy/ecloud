package com.infosoul.domain.p;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ecloud on 2016/11/8.
 */
@Qualifier("userRepository4Jpa")
public interface UserRepository extends JpaRepository<User, Long> {
}
