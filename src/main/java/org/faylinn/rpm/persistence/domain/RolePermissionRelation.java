package org.faylinn.rpm.persistence.domain;

/**
 * @author Faylinn
 * @since 2021/2/2 22:45
 */
public class RolePermissionRelation {
    private Long id;
    private Long roleId;
    private Long PermissionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return PermissionId;
    }

    public void setPermissionId(Long permissionId) {
        PermissionId = permissionId;
    }
}
