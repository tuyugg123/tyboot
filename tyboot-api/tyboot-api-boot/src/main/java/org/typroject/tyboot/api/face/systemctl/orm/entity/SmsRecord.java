package org.typroject.tyboot.api.face.systemctl.orm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import org.typroject.tyboot.core.rdbms.orm.entity.BaseEntity;

import java.util.Date;

/**
 * <p>
 * 验证码发送记录
 * </p>
 *
 * @author 子杨
 * @since 2017-09-09
 */
@TableName("systemctl_sms_verify")
public class SmsRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 短信编号（可以自己生成，也可以第三方复返回，或者模板编号）
     */
	@TableField("SMS_CODE")
	private String smsCode;
    /**
     * 电话号码
     */
	@TableField("MOBILE")
	private String mobile;
    /**
     * 短信类型;登录验证码短信，修改密码的短信
     */
	@TableField("SMS_TYPE")
	private String smsType;

	@TableField("SMS_PARAMS")
	private String smsParams;

	@TableField("SMS_CONTENT")
	private String smsContent;
    /**
     * 发送时间
     */
	@TableField("SEND_TIME")
	private Date sendTime;


	@TableField("VERIFICATION_CODE")
	private String verificationCode;


	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getSmsParams() {
		return smsParams;
	}

	public void setSmsParams(String smsParams) {
		this.smsParams = smsParams;
	}

	public String getSmsContent() {
		return smsContent;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSmsType() {
		return smsType;
	}

	public void setSmsType(String smsType) {
		this.smsType = smsType;
	}


	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}


}