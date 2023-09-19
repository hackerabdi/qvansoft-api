package com.qvansoft.site.services.security.datasource;

import com.qvansoft.site.services.security.datasource.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}