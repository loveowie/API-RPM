package org.faylinn.rpm.web.rest.dto;

/**
 * @author heyouxin
 * @since 2021/2/6/0006 17:30
 */

public class RoleRelationDTO {

    private String roleId;
    private String[] permissionId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String[] getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String[] permissionId) {
        this.permissionId = permissionId;
    }
}
