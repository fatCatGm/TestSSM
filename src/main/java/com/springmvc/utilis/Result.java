package com.springmvc.utilis;

/**
 * Created by fatCat on 2018/4/28.
 */

public class Result<T> {
    private String message;//信息
    private int retCode;//状态码
    private Object data;//数据

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }



    //region adwance
    //    private Result(T data) {
//        this.retCode = 0;
//        this.message = "成功";
//        this.data = data;
//    }
//
//    private Result(CodeMsg cm) {
//        if (cm == null) {
//            return;
//        }
//        this.retCode = cm.getRetCode();
//        this.message = cm.getMessage();
//    }
//
//    /**
//     * 成功时候的调用
//     *
//     * @params:
//     * @return:
//     * @date: 2018/5/21 15:37
//     */
//    public static <T> Result<T> success(T data) {
//        return new Result<T>(data);
//    }
//
//    /**
//     * @params:成功，不需要传入参数
//     * @return:
//     * @date: 2018/5/21 15:38
//     */
//    @SuppressWarnings("unchecked")
//    public static <T> Result<T> success() {
//        return (Result<T>) success("");
//    }
//
//    /**
//     * @params:失败时候的调用
//     * @return:
//     * @date: 2018/5/21 15:39
//     */
//    public static <T> Result<T> error(CodeMsg cm) {
//        return new Result<T>(cm);
//    }
//
//    public static <T> Result<T> error(CodeMsg cm, String msg) {
//        cm.setMessage(cm.getMessage() + "--" + msg);
//        return new Result<T>(cm);
//    }
//
//    public T getDate() {
//        return data;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public int getRetCode() {
//        return retCode;
//    }
    //endregion
}
