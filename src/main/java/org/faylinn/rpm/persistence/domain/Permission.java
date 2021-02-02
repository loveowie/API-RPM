package org.faylinn.rpm.persistence.domain;

/**
 * @author Faylinn
 * @since 2021/2/2 22:41
 */
public class Permission {
    private Long id;
    private String name;
    private String action;

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
}
