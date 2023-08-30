package com.blog.common.judge.strategy;

import com.blog.common.model.dto.questionSubmit.JudgeInfo;

/**
 * 判题策略
 *
 * @author WMING
 * 2023/08/30
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}