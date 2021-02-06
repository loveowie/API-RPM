package org.faylinn.rpm.web.rest.dto;

import org.faylinn.rpm.persistence.domain.Permission;
import org.springframework.beans.BeanUtils;

/**
 * @author heyouxin
 * @since 2021/2/6/0006 17:31
 */

public class PermissionDTO {

    private Long id;
    private String name;
    private String action;
    private String description;
    private Boolean deleted;

    public Permission convert() {
        Permission permission = new Permission();
        BeanUtils.copyProperties(this, permission);
        return permission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
