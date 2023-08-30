package com.blog.common.judge.codeSandbox;

import com.blog.common.judge.codeSandbox.model.ExecuteCodeRequest;
import com.blog.common.judge.codeSandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 *
 * @author WMING
 * 2023/08/30
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}