package cn.appsys.pojo;


import java.util.Date;

public class AppVersion {

  private long id;
  private long appId;
  private String versionNo;
  private String versionInfo;
  private long publishStatus;
  private String downloadLink;
  private double versionSize;
  private long createdBy;
  private Date creationDate;
  private long modifyBy;
  private Date modifyDate;
  private String apkLocPath;
  private String apkFileName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getAppId() {
    return appId;
  }

  public void setAppId(long appId) {
    this.appId = appId;
  }


  public String getVersionNo() {
    return versionNo;
  }

  public void setVersionNo(String versionNo) {
    this.versionNo = versionNo;
  }


  public String getVersionInfo() {
    return versionInfo;
  }

  public void setVersionInfo(String versionInfo) {
    this.versionInfo = versionInfo;
  }


  public long getPublishStatus() {
    return publishStatus;
  }

  public void setPublishStatus(long publishStatus) {
    this.publishStatus = publishStatus;
  }


  public String getDownloadLink() {
    return downloadLink;
  }

  public void setDownloadLink(String downloadLink) {
    this.downloadLink = downloadLink;
  }


  public double getVersionSize() {
    return versionSize;
  }

  public void setVersionSize(double versionSize) {
    this.versionSize = versionSize;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }


  public long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(long modifyBy) {
    this.modifyBy = modifyBy;
  }


  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }


  public String getApkLocPath() {
    return apkLocPath;
  }

  public void setApkLocPath(String apkLocPath) {
    this.apkLocPath = apkLocPath;
  }


  public String getApkFileName() {
    return apkFileName;
  }

  public void setApkFileName(String apkFileName) {
    this.apkFileName = apkFileName;
  }

}
