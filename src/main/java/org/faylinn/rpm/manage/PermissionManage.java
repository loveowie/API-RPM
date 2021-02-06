package org.faylinn.rpm.manage;

import org.faylinn.rpm.core.config.exception.DataNotExistsException;
import org.faylinn.rpm.persistence.domain.Permission;
import org.faylinn.rpm.persistence.mapper.PermissionRepository;
import org.faylinn.rpm.web.rest.dto.PermissionDTO;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

/**
 * @author heyouxin
 * @since 2021/2/6/0006 11:41
 */
@Service
public class PermissionManage {

    private final PermissionRepository permissionRepository;

    public PermissionManage(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    public void create(PermissionDTO permission) {
        permissionRepository.save(permission.convert());
    }

    public List<Permission> find(String name) {
        if (ObjectUtils.isEmpty(name)) {
            return permissionRepository.findAllByDeletedIsFalse();
        }
        return permissionRepository.findAllByNameIsAndDeletedIsFalse(name);
    }

    public void delete(Long id) {
        Optional<Permission> roleOptional = permissionRepository.findById(id);
        Permission permission = roleOptional.orElseThrow(DataNotExistsException::new);
        permission.setDeleted(true);
        permissionRepository.save(permission);
    }
}
