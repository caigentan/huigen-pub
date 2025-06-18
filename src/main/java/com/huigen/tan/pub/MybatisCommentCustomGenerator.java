package com.huigen.tan.pub;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.kotlin.KotlinType;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * @author tanyc51385
 * @date 2025/6/18
 */
public class MybatisCommentCustomGenerator extends DefaultCommentGenerator {
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        if (remarks != null && !remarks.isEmpty()) {
            field.addJavaDocLine("/**");
            field.addJavaDocLine(" * " + remarks);
            field.addJavaDocLine(" */");
        }
    }
}
