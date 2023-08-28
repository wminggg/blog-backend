package com.blog.common.model.dto.question;

/**
 * 判断配置
 *
 * @author WMING
 * 2023/08/27
 */


public class JudgeConfig {


    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    private Long stackLimit;
}