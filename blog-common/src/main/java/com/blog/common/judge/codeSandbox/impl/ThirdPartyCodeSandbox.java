package com.blog.common.judge.codeSandbox.impl;

import com.blog.common.judge.codeSandbox.CodeSandbox;
import com.blog.common.judge.codeSandbox.model.ExecuteCodeRequest;
import com.blog.common.judge.codeSandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 *
 * @author WMING
 * 2023/08/30
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
