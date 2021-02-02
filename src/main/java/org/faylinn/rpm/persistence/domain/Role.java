package org.faylinn.rpm.persistence.domain;

/**
 * @author Faylinn
 * @since 2021/2/2 22:41
 */
public class Role {
    private Long id;
    private String name;
    private Integer weight;
    private String alias;

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
