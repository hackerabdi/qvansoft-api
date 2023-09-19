package com.qvansoft.site.services.security.datasource;

import com.qvansoft.site.services.security.datasource.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}