package com.example.translate.Base;

import java.util.ArrayList;
import java.util.List;

public class baseBean {


    public String from;
    public String to;
    public List<result_bean>trans_result;

    public class result_bean{
        String src;
        String dst;

        public String getDst(){
            return dst;
        }
    }

}
