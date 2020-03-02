package com.example;

import com.example.layout.GenerateCodeAutomatically;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author linzf
 * @since 2020/3/2
 * 类描述：
 */
public class FormTestDialog extends DialogWrapper {

    private GenerateCodeAutomatically generateCodeAutomatically = new GenerateCodeAutomatically();

    public FormTestDialog(@Nullable Project project) {
        super(project);
        setTitle("代码快速生成插件配置页面");
        init();
    }

    // 重写下面的方法，返回一个自定义的swing样式，该样式会展示在会话框的最下方的位置
    @Override
    protected JComponent createSouthPanel() {
        return generateCodeAutomatically.initSouth();
    }

    // 重写下面的方法，返回一个自定义的swing样式，该样式会展示在会话框的中央位置
    @Override
    protected JComponent createCenterPanel() {
        return generateCodeAutomatically.initCenter();
    }
}
