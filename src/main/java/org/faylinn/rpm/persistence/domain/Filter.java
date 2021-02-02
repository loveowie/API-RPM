package org.faylinn.rpm.persistence.domain;

/**
 * @author Faylinn
 * @since 2021/2/2 22:09
 */
public class Filter {
    private Long id;
    private String filterId;
    private String filterName;
    private String filterIntroduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public String getFilterIntroduction() {
        return filterIntroduction;
    }

    public void setFilterIntroduction(String filterIntroduction) {
        this.filterIntroduction = filterIntroduction;
    }
}
