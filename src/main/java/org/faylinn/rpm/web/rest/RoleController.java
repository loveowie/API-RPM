package org.faylinn.rpm.web.rest;

import org.faylinn.rpm.manage.RoleManage;
import org.faylinn.rpm.web.rest.dto.RoleDTO;
import org.faylinn.rpm.web.rest.dto.RoleRelationDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author Faylinn
 * @since 2021/2/5 20:37
 */
@RestController
@RequestMapping("/rpm/role")
public class RoleController {

    private final RoleManage roleManage;

    public RoleController(RoleManage roleManage) {
        this.roleManage = roleManage;
    }

    @PostMapping
    public R create(RoleDTO role) {
        roleManage.create(role);
        return R.success();
    }

    @DeleteMapping
    public R delete(long id) {
        roleManage.delete(id);
        return R.success();
    }

    @GetMapping
    public R query(String name) {
        return R.success(roleManage.find(name));
    }

    @PostMapping("relation")
    public R relation(RoleRelationDTO roleRelation) {
        return R.success();
    }
}
