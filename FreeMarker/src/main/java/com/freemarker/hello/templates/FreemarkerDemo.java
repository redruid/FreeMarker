package com.freemarker.hello.templates;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import com.freemarker.hello.templates.jdbc.Connect;
import com.freemarker.hello.templates.jdbc.Constant;
import freemarker.template.Configuration;
import freemarker.template.Template;


public class FreemarkerDemo {


    static String date = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    static List<Map<String,Object>> fileds = new ArrayList<>();
    static List<Map<String,Object>> columns = new ArrayList<>();


    public static void generate() throws Exception {
        mkdir();
        controller();
        service();
        serviceimpl();
        mapper();


        Connect connect = new Connect();
        fileds=connect.getColslist();
        columns=connect.getColumnlist();
        pojo();
        mapperxml();
    }

    public static void main(String[] args) throws Exception {
        mkdir();
        controller();
        service();
        serviceimpl();
        mapper();


        Connect connect = new Connect();
        fileds=connect.getColslist();
        columns=connect.getColumnlist();
        pojo();
        mapperxml();
    }


    public static void controller() {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(Constant.TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("package", Constant.packages);
            dataMap.put("notes", Constant.notes);
            dataMap.put("tablename", Constant.tablename);
            dataMap.put("mapping", Constant.mapping);
            dataMap.put("prefixname", Constant.prefixname);
            dataMap.put("date", date);
            // step4 加载模版文件
            Template template = configuration.getTemplate("controller.ftl");
            // step5 生成数据
            File docFile = new File(Constant.CLASS_PATH + "\\controller\\" + Constant.mapping + "\\" + Constant.tablename + "Controller.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^controller 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }


    public static void service() {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(Constant.TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("package", Constant.packages);
            dataMap.put("notes", Constant.notes);
            dataMap.put("tablename", Constant.tablename);
            dataMap.put("prefixname", Constant.prefixname);
            dataMap.put("date", date);
            // step4 加载模版文件
            Template template = configuration.getTemplate("service.ftl");
            // step5 生成数据
            File docFile = new File(Constant.CLASS_PATH + "\\service\\" + Constant.mapping + "\\" + Constant.tablename + "Service.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^service 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }


    public static void serviceimpl() {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(Constant.TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("package", Constant.packages);
            dataMap.put("notes", Constant.notes);
            dataMap.put("tablename", Constant.tablename);
            dataMap.put("prefixname", Constant.prefixname);
            dataMap.put("date", date);
            // step4 加载模版文件
            Template template = configuration.getTemplate("serviceimpl.ftl");
            // step5 生成数据
            File docFile = new File(Constant.CLASS_PATH + "\\impl\\" + Constant.mapping + "\\" + Constant.tablename + "ServiceImpl.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^controller 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void mapper() {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(Constant.TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("package", Constant.packages);
            dataMap.put("notes", Constant.notes);
            dataMap.put("tablename", Constant.tablename);
            dataMap.put("prefixname", Constant.prefixname);
            dataMap.put("date", date);
            // step4 加载模版文件
            Template template = configuration.getTemplate("mapper.ftl");
            // step5 生成数据
            File docFile = new File(Constant.CLASS_PATH + "\\mapper\\" + Constant.mapping + "\\" + Constant.tablename + "Mapper.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^mapper 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void pojo() {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(Constant.TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("fileds", fileds);
            dataMap.put("notes", Constant.notes);
            dataMap.put("package", Constant.packages);
            dataMap.put("tablename", Constant.tablename);
            // step4 加载模版文件
            Template template = configuration.getTemplate("pojo.ftl");
            // step5 生成数据
            File docFile = new File(Constant.CLASS_PATH + "\\model\\" + Constant.mapping + "\\" + Constant.tablename + "VO.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^pojo 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void mapperxml() {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(Constant.TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("columns", columns);
            dataMap.put("pkid", Constant.pkid);
            dataMap.put("pkidproperty", Constant.pkid.replaceAll("_","").toLowerCase());
            dataMap.put("package", Constant.packages);
            dataMap.put("tablenameall", Constant.tablenameall);
            dataMap.put("notes", Constant.notes);
            dataMap.put("tablename", Constant.tablename);
            dataMap.put("mapping", Constant.mapping);
            dataMap.put("prefixname", Constant.prefixname);
            dataMap.put("date", date);
            // step4 加载模版文件
            Template template = configuration.getTemplate("mapperxml.ftl");
            // step5 生成数据
            File docFile = new File(Constant.CLASS_PATH + "\\mapping\\" + Constant.mapping + "\\" + Constant.tablename + ".xml");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 输出文件
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^xml 文件创建成功 !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void mkdir() throws FileNotFoundException {
        File file = new File(Constant.CLASS_PATH + "\\controller\\" + Constant.mapping);
        File file4 = new File(Constant.CLASS_PATH + "\\controller\\temp" + Constant.mapping);
        File file1 = new File(Constant.CLASS_PATH + "\\service\\" + Constant.mapping);
        File file7 = new File(Constant.CLASS_PATH + "\\service\\temp" + Constant.mapping);
        File file5 = new File(Constant.CLASS_PATH + "\\impl\\" + Constant.mapping);
        File file2 = new File(Constant.CLASS_PATH + "\\impl\\temp" + Constant.mapping);
        File file6 = new File(Constant.CLASS_PATH + "\\mapper\\" + Constant.mapping);
        File file3 = new File(Constant.CLASS_PATH + "\\mapper\\temp" + Constant.mapping);
        File file8 = new File(Constant.CLASS_PATH + "\\model\\" + Constant.mapping);
        File file9 = new File(Constant.CLASS_PATH + "\\model\\temp" + Constant.mapping);
        File file10 = new File(Constant.CLASS_PATH + "\\mapping\\" + Constant.mapping);
        File file11 = new File(Constant.CLASS_PATH + "\\mapping\\temp" + Constant.mapping);
        file.mkdirs();
        file1.mkdirs();
        file2.mkdirs();
        file3.mkdirs();
        file4.mkdirs();
        file5.mkdirs();
        file6.mkdirs();
        file7.mkdirs();
        file8.mkdirs();
        file9.mkdirs();
        file10.mkdirs();
        file11.mkdirs();
    }
}



