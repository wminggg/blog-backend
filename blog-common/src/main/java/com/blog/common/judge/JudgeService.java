package com.blog.common.judge;

import com.blog.common.model.entity.QuestionSubmit;

/**
 * 判题服务
 *
 * @author WMING
 * 2023/08/30
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}