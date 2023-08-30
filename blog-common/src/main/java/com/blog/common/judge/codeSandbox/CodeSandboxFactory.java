package com.blog.common.judge.codeSandbox;

import com.blog.common.judge.codeSandbox.impl.ExampleCodeSandbox;
import com.blog.common.judge.codeSandbox.impl.RemoteCodeSandbox;
import com.blog.common.judge.codeSandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 *
 * @author WMING
 * 2023/08/30
 */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱示例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}