package com.mai.resultHandler;

import lombok.Data;

/**
 * @Author Lucas_mai
 * @Date 2021/4/21 ^_^
 * 用于保存每次方法调用的处理结果数据，包括状态，信息，包含数据。以便于传到前端
 */

@Data
public class DataResult {

    private int status;
    private String msg = "";
    private Object data = null;

    /**
     * 成功返回状态码0，信息和数据
     * @param msg
     * @param data
     * @return
     */
    public static DataResult success(String msg, Object data){
        DataResult dataResult = new DataResult();
        dataResult.setMsg(msg);
        dataResult.setData(data);
        dataResult.setStatus(0);
        return dataResult;
    }

    /**
     * 失败返回状态码-1
     * @param msg
     * @return
     */
    public static DataResult fail(String msg){
        DataResult dataResult = new DataResult();
        dataResult.setMsg(msg);
        dataResult.setStatus(-1);
        return dataResult;
    }
}
