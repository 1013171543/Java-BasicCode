@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler{
    
    @ExceptionHandler(value =Exception.class)
    public Result globalException(Exception exception){
        
        if(exception instanceof BindException){
            BindException be = (BindException) exception;
            List<ObjectError> errors= be.getAllErrors();
            ObjectError error= errors.get(0);
        	String msssage = error.getDefaultMessage();
        
            return Result.ERROR(CodeMsg.MOBILE_ERROR.fillArgs(meeages));
        }else if(exception instanceof GlobalException){
            
            GlobalException ge = (GlobalException) exception; 
            //获取服务端中抛出全局异常信息
            return Result.ERROR(ge.getCodeMsg());
        }else{
         
            return Result.ERROR(CodeMsg.SERVER_ERROR);
        }
    }
    
    
}
