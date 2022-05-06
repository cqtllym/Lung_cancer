package com.lym.lung_cancer_server.service;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SQLService {
    public SQLService(String datePackage)throws IOException, InterruptedException{
        testPython(datePackage);
    }

    public void testPython(String datePackage)throws IOException, InterruptedException{
        String exe = "python";
        String command = "E:\\github-本地\\第六学期\\web数据管理\\lung_cancer_data_processing\\springboot_python\\SQL.py";
        String cmdArr[] = new String[] {exe, command, datePackage};
        Process process = Runtime.getRuntime().exec(cmdArr);
        InputStream is = process.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        process.waitFor();
    }
}