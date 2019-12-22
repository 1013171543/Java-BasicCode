public class GlobalException extends RuntimeException{
    
    //用于获取封装服务端抛出的异常，在全局异常处理器中返回给前端
    private CodeMsg codeMsg;
    
    public GlobalException(CodeMsg codeMsg){
        
        this.codeMsg = codeMsg;
    }
    
    public CodeMsg getCodeMsg(){
        return codeMsg;
    }
}
