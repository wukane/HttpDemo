package com.httpdemo.json;


/**
 * 更新信息
 */
public class JsonAppUpdateInfo {
	
	private String version;//版本号
	private String 	version_type;//*版本类型，安卓1，iOS2
	private String txncode;
	private String content;//版本更新内容
	private String create_time;//创建时间
	private String responsecode;//
	private String 	responsedesc;//
	private String 	type;//	1普通升级，2强制升级
	private String 	url;//网络下载地址
	private String	apk_url;//APK下载地址

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion_type() {
		return version_type;
	}

	public void setVersion_type(String version_type) {
		this.version_type = version_type;
	}

	public String getTxncode() {
		return txncode;
	}

	public void setTxncode(String txncode) {
		this.txncode = txncode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getResponsecode() {
		return responsecode;
	}

	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}

	public String getResponsedesc() {
		return responsedesc;
	}

	public void setResponsedesc(String responsedesc) {
		this.responsedesc = responsedesc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApk_url() {
		return apk_url;
	}

	public void setApk_url(String apk_url) {
		this.apk_url = apk_url;
	}

	@Override
	public String toString() {
		return "JsonAppUpdateInfo{" +
				"version='" + version + '\'' +
				", version_type='" + version_type + '\'' +
				", txncode='" + txncode + '\'' +
				", content='" + content + '\'' +
				", create_time='" + create_time + '\'' +
				", responsecode='" + responsecode + '\'' +
				", responsedesc='" + responsedesc + '\'' +
				", type='" + type + '\'' +
				", url='" + url + '\'' +
				", apk_url='" + apk_url + '\'' +
				'}';
	}
}
