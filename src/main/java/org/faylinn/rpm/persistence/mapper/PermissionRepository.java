package org.faylinn.rpm.persistence.mapper;

import org.faylinn.rpm.persistence.domain.Filter;
import org.faylinn.rpm.persistence.domain.Permission;
import org.faylinn.rpm.persistence.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Faylinn
 * @since 2021/2/2 22:39
 */
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    List<Permission> findAllByDeletedIsFalse();

    List<Permission> findAllByNameIsAndDeletedIsFalse(String name);
}
