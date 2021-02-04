package org.faylinn.rpm.persistence.domain;

import javax.persistence.*;

/**
 * @author Faylinn
 * @since 2021/2/2 22:45
 */
@Entity
@Table(name = "role_permission_relation")
public class RolePermissionRelation {
    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    @Id
    @ManyToOne
    @JoinColumn(name = "permission_id")
    private Permission Permission;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public org.faylinn.rpm.persistence.domain.Permission getPermission() {
        return Permission;
    }

    public void setPermission(org.faylinn.rpm.persistence.domain.Permission permission) {
        Permission = permission;
    }
}
