package com.sdl.sp.service.${package};


import com.sdl.sp.model.${package}.${tablename}VO;

import java.util.List;
import java.util.Map;

public interface ${tablename}Service {

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

    /**
     * @author: chengzq
     * @date: ${date} 0016 下午 2:37
     * @Description:  通过id获取${notes}详情
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [pkid]
     * @throws:
     */
    Map<String,Object> get${tablename}DetailByID(String pkid);
}
