package com.blog.common.judge;

import com.blog.common.judge.strategy.DefaultJudgeStrategy;
import com.blog.common.judge.strategy.JavaLanguageJudgeStrategy;
import com.blog.common.judge.strategy.JudgeContext;
import com.blog.common.judge.strategy.JudgeStrategy;
import com.blog.common.model.dto.questionSubmit.JudgeInfo;
import com.blog.common.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 *
 * @author WMING
 * 2023/08/30
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}