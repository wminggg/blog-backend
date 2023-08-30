package com.blog.common.judge.codeSandbox.impl;

import com.blog.common.judge.codeSandbox.CodeSandbox;
import com.blog.common.judge.codeSandbox.model.ExecuteCodeRequest;
import com.blog.common.judge.codeSandbox.model.ExecuteCodeResponse;

/**
 * 远程代码沙箱（实际调用接口的沙箱）
 *
 * @author WMING
 * 2023/08/30
 */
public class RemoteCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}
