package org.faylinn.rpm.web.rest;

/**
 * @author heyouxin
 * @since 2021/2/6/0006 10:44
 */
public class R {
    private int code;
    private Object data;

    public R(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public static R success() {
        return new R(200, "success");
    }

    public static R success(Object o) {
        return new R(200, o);
    }

    public static R error() {
        return new R(500, "error");
    }

    public static R error(Object o) {
        return new R(500, o);
    }

    public static R error(int code, Object o) {
        return new R(code, o);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
