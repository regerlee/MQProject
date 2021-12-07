package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author lee
 * @since 2021-12-07
 */
@TableName("tb_msg_record")
@ApiModel(value = "MsgRecord对象", description = "")
public class MsgRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String phone;

    private String content;

    private String sendTime;

    private String sendUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
    public String getSendUser() {
        return sendUser;
    }

    public void setSendUser(String sendUser) {
        this.sendUser = sendUser;
    }

    @Override
    public String toString() {
        return "MsgRecord{" +
            "id=" + id +
            ", phone=" + phone +
            ", content=" + content +
            ", sendTime=" + sendTime +
            ", sendUser=" + sendUser +
        "}";
    }
}
