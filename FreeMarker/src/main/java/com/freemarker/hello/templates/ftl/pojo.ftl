
package com.sdl.sp.model.${package}.${tablename}VO;


public class ${tablename}VO {

    <#list fileds as being>
    private ${being.type} ${being.field};

    </#list>


    <#list fileds as being>
    public void set${being.field}(${being.type} ${being.field}) {
        this.${being.field} = ${being.field};
    }


    public ${being.type} get${being.field}() {
        <#if being.type?contains("String")>return "".equals(${being.field})?null:${being.field};
        <#else>return ${being.field};</#if>
    }
    </#list>

}
