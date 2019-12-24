package com.sdl.sp.service.impl.${package};

import com.sdl.sp.dao.${package}.${tablename}Mapper;
import com.sdl.sp.model.${package}.${tablename}VO;
import com.sdl.sp.service.${package}.${tablename}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Service
@Transactional
public class ${tablename}ServiceImpl implements ${tablename}Service {

    @Autowired
    private ${tablename}Mapper ${prefixname}Mapper;


    @Override
    public int deleteByPrimaryKey(String pkId) {
        return ${prefixname}Mapper.deleteByPrimaryKey(pkId);
    }

    @Override
    public int insert(${tablename}VO record) {
        return ${prefixname}Mapper.insert(record);
    }

    @Override
    public Map<String,Object> selectByPrimaryKey(String pkId) {
        return ${prefixname}Mapper.selectByPrimaryKey(pkId);
    }

    @Override
    public int updateByPrimaryKey(${tablename}VO record) {
        return ${prefixname}Mapper.updateByPrimaryKey(record);
    }


    /**
     * @author: chengzq
     * @date: ${date} 0016 下午 2:38
     * @Description:  通过自定义参数获取${notes}信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [paramMap]
     * @throws:
     */
    @Override
    public List<Map<String, Object>> get${tablename}ByParamMap(Map<String, Object> paramMap) {
        return ${prefixname}Mapper.get${tablename}ByParamMap(paramMap);
    }

    /**
     * @author: chengzq
     * @date: ${date} 0016 下午 2:38
     * @Description: 通过id获取${notes}详情
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [pkid]
     * @throws:
     */
    @Override
    public Map<String,Object> get${tablename}DetailByID(String pkid) {
        return ${prefixname}Mapper.selectByPrimaryKey(pkid);
    }

}
