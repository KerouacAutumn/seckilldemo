package cn.waqwb.seckilldemo.error;

/**
 * @author JokerQ
 * @date 2019/10/21 - 17:23
 */
//包装器业务异常类实现
public class BusinessException extends Exception implements CommonError{
    private CommonError commonError;

    public BusinessException(CommonError commonError) {
        this.commonError = commonError;
    }

    public BusinessException(String errMsg, CommonError commonError) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
