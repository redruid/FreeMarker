package com.sdl.sp.controller.${package};

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdl.pk.common.annotation.RequestJson;
import com.sdl.pk.common.utils.AuthUtil;
import com.sdl.pk.common.utils.DataFormatUtil;
import com.sdl.pk.common.utils.JSONObjectUtil;
import com.sdl.sp.common.utils.RedisTemplateUtil;
import com.sdl.sp.model.${package}.${tablename}VO;
import com.sdl.sp.service.common.UserAuthSupportService;
import com.sdl.sp.service.${package}.${tablename}Service;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.*;


/**
 * @author: chengzq
 * @date: ${date} 0011 下午 1:58
 * @Description: ${notes}控制层
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 * @param:
 * @throws:
 */
@RestController
@RequestMapping("${mapping}")
public class ${tablename}Controller {

    @Autowired
    private ${tablename}Service ${prefixname}Service;
    @Autowired
    private UserAuthSupportService userAuthSupportService;


    private String sysmodel = "hiddenDangerQuery";


    /**
     * @author: chengzq
     * @date: ${date} 0011 下午 2:31
     * @Description: 获取${notes}列表初始化信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [paramsJson]
     * @throws:
     */
    @RequestMapping(value = "/get${tablename}ListPage", method = RequestMethod.POST)
    public Object get${tablename}ListPage(@RequestJson(value = "paramsjson") Object paramsJson, HttpSession session) throws ParseException {
        try {
            
            return AuthUtil.parseJsonKeyToLower("success", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * @author: chengzq
     * @date: ${date} 0011 下午 2:58
     * @Description: 通过自定义参数获取${notes}信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [paramsJson]
     * @throws:
     */
    @RequestMapping(value = "/get${tablename}ByParamMap", method = RequestMethod.POST)
    public Object get${tablename}ByParamMap(@RequestJson(value = "paramsjson") Object paramsJson) throws ParseException {
        try {
            
            return AuthUtil.parseJsonKeyToLower("success", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * @author: chengzq
     * @date: ${date} 0011 下午 3:17
     * @Description: 新增${notes}信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [addformdata, session]
     * @throws:
     */
    @RequestMapping(value = "/add${tablename}", method = RequestMethod.POST)
    public Object add${tablename}(@RequestJson(value = "addformdata") Object addformdata, HttpSession session) throws Exception {
        try {
            
            return AuthUtil.parseJsonKeyToLower("success", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * @author: chengzq
     * @date: ${date} 0011 下午 3:19
     * @Description: 通过id获取${notes}信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [id]
     * @throws:
     */
    @RequestMapping(value = "/get${tablename}ByID", method = RequestMethod.POST)
    public Object get${tablename}ByID(@RequestJson(value = "id") String id) throws Exception {
        try {
            
            return AuthUtil.parseJsonKeyToLower("success", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * @author: chengzq
     * @date: ${date} 0011 下午 3:19
     * @Description: 修改${notes}信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [updateformdata, session]
     * @throws:
     */
    @RequestMapping(value = "/update${tablename}", method = RequestMethod.POST)
    public Object update${tablename}(@RequestJson(value = "updateformdata") Object updateformdata, HttpSession session) throws Exception {
        try {
            
            return AuthUtil.parseJsonKeyToLower("success", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * @author: chengzq
     * @date: ${date} 0011 下午 3:21
     * @Description: 通过id删除${notes}信息
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [id]
     * @throws:
     */
    @RequestMapping(value = "/delete${tablename}ByID", method = RequestMethod.POST)
    public Object delete${tablename}ByID(@RequestJson(value = "id") String id) throws Exception {
        try {
            
            return AuthUtil.parseJsonKeyToLower("success", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * @author: chengzq
     * @date: ${date} 0011 下午 3:31
     * @Description: 通过id查询${notes}信息详情
     * @updateUser:
     * @updateDate:
     * @updateDescription:
     * @param: [id]
     * @throws:
     */
    @RequestMapping(value = "/get${tablename}DetailByID", method = RequestMethod.POST)
    public Object get${tablename}DetailByID(@RequestJson(value = "id") String id) throws Exception {
        try {
            
            return AuthUtil.parseJsonKeyToLower("success", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }



}
