package com.blog.common.model.dto.postFavour;

import lombok.Data;

import java.io.Serializable;

/**
 * 帖子收藏 / 取消收藏请求
 *
 * @author WMING
 * 2023/08/22
 */
@Data
public class PostFavourAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}