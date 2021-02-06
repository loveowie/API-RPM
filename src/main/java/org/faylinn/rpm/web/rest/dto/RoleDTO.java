package org.faylinn.rpm.web.rest.dto;

import org.faylinn.rpm.persistence.domain.Role;
import org.springframework.beans.BeanUtils;

/**
 * @author heyouxin
 * @since 2021/2/6/0006 17:31
 */

public class RoleDTO {
    private Long id;
    private String name;
    private String alias;
    private String description;

    public Role convert() {
        Role role = new Role();
        BeanUtils.copyProperties(this, role);
        return role;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
