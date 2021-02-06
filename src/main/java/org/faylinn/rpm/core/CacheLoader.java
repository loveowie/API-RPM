package org.faylinn.rpm.core;

import org.faylinn.rpm.persistence.domain.Role;
import org.faylinn.rpm.persistence.domain.RolePermissionRelation;
import org.faylinn.rpm.persistence.mapper.RoleRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Faylinn
 * @since 2021/2/4 21:34
 */
@Component
public class CacheLoader implements InitializingBean {

    private final RoleRepository roleRepository;

    @Autowired
    public CacheLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void afterPropertiesSet() {
        List<Role> roles = roleRepository.findAllByDeletedIsFalse();
        for (Role role : roles) {
            Set<RolePermissionRelation> relations = role.getRelations();
            RoleCache.put(role, relations.stream().map(RolePermissionRelation::getPermission).collect(Collectors.toList()));
        }
    }
}
