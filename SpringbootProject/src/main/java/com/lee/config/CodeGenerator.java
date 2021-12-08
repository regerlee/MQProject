package com.lee.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class CodeGenerator{
    private final static String dbUrl="jdbc:mysql://150.158.27.148:3306/spdb";
    private final static String dbUsernmae="leezh";
    private final static String dbPasswd="Lzh2815729";
    private final static String author="lee";
    private final static String outputDir="d://code_gene";
    private final static String parent="com.lee.busi";//父级包名
    private final static String moduleName="sms";//模块名
    private final static String mapperDir="d://code_gene";//mapper路径
    private final static String tableName="tb_goods_info";//表名

    public static void main(String[] a){
        FastAutoGenerator.create(dbUrl, dbUsernmae, dbPasswd)
                .globalConfig(builder -> {
                    builder.author(author) // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(outputDir); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(parent) // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, mapperDir)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tableName) // 设置需要生成的表名
                            .addTablePrefix("tb_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}