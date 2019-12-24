package com.freemarker.hello.templates.jdbc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chengzq
 * @date: 2019/10/23 0023 16:22
 * @Description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class JdbcTypeToJavaType {

    public static String getJavaType(String jdbcType){

        Map<String,Object> typeMap=new HashMap<>();

        typeMap.put("varchar","String");
        typeMap.put("numeric","Integer");
        typeMap.put("float","Long");
        typeMap.put("datetime","String");


        return typeMap.get(jdbcType)==null?"String":typeMap.get(jdbcType.toLowerCase()).toString();
    }


    public static String getJdbcType(String jdbcType){

        Map<String,Object> typeMap=new HashMap<>();
        typeMap.put("numeric","numeric");
        typeMap.put("float","DOUBLE");
        typeMap.put("datetime","varchar");


        return typeMap.get(jdbcType)==null?"varchar":typeMap.get(jdbcType.toLowerCase()).toString();
    }
}
