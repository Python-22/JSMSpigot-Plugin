package me.python;

import java.security.Permission;

public class JSMManager extends SecurityManager {
    public void checkConnect(String host, int port) {
        System.out.println(host + ":" + port + " is connecting from your server");
    }

    public void checkConnect(String host, int port, Object some) {
        System.out.println(host + ":" + port + " is connecting from your server");
    }

    public void checkPermission(Permission perm) {}

    public void checkPermission(Permission perm, Object context) {
        checkPermission(perm);
    }
}
