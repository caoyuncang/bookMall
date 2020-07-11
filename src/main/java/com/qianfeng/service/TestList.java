package com.qianfeng.service;

import com.qianfeng.pojo.Types;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        Types types = new Types();
        types.setTname("嘻嘻");
        ArrayList<Types> types1 = new ArrayList<>();
        ArrayList<Types> types2 = new ArrayList<>();
        types1.add(types);
        types2.add(types);
        types1.get(0).setTname("哈哈");
        System.out.println(types1);
        System.out.println(types2);
    }
}
