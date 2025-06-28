/********************************************
 * 文件名称: CommentUtil.java
 * 系统名称: 理财登记过户平台
 * 模块名称:
 * 软件版权: 恒生电子股份有限公司
 * 功能说明: 
 * 系统版本: 6.0.0.1
 * 开发人员:
 * 开发时间: 2024/3/5
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 *********************************************/
package org.mybatis.generator.internal.util;

import org.mybatis.generator.api.IntrospectedTable;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author changbj49088
 * 注释工具类
 */
public class CommentUtil {

    /**
     * 获取日期注释
     *
     * @return 日期注释
     */
    public static String getDateComment() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return "@date " + sdf.format(date);
    }


    /**
     * 获取作者注释
     *
     * @return 作者注释
     */
    public static String getAuthorComment() {
        return "@author Mybatis-Huigen auto generator";
    }


    /**
     * 获取表名注释
     *
     * @return 表名注释
     */
    public static String getTableNameComment(IntrospectedTable introspectedTable) {
        return FileNameUtil.getLowerCaseTableName(introspectedTable.getFullyQualifiedTable());
    }
}
