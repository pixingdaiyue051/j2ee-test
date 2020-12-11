package com.temail;

import org.apache.commons.mail.EmailAttachment;

import java.io.File;
import java.util.List;

public class EmailWrapper {

    /**
     * 邮件主题，必须
     */
    private String subject;
    /**
     * 邮件内容，可以是html信息，必须
     */
    private String htmlMsg;
    /**
     * 接收人邮件地址，必须
     * 多个接收人逗号分隔
     */
    private String toAddr;
    /**
     * 抄送人邮件地址，非必须
     * 多个抄送人逗号分隔
     */
    private String ccAddr;
    /**
     * 密送人邮件地址，非必须
     * 多个密送人逗号分隔
     */
    private String bccAddr;
    /**
     * 附件，非必须
     */
    private List<File> fileList;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHtmlMsg() {
        return htmlMsg;
    }

    public void setHtmlMsg(String htmlMsg) {
        this.htmlMsg = htmlMsg;
    }

    public String getToAddr() {
        return toAddr;
    }

    public void setToAddr(String toAddr) {
        this.toAddr = toAddr;
    }

    public String getCcAddr() {
        return ccAddr;
    }

    public void setCcAddr(String ccAddr) {
        this.ccAddr = ccAddr;
    }

    public String getBccAddr() {
        return bccAddr;
    }

    public void setBccAddr(String bccAddr) {
        this.bccAddr = bccAddr;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }
}
