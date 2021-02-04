package org.faylinn.rpm.persistence.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Faylinn
 * @since 2021/2/2 22:41
 */
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer weight;
    private String alias;
    private Boolean deleted;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<RolePermissionRelation> relations;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
