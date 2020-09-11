package com.inconspicuousy.dynamiccompiler;


import org.junit.Test;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * @author peng.yi
 */
public class ToolProviderTest {

    @Test
    public void test() {
        JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(systemJavaCompiler);
    }
}
