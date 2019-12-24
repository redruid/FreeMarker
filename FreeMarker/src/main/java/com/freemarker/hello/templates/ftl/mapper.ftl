package com.sdl.sp.dao.${package};

import com.sdl.sp.model.${package}.${tablename}VO;

import java.util.List;
import java.util.Map;

public interface ${tablename}Mapper {
    int deleteByPrimaryKey(String pkId);

    int insert(${tablename}VO record);

    Map<String,Object> selectByPrimaryKey(String pkId);

    int updateByPrimaryKey(${tablename}VO record);


    /**
     * @author: chengzq
     * @date: ${date} 0016 下午 2:37
     * @Description:  通过自定义参数获取${notes}信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [paramMap]
     * @throws:
     */
    List<Map<String,Object>> get${tablename}ByParamMap(Map<String,Object> paramMap);

}