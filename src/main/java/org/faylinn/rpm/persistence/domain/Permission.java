package org.faylinn.rpm.persistence.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Faylinn
 * @since 2021/2/2 22:41
 */
@Entity
@Table(name = "permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String action;
    private String description;
    private Boolean deleted;

    @OneToMany(mappedBy = "permission")
    private Set<RolePermissionRelation> relations;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<RolePermissionRelation> getRelations() {
        return relations;
    }

    public void setRelations(Set<RolePermissionRelation> relations) {
        this.relations = relations;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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
}
