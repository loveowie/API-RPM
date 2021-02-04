package org.faylinn.rpm.core;

import com.google.common.collect.Lists;
import org.faylinn.rpm.persistence.domain.Permission;
import org.faylinn.rpm.persistence.domain.Role;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Faylinn
 * @since 2021/2/4 20:46
 */
public class RoleCache {

    private transient static Map<Role, List<Permission>> cache = new HashMap<>();

    public static synchronized void put(Role role, Permission permission) {
        if (permission == null) {
            return;
        }
        List<Permission> permissions = cache.get(role);
        if (permissions == null) {
            cache.put(role, Lists.newArrayList(permission));
            return;
        }
        permissions.add(permission);
        cache.put(role, permissions);
    }

    public static synchronized void put(Role role, List<Permission> permissions) {
        if (permissions == null) {
            return;
        }
        List<Permission> originList = cache.get(role);
        if (originList == null) {
            cache.put(role, permissions);
            return;
        }
        originList.addAll(permissions);
        cache.put(role, originList);
    }

    public static List<Permission> get(Role role) {
        return cache.get(role);
    }
}
