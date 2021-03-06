package org.faylinn.rpm.manage;

import org.faylinn.rpm.core.config.exception.DataNotExistsException;
import org.faylinn.rpm.persistence.domain.Role;
import org.faylinn.rpm.persistence.mapper.RoleRepository;
import org.faylinn.rpm.web.rest.dto.RoleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Faylinn
 * @since 2021/2/5 20:51
 */
@Service
public class RoleManage {

    private final RoleRepository roleRepository;

    public RoleManage(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void create(RoleDTO role) {
        roleRepository.save(role.convert());
    }

    public List<Role> find(String name) {
        if (ObjectUtils.isEmpty(name)) {
            return roleRepository.findAllByDeletedIsFalse();
        }
        return roleRepository.findAllByNameIsAndDeletedIsFalse(name);
    }

    public void delete(Long id) {
        Optional<Role> roleOptional = roleRepository.findById(id);
        Role role = roleOptional.orElseThrow(DataNotExistsException::new);
        role.setDeleted(true);
        roleRepository.save(role);
    }
}
