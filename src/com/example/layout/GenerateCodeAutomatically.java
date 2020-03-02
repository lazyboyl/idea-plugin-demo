package com.example.layout;

import javax.swing.*;
import java.awt.*;

/**
 * @author linzf
 * @since 2020/3/2
 * 类描述： 自动生成代码的页面的实现
 */
public class GenerateCodeAutomatically {

    private JPanel center = new JPanel();

    private JPanel south = new JPanel();

    /**
     * 数据库的连接信息
     */
    private JLabel jdbcUrl = new JLabel("连接地址：");
    private JTextField jdbcUrlContent = new JTextField();

    /**
     * 数据库的驱动名称
     */
    private JLabel driverClassName = new JLabel("驱动名称：");
    private JTextField driverClassNameContent = new JTextField();

    /**
     * 数据库的账号
     */
    private JLabel userName = new JLabel("账号：");
    private JTextField userNameContent = new JTextField();

    /**
     * 数据库的密码
     */
    private JLabel password = new JLabel("密码：");
    private JTextField passwordContent = new JTextField();

    /**
     * java代码生成的路径
     */
    private JLabel webCorePath = new JLabel("java代码生成的路径：");
    private JTextField webCorePathContent = new JTextField();

    /**
     * mybatis代码生成的路径
     */
    private JLabel mybatisBasePath = new JLabel("mybatis代码生成的路径：");
    private JTextField mybatisBasePathContent = new JTextField();

    /**
     * 基础依赖包的路径
     */
    private JLabel baseCorePath = new JLabel("基础依赖包的路径：");
    private JTextField baseCorePathContent = new JTextField();

    /**
     * 作者
     */
    private JLabel author = new JLabel("作者：");
    private JTextField authorContent = new JTextField();

    /**
     * 表名
     */
    private JLabel tableName = new JLabel("表名：");
    private JTextField tableNameContent = new JTextField();

    /**
     * 实体名称
     */
    private JLabel beanName = new JLabel("实体名称：");
    private JTextField beanNameContent = new JTextField();

    /**
     * 前端工程位置
     */
    private JLabel webPath = new JLabel("前端工程位置：");
    private JTextField webPathContent = new JTextField();

    /**
     * 前端代码生成挂载位置
     */
    private JLabel routerNode = new JLabel("前端代码生成位置：");
    private JTextField routerNodeContent = new JTextField();

    /**
     * 前端api代码生成位置
     */
    private JLabel apiBasePath = new JLabel("前端api代码生成位置：");
    private JTextField apiBasePathContent = new JTextField();

    /**
     * 前端页面生成位置
     */
    private JLabel viewPath = new JLabel("前端页面生成位置：");
    private JTextField viewPathContent = new JTextField();

    /**
     * 功能描述： 生成需要提交的部分的代码
     *
     * @return 返回表单的的panel
     */
    public JPanel initCenter() {
        center.setLayout(new GridLayout(5,2));

        JPanel row = new JPanel();
        row.setLayout(new FlowLayout(FlowLayout.LEFT));
        jdbcUrl.setPreferredSize(new Dimension(80,30));
        row.add(jdbcUrl);
        jdbcUrlContent.setPreferredSize(new Dimension(420,30));
        row.add(jdbcUrlContent);
        center.add(row);


        JPanel two = new JPanel();
        two.setLayout(new FlowLayout(FlowLayout.LEFT));
        driverClassName.setPreferredSize(new Dimension(80,30));
        two.add(driverClassName);
        driverClassNameContent.setPreferredSize(new Dimension(420,30));
        two.add(driverClassNameContent);
        center.add(two);

        JPanel three = new JPanel();
        three.setLayout(new GridLayout(1,2));
        JPanel threeOne = new JPanel();
        threeOne.setLayout(new FlowLayout(FlowLayout.LEFT));
        userName.setPreferredSize(new Dimension(80,30));
        threeOne.add(userName);
        userNameContent.setPreferredSize(new Dimension(175,30));
        threeOne.add(userNameContent);
        three.add(threeOne);
        JPanel threeTwo = new JPanel();
        threeTwo.setLayout(new FlowLayout(FlowLayout.LEFT));
        password.setPreferredSize(new Dimension(50,30));
        threeTwo.add(password);
        passwordContent.setPreferredSize(new Dimension(180,30));
        threeTwo.add(passwordContent);
        three.add(threeTwo);
        center.add(three);

        return center;
    }

    /**
     * 功能描述： 生成按钮部分代码
     *
     * @return 返回按钮部分的的panel
     */
    public JPanel initSouth() {

        //定义表单的提交按钮，放置到IDEA会话框的底部位置

        JButton submit = new JButton("提交");
        //水平居中
        submit.setHorizontalAlignment(SwingConstants.CENTER);
        //垂直居中
        submit.setVerticalAlignment(SwingConstants.CENTER);
        south.add(submit);

        //按钮事件绑定
        submit.addActionListener(e -> {
            //获取到jdbcUrl
            String jdbcUrl = jdbcUrlContent.getText();
            System.out.print("----jdbcUrl---" + jdbcUrl);
        });

        return south;
    }


}
