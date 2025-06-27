
package org.mybatis.generator.internal.util;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedColumn;

/**
 * @author tanyc
 */
public class FileNameUtil {

    private static final String[] TAGS = {"DO", "Do", "DESC", "Desc", "Bean", "BEAN", "DOMAIN", "Domain"};

    /**
     * delete domain tag string
     *
     * @param domainObject domain class name
     * @return after delete domain class name
     */
    public static String deleteDomainTag(String domainObject) {
        for (int i = 0; i < TAGS.length; i++) {
            if (domainObject.endsWith(TAGS[i])) {
                return domainObject.substring(0, domainObject.length() - TAGS[i].length());
            }
        }
        return domainObject;
    }

    /**
     * get column name and convert to lower case
     *
     * @param introspectedColumn column
     * @return lower case
     */
    public static String getLowerCaseColumnName(IntrospectedColumn introspectedColumn) {
        String column = introspectedColumn.getActualColumnName();
        return getLowerCaseColumnName(column);
    }

    /**
     * get column name and convert to lower case
     *
     * @param column column name
     * @return lower case
     */
    public static String getLowerCaseColumnName(String column) {
        return column == null ? null : column.toLowerCase();
    }

    /**
     * get table name lower case
     *
     * @param fullyQualifiedTable table
     * @return lower case
     */
    public static String getLowerCaseTableName(FullyQualifiedTable fullyQualifiedTable) {
        return fullyQualifiedTable.getIntrospectedTableName().toLowerCase();
    }
}
