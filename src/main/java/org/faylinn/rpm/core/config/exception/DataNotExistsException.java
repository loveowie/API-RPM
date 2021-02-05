package org.faylinn.rpm.core.config.exception;

/**
 * @author Faylinn
 * @since 2021/2/5 21:12
 */
public class DataNotExistsException extends RuntimeException {

    public DataNotExistsException() {
        super("数据不存在");
    }
}
