package cn.waqwb.seckilldemo.error;

/**
 * @author JokerQ
 * @date 2019/10/21 - 17:07
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);

}
