package org.faylinn.rpm.web.rest;

import org.faylinn.rpm.manage.PermissionManage;
import org.faylinn.rpm.web.rest.dto.PermissionDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author Faylinn
 * @since 2021/2/5 20:38
 */
@RestController
@RequestMapping("/rpm/permission")
public class PermissionController {

    private final PermissionManage manage;

    public PermissionController(PermissionManage manage) {
        this.manage = manage;
    }

    @PostMapping
    public R create(PermissionDTO permission) {
        manage.create(permission);
        return R.success();
    }

    @DeleteMapping
    public R delete(long id) {
        manage.delete(id);
        return R.success();
    }

    @GetMapping
    public R query(String name) {
        return R.success(manage.find(name));
    }
}
