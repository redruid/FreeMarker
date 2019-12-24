<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="com.sdl.sp.dao.${package}.${tablename}Mapper" >
  <resultMap id="BaseResultMap" type="map" >
    <#list columns as being><#if being.column?contains(pkid)>
    <id column="${being.column}" property="${being.property}" jdbcType="${being.type}" />
    <#else>
    <result column="${being.column}" property="${being.property}" jdbcType="${being.type}" />
    </#if>
    </#list>
  </resultMap>
  <sql id="Base_Column_List" >
    <#list columns as being>
    <#if being.jdbctype?contains("DATETIME")>
    convert(varchar(19),${being.column},120)${being.column}<#if being_has_next>,</#if>
    <#else>
    ${being.column}<#if being_has_next>,</#if>
    </#if>
    </#list>
  </sql>
  <select id="selectByPrimaryKey" resultMap="BaseResultMap" parameterType="java.lang.String" >
    select
    <include refid="Base_Column_List" />
    from ${tablenameall}
    where ${pkid} = <#noparse>#{</#noparse>${pkidproperty}<#noparse>}</#noparse>
  </select>
  <delete id="deleteByPrimaryKey" parameterType="java.lang.String" >
    delete from ${tablenameall}
    where ${pkid} = <#noparse>#{</#noparse>${pkidproperty}<#noparse>}</#noparse>
  </delete>
  <insert id="insert" parameterType="com.sdl.sp.model.${package}.${tablename}VO" >
    insert into ${tablenameall}
    (<#list columns as being>${being.column}<#if being_has_next>,</#if>
    </#list>)
    values(<#list columns as being><#noparse>#{</#noparse>${being.property},jdbcType=${being.type}<#noparse>}</#noparse><#if being_has_next>,</#if>
    </#list>)
  </insert>
  <update id="updateByPrimaryKey" parameterType="com.sdl.sp.model.${package}.${tablename}VO" >
    update ${tablenameall}
    set
    <#list columns as being>
    <#if being.property?contains("pk")>
    <#else>
    ${being.column}=<#noparse>#{</#noparse>${being.property},jdbcType=${being.type}<#noparse>}</#noparse><#if being_has_next>,</#if>
    </#if>
    </#list>
    where ${pkid} = <#noparse>#{</#noparse>${pkidproperty}<#noparse>}</#noparse>
  </update>


   <!--
      author:chengzq
      description: 通过自定义参数获取${notes}信息
      param:
      date: ${date} 18:05
  -->
  <select id="get${tablename}ByParamMap" parameterType="map" resultType="map">
      select
      <include refid="Base_Column_List"/>
      from ${tablenameall}
      <where>
        <if test="pkid!=null and pkid!='' ">
          ${tablenameall}<#noparse>.</#noparse>${pkid} = <#noparse>#{pkid}</#noparse>
        </if>
      </where>
  </select>
</mapper>