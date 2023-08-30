package com.blog.common.model.dto.question;

import lombok.Data;

/**
 * 题目用例
 *
 * @author WMING
 * 2023/08/27
 */

@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}