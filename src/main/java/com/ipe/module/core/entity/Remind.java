package com.ipe.module.core.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ipe.common.entity.IDEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 提醒表-websocket
 */
@JsonAutoDetect
@Entity
@Table(name = "t_sys_remind", schema = "", catalog = "db_work")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Remind extends IDEntity {

    private String rtitle;
    private String rcontent;
    private String userId;
    private String rtype;
    private Date createdDate;
    private String read;
    private Date remindStDate;
    private Date remindEnDate;

    @Column(name = "remind_stdate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getRemindStDate() {
        return remindStDate;
    }

    public void setRemindStDate(Date remindStDate) {
        this.remindStDate = remindStDate;
    }

    @Column(name = "remind_endate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getRemindEnDate() {
        return remindEnDate;
    }

    public void setRemindEnDate(Date remindEnDate) {
        this.remindEnDate = remindEnDate;
    }

    @Column(name = "read_")
    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    @Column(name = "rtitle")
    public String getRtitle() {
        return rtitle;
    }

    public void setRtitle(String rtitle) {
        this.rtitle = rtitle;
    }

    @Column(name = "rcontent")
    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "rtype")
    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }


    @Column(name = "created_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
