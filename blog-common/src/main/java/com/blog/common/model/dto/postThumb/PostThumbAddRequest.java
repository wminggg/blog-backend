package com.blog.common.model.dto.postThumb;

import lombok.Data;

import java.io.Serializable;

/**
 * 帖子点赞请求
 *
 * @author WMING
 * 2023/08/22
 */
@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}