package com.blog.common.judge.strategy;

import com.blog.common.model.dto.question.JudgeCase;
import com.blog.common.model.dto.questionSubmit.JudgeInfo;
import com.blog.common.model.entity.Question;
import com.blog.common.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 *
 * @author WMING
 * 2023/08/30
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}