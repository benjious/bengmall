package com.vb.accountserver.entity.shiro;

public class Permission {
    private int permissionId;
    private int available;
    private String description;
    private int permission;
    private String url;

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", available=" + available +
                ", description='" + description + '\'' +
                ", permission=" + permission +
                ", url='" + url + '\'' +
                '}';
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
