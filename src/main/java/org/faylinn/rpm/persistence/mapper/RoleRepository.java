package org.faylinn.rpm.persistence.mapper;

import org.faylinn.rpm.persistence.domain.Permission;
import org.faylinn.rpm.persistence.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Faylinn
 * @since 2021/2/2 22:39
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findAllByDeletedIsFalse();

    List<Role> findAllByNameIsAndDeletedIsFalse(String name);
}
