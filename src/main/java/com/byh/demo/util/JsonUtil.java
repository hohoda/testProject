package com.byh.demo.util;

import lombok.Data;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonUtil {

        //读取json文件
        public static String readJsonFile(String fileName) {
            String jsonStr = "";
            try {
                File jsonFile = new File(fileName);
                FileReader fileReader = new FileReader(jsonFile);
                Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
                int ch = 0;
                StringBuffer sb = new StringBuffer();
                while ((ch = reader.read()) != -1) {
                    sb.append((char) ch);
                }
                fileReader.close();
                reader.close();
                jsonStr = sb.toString();
                return jsonStr;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

    @Data
    public static class Children{

        private String value;
        private String label;

    }

        public static void main(String[] args) {
//            //返回的json
//            JSONArray retust=new JSONArray();
//            //解析全部数据
//            String path = JsonUtil.class.getClassLoader().getResource("liang1024_citys.json").getPath();
//            String s = readJsonFile(path);
//            JSONArray jobj = JSON.parseArray(s);
//            JSONArray j1=new JSONArray();
//
//            //解析只有地级城市数据
//            String path1 = JsonUtil.class.getClassLoader().getResource("New1.json").getPath();
//            String s1 = readJsonFile(path1);
//            JSONArray jobj1 = JSON.parseArray(s1);
//            JSONArray j11=new JSONArray();
//            Iterator iterator1 = jobj1.iterator();
//            //循环地级数据
//            while(iterator1.hasNext()) {
//                JSONObject retustObject = new JSONObject();
//                JSONObject cityObject = (JSONObject) iterator1.next();
//                String city = String.valueOf(cityObject.get("city"));
//                String code = String.valueOf(cityObject.get("code"));
//                String province = String.valueOf(cityObject.get("province"));
//                String name = String.valueOf(cityObject.get("name"));
//                retustObject.put("value",name);
//                retustObject.put("label",name);
//                List<Children> list=new ArrayList<>();
//                //循环区级数据
//                Iterator iterator = jobj.iterator();
//                while (iterator.hasNext()) {
////            for (int i = 0 ; i < jobj.size();i++){
//
//                    JSONObject key = (JSONObject) iterator.next();
//                    String code1 = String.valueOf(key.get("code"));
//                    String name1 = String.valueOf(key.get("name"));
//                    String province1 = String.valueOf(key.get("province"));
//                    String city1 = String.valueOf(key.get("city"));
//                    String area1 = String.valueOf(key.get("area"));
//                    String town1 = String.valueOf(key.get("town"));
//                    System.out.println(name1+"----------->"+province+"----------->"+ province1);
//
//                    System.out.println(name1+"----------->"+(Integer.parseInt(city)==Integer.parseInt(city1))+"----------->"+ city+"-------->"+city1);
//                    System.out.println(name1+"----------->"+(!area1.equals("0")));
//                    System.out.println(name1+"----------->"+(town1.equals("0")));
//                    if((code.substring(0,3).equals(code1.substring(0,3)) || province.equals(province1) ) && Integer.parseInt(area1)!=0  && Integer.parseInt(town1)==0 ){
//                        Children c=new Children();
//                        c.setLabel(name1);
//                        c.setValue(name1);
//                        list.add(c);
////                    if (area.equals("0") || Integer.parseInt(area) == 0 || Long.valueOf(area).equals(0L)) {
//
//                        //删除connection对象
////                    iterator.remove();
//                    }
//
//
//                }
//                retustObject.put("children",list);
//                retust.add(retustObject);
//            }
//
//            String content = JSON.toJSONString(retust, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
//                    SerializerFeature.WriteDateUseDateFormat);
//            try {
//                File file = new File(System.getProperty("user.dir")+ File.separator+ "New3.json");
//                if (file.exists()) {
//                    file.delete();
//                }
//                file.createNewFile();
//                // 写入文件
//                Writer write = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
//                write.write(content);
//                write.flush();
//                write.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

        }
    }

