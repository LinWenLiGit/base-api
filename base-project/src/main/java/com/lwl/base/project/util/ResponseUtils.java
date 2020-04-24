package com.lwl.base.project.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.lwl.base.api.common.vo.Result;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 响应工具类
 * @author LinWenLi
 * @since 2020-04-24
 */
public class ResponseUtils {

    /**
     * 统一响应数据格式
     * @param response response
     * @param result result
     */
    public static void responseResult(HttpServletResponse response, Result<Object> result) {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (out != null) {
            out.write(JSON.toJSONString(result, SerializerFeature.WriteMapNullValue));
            out.flush();
            out.close();
        }
    }
}
