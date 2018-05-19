package com.jxd.web;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    public Map<String, Object> success(Object data) {

        return getResultMap("0", "成功", data);
    }

    public Map<String, Object> fail(Object data) {
        return getResultMap("1", "失败", data);
    }

    public Map<String, Object> getResultMap(String code, String msg, Object data) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }
}
