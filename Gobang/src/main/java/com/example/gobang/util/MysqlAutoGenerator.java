package com.example.gobang.util;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MysqlAutoGenerator {


    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/test", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("wzy") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/wangziyi/wordspace/JavaProject/Gobang/src/main/java/com/example/gobang"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.gobang") // 设置父包名
                            .moduleName("");  // 设置父包模块名
                })
                .strategyConfig(builder -> {
                    builder.addInclude("checkerboard"); // 设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }




}
