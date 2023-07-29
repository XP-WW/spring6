package com.xp.client;

import com.xp.annotation.Component;

import java.io.File;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 苏禾
 * @version 1.0
 * @title ComponentScan
 * @description <TODO description class purpose>
 * @create 2023/7/29 10:14
 * @since 1.0
 **/
public class ComponentScan {

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        String packageName = "com.xp.bean";
        String packagePath = packageName.replace(".", "/");
        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        String path = url.getPath();
        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            try {
                String className = packageName + "." + f.getName().split("\\.")[0];
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(Component.class)) {
                    Component annotation = clazz.getAnnotation(Component.class);
                    String id = annotation.value();
                    Object object = clazz.newInstance();
                    map.put(id,object);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println(map);
    }
}
