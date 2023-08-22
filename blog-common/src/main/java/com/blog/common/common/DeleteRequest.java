package com.blog.common.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author WMING
 * 2023/08/22
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}