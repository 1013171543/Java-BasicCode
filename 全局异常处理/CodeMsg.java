public class CodeMsg{
    
    private int code;
    private String msg;
    public int getCode(){
        return code;
    }
    public String getMsg(){
        return msg;
    }
    
    private CodeMsg(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    //5001xx 通用异常
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务端异常");
    
    //数据校验异常
    public static CodeMsg MOBILE_ERROR = new CodeMsg(500300,"参数校验异常: %s");

    //格式化错误信息
    public static CodeMsg fillArgs(Object... args){
        int code = this.code;
        String format = String.format(this.msg,args);
        return new CodeMsg(code,format);
    }
    
}
