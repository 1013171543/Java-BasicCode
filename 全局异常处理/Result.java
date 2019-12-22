
public class Result<T>{
    
    private int code;
    private String msg;
    private T data;
    public int getCode(){
        return code;
    }
    public String getMsg(){
        return msg;
    }
    public T getData(){
        return data;
    }
    
    private Result(T data){
        this.code = 0;
        this.msg = "SUCCESS";
        this.data = data;
    }
    private Result(CodeMsg codeMsg){
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }
	/*
		成功时的返回结果
	*/
    public static <T> Result SUCCESS(T data){
        return new Result(data);
    }
    /*
    	失败时的返回结果
    */
    public static Result ERROR(CodeMsg codeMsg){
        
        return new Result(CodeMsg);
    }
    
}
