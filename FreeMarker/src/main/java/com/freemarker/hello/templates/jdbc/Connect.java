package com.freemarker.hello.templates.jdbc;


import oracle.sql.converter.JdbcCharacterConverters;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

/**
 * @author: chengzq
 * @date: 2019/10/23 0023 11:08
 * @Description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Connect {

    private List<Map<String,Object>> colslist = new ArrayList<Map<String,Object>>();
    private List<Map<String,Object>> columnlist = new ArrayList<Map<String,Object>>();


    public Connect() throws Exception{
        Properties properties=new Properties();
        FileInputStream inputStream = new FileInputStream("F:\\workspace\\yitihua\\FreeMarker\\src\\main\\resources\\jdbc.properties");
        properties.load(inputStream);
        String jdbcurl = properties.get("jdbc-url").toString();
        String username = properties.get("username").toString();
        String password = properties.get("password").toString();
        Connection connection = DriverManager.getConnection(jdbcurl, username, password);

        DatabaseMetaData metaData = connection.getMetaData();
        //获取数据库下面所有表
        ResultSet columns = metaData.getColumns(null, "%", Constant.tablenameall, "%");
        // 列的个数
        while (columns.next()) {
            String COLUMN_NAME = columns.getString("COLUMN_NAME");
            String TYPE_NAME = columns.getString("TYPE_NAME");
            Map<String,Object> data=new HashMap<>();
            data.put("type",JdbcTypeToJavaType.getJavaType(TYPE_NAME));
            data.put("field",COLUMN_NAME.replaceAll("_","").toLowerCase());
            colslist.add(data);

            Map<String,Object> data1=new HashMap<>();
            data1.put("column",COLUMN_NAME);
            data1.put("property",COLUMN_NAME.replaceAll("_","").toLowerCase());
            data1.put("type",JdbcTypeToJavaType.getJdbcType(TYPE_NAME).toUpperCase());
            data1.put("jdbctype",TYPE_NAME.toUpperCase());
            columnlist.add(data1);
        }
    }

    public List<Map<String,Object>> getColslist(){
        return colslist;
    }
    public List<Map<String,Object>> getColumnlist(){
        return columnlist;
    }

}
