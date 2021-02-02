package org.faylinn.rpm.persistence.mapper;

import org.faylinn.rpm.persistence.domain.Permission;
import org.faylinn.rpm.persistence.domain.RolePermissionRelation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Faylinn
 * @since 2021/2/2 22:39
 */
public interface RolePermissionRelationRepository extends JpaRepository<RolePermissionRelation, Long> {
}
