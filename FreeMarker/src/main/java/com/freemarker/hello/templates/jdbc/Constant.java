package com.freemarker.hello.templates.jdbc;

/**
 * @author: chengzq
 * @date: 2019/11/14 0014 16:35
 * @Description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Constant {

    public static String tablenameall;
    public static String pkid;
    public static String notes;
    public static String CLASS_PATH;


    public static String tablename;  //表名
    public static String prefixname; //参数前缀
    public static String packages;   //包名
    public static String mapping;   //包名
    public static String TEMPLATE_PATH = "F:\\workspace\\yitihua\\FreeMarker\\src\\main\\java\\com\\freemarker\\hello\\templates\\ftl";


    public static void setTablenameall(String tablenameall) {
        Constant.tablenameall = tablenameall;
    }

    public static void setPkid(String pkid) {
        Constant.pkid = pkid;
    }

    public static void setNotes(String notes) {
        Constant.notes = notes;
    }

    public static void setClassPath(String classPath) {
        CLASS_PATH = classPath;
    }

    public static void setTablename(String tablename) {
        Constant.tablename = tablename;
    }

    public static void setPrefixname(String prefixname) {
        Constant.prefixname = prefixname;
    }

    public static void setPackages(String packages) {
        Constant.packages = packages;
    }

    public static void setMapping(String mapping) {
        Constant.mapping = mapping;
    }


}
