package indi.chester.exception;
// 优雅异常处理Controller



import indi.chester.utils.JSONResult;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 * 针对指定的异常去处理, 返回指定类型(JSON)到前端
 */
@ControllerAdvice
public class GraceExceptionHandler {

    @ExceptionHandler(FileSizeLimitExceededException.class)
    @ResponseBody
    public JSONResult returnMaxFileSIzeLimit(){
        return JSONResult.errorMsg("文件大小不能超过500KB");
    }

    @ExceptionHandler(MyCustomException.class)
    @ResponseBody
    public JSONResult returnMyCustomException(MyCustomException e ){
        return JSONResult.errorMsg(e.getMessage());
    }

}
