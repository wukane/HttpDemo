package com.httpdemo.json;


import java.util.List;

/**
 * 钱包提现实体类
 * */
public class PledgePayInfo {

	// 请求
	private String city;// 城市代码
	private String device;//终端设备号：门店号或终端设备编号，默认传APP
	private String fee_type;//货币种类:符合ISO 4217标准的三位字母代码，默认人民币：CNY
	private String goods_body;//商品描述:默认为钱包提现
	private String goods_detail;//商品详情:钱包提现到一卡通
	private String imei;// 手机串号
	private String instid;// 机构号
	private String mchntid;
	public String mch_userid;//商户代码:APP登录用户的ID
	public String mch_username;//商户名称:APP登录用户的名称
	private String mobiletype;// 手机型号 C+
	private String orderid;//订单号:客户端若上送订单号，则使用上送订单号，如果没有上送，则使用平台自动产生订单号
	private String ordid;
	private String paypassword;//支付密码:MD5加密
	private String payinst;//支付机构:paytype=0时必须出现
	private String paytype;//支付方式:0：一卡通扣款；1：微信支付；2：支付宝支付；3：银行卡支付；5：现金；
	private String token;//云卡返回token
	private String vfcCardType;//微付卡类型,必填；00：共享卡，01：普通卡
	private String rechargeType;//充值类型
	private String depositAmt;//押金金额
	private String sdk_info;//sdk信息
	private String cloudCard;//云卡结构
	private String userWallet;
	private String vfcCard;
	private String chnltype;//渠道类型,必填；00：VFC；01：第三方支付；02第三方合作商
	private String vfcCardChildType;//微付卡子类型
	private String consumeAmt;//消费金额
	private String overDrawFlag;//透支标志
	private String basefee;//开卡费
	private String facevalue;//开卡预充值金额
	private String cloudCardno;//云卡卡号
	private String vcardno;//微付卡卡号
	private String queryType;//查询类型,0：根据平台账号查询，1：根据微信账号查询;(queryType=1时openid必填)
//	private String querylist;
	private String cardapptype;//.so文件的传SOAPP，js的传JSAPP

	private String seid;// SE序列号
	private String syssesq;// 请求方流水号
	private String systemver;// 手机操作系统版本 C+
	private String time_expire;//订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟
	private String txmamt;// 金额:单位分
	private String txncode;// 命令字类型:vfcOrderReqWithdraw
	private String txndate;// 交易日期
	private String txntime;// 交易时间
	private String voucherno;// 凭证号
	private String withdraw_type;//提现类型:0：微信提现；1：支付宝提现；2：银行卡提现；
	private String mch_orderid;//商户订单号
	private String plt_orderid;//微付充平台订单号
	private String depositPltOrderid;//开卡支付订单号
	//绑定/解绑第三方账户
	private String bind_type;//绑定类型: 0：微信；1：支付宝
	private String headurl;//头像
	private String nickname;//昵称
	private String openid;//第三方账户ID:
	private String oper_type;//操作类型: 0：绑定；1：解绑
	private String optype;//卡号，0：绑定，1：解绑
	private String sex;//性别
	private String messagecheck;
	//修改钱包账户信息
	private String account_name;//账户名称
	private String change_type;//修改类型
	private String new_paypassword;//新的支付密码
	private String old_paypassword;//老的支付密码
	//钱包明细查询请求
	private String order_state;//订单状态: 0：全部；1：交易成功；2：交易失败
	private String order_type;//交易类型: 0：全部；1：充值；2：提现；3：消费/支付
	private String pagerecnum;//每页记录数: <=100
	private String pageseq;//请求页号,从0开始
	private String txn_end_time;//交易结束时间
	private String txn_start_time;//交易开始时间
	private String card_orderid;//扣款订单号
	private String remark;//备注
	//获取短信验证码
	private String mobileno;//手机号
	private String smstype;//短信用途
	private String telephone;
	//微付充支付
	private String appid;
	private String customerno;//
	private String cardno;//


	// 应答
	private String attach;// 附加信息 C+ 用于不同接入的个性化信息JSON字符串
	private String balflag;//对账标志:0：不参与对账；1：参与对账；
	private String charge_amt;//充值金额:钱包实际充值金额
	private String charge_type;//充值类型
	private String fee;//提现手续费:
	private String prepayid;//预支付凭证:成功交易必须有；暂与订单号一样
	private String paypassword_state;//支付密码状态
	private String refnum;// 中心业务流水号
	private String responsecode;// 响应码
	private String responsedesc;// 响应码描述
	private String settdate;// 中心结算日期
	private String withdraw_amt;//提现金额:钱包实际提现金额

	//订单有关
	private String 	cash_fee;//支付金额
	private String 	coupon_fee;//代金券或立减优惠金额
	private String 	fee_rate;//手续费率
	private String 	invoice_amt;//可开具发票的金额
	private String order_amt;//	订单总金额
	private String 	order_txndate;//订单交易日期
	private String order_txntime;//订单交易时间
	private String 	trade_state;//交易状态
	private String 	trade_subtype;//交易子类型
	private String trade_type;//交易类型
	//查询绑定的第三方账户
	private String bindList;//第三方账户绑定列表
	private String result;//查询绑定结果状态

	//查询钱包信息
	private String userid;//用户ID
	private String user_id;//账户ID:与username字段至少填一个，可同时填写
	private String username;//账户名称:与user_id字段至少填一个，可同时填写
	private String account_state;//账户状态:0：生效；1：冻结；2：注销
	private String account_type;//账户类型:0：普通用户；1：商家
	private String cash_amount;//可提现金额:单位分
	private String create_time;//账户创建时间:
	private String is_not_use_password;//是否支持免密支付:0：不支持；1：支持
	private String not_pass_amount;//免密金额上限:is_not_use_password=1时有值
	private String total_amount;//总金额:单位分
	private String uncash_amount;//预对账金额:单位分
	//钱包明细查询响应
	private String orderList;//
	private String ordlist;//订单列表
	private String pagetotal;//总页数
	private String rectotal;//符合条件总记录数
	private String balance;//余额
	public String getSdk_info() {
		return sdk_info;
	}

	public void setSdk_info(String sdk_info) {
		this.sdk_info = sdk_info;
	}

	public String getCloudCard() {
		return cloudCard;
	}

	public void setCloudCard(String cloudCard) {
		this.cloudCard = cloudCard;
	}

	public String getUserWallet() {
		return userWallet;
	}

	public void setUserWallet(String userWallet) {
		this.userWallet = userWallet;
	}

	public String getVfcCard() {
		return vfcCard;
	}

	public void setVfcCard(String vfcCard) {
		this.vfcCard = vfcCard;
	}
	public String getPaypassword_state() {
		return paypassword_state;
	}

	public void setPaypassword_state(String paypassword_state) {
		this.paypassword_state = paypassword_state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public String getGoods_body() {
		return goods_body;
	}

	public void setGoods_body(String goods_body) {
		this.goods_body = goods_body;
	}

	public String getGoods_detail() {
		return goods_detail;
	}

	public void setGoods_detail(String goods_detail) {
		this.goods_detail = goods_detail;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getInstid() {
		return instid;
	}

	public void setInstid(String instid) {
		this.instid = instid;
	}

	public String getMchntid() {
		return mchntid;
	}

	public void setMchntid(String mchntid) {
		this.mchntid = mchntid;
	}

	public String getMch_userid() {
		return mch_userid;
	}

	public void setMch_userid(String mch_userid) {
		this.mch_userid = mch_userid;
	}

	public String getMch_username() {
		return mch_username;
	}

	public void setMch_username(String mch_username) {
		this.mch_username = mch_username;
	}

	public String getMobiletype() {
		return mobiletype;
	}

	public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOrdid() {
		return ordid;
	}

	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}

	public String getPaypassword() {
		return paypassword;
	}

	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}

	public String getPayinst() {
		return payinst;
	}

	public void setPayinst(String payinst) {
		this.payinst = payinst;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getSeid() {
		return seid;
	}

	public void setSeid(String seid) {
		this.seid = seid;
	}

	public String getSyssesq() {
		return syssesq;
	}

	public void setSyssesq(String syssesq) {
		this.syssesq = syssesq;
	}

	public String getSystemver() {
		return systemver;
	}

	public void setSystemver(String systemver) {
		this.systemver = systemver;
	}

	public String getTime_expire() {
		return time_expire;
	}

	public void setTime_expire(String time_expire) {
		this.time_expire = time_expire;
	}

	public String getTxmamt() {
		return txmamt;
	}

	public void setTxmamt(String txmamt) {
		this.txmamt = txmamt;
	}

	public String getTxncode() {
		return txncode;
	}

	public void setTxncode(String txncode) {
		this.txncode = txncode;
	}

	public String getTxndate() {
		return txndate;
	}

	public void setTxndate(String txndate) {
		this.txndate = txndate;
	}

	public String getTxntime() {
		return txntime;
	}

	public void setTxntime(String txntime) {
		this.txntime = txntime;
	}

	public String getVoucherno() {
		return voucherno;
	}

	public void setVoucherno(String voucherno) {
		this.voucherno = voucherno;
	}

	public String getWithdraw_type() {
		return withdraw_type;
	}

	public void setWithdraw_type(String withdraw_type) {
		this.withdraw_type = withdraw_type;
	}

	public String getMch_orderid() {
		return mch_orderid;
	}

	public void setMch_orderid(String mch_orderid) {
		this.mch_orderid = mch_orderid;
	}

	public String getPlt_orderid() {
		return plt_orderid;
	}

	public void setPlt_orderid(String plt_orderid) {
		this.plt_orderid = plt_orderid;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getBalflag() {
		return balflag;
	}

	public void setBalflag(String balflag) {
		this.balflag = balflag;
	}

	public String getCharge_amt() {
		return charge_amt;
	}

	public void setCharge_amt(String charge_amt) {
		this.charge_amt = charge_amt;
	}

	public String getCharge_type() {
		return charge_type;
	}

	public void setCharge_type(String charge_type) {
		this.charge_type = charge_type;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getPrepayid() {
		return prepayid;
	}

	public void setPrepayid(String prepayid) {
		this.prepayid = prepayid;
	}

	public String getRefnum() {
		return refnum;
	}

	public void setRefnum(String refnum) {
		this.refnum = refnum;
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

	public String getSettdate() {
		return settdate;
	}

	public void setSettdate(String settdate) {
		this.settdate = settdate;
	}

	public String getWithdraw_amt() {
		return withdraw_amt;
	}

	public void setWithdraw_amt(String withdraw_amt) {
		this.withdraw_amt = withdraw_amt;
	}

	public String getCash_fee() {
		return cash_fee;
	}

	public void setCash_fee(String cash_fee) {
		this.cash_fee = cash_fee;
	}

	public String getCoupon_fee() {
		return coupon_fee;
	}

	public void setCoupon_fee(String coupon_fee) {
		this.coupon_fee = coupon_fee;
	}

	public String getFee_rate() {
		return fee_rate;
	}

	public void setFee_rate(String fee_rate) {
		this.fee_rate = fee_rate;
	}

	public String getInvoice_amt() {
		return invoice_amt;
	}

	public void setInvoice_amt(String invoice_amt) {
		this.invoice_amt = invoice_amt;
	}

	public String getOrder_amt() {
		return order_amt;
	}

	public void setOrder_amt(String order_amt) {
		this.order_amt = order_amt;
	}

	public String getOrder_txndate() {
		return order_txndate;
	}

	public void setOrder_txndate(String order_txndate) {
		this.order_txndate = order_txndate;
	}

	public String getOrder_txntime() {
		return order_txntime;
	}

	public void setOrder_txntime(String order_txntime) {
		this.order_txntime = order_txntime;
	}

	public String getTrade_state() {
		return trade_state;
	}

	public void setTrade_state(String trade_state) {
		this.trade_state = trade_state;
	}

	public String getTrade_subtype() {
		return trade_subtype;
	}

	public void setTrade_subtype(String trade_subtype) {
		this.trade_subtype = trade_subtype;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccount_state() {
		return account_state;
	}

	public void setAccount_state(String account_state) {
		this.account_state = account_state;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getCash_amount() {
		return cash_amount;
	}

	public void setCash_amount(String cash_amount) {
		this.cash_amount = cash_amount;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getIs_not_use_password() {
		return is_not_use_password;
	}

	public void setIs_not_use_password(String is_not_use_password) {
		this.is_not_use_password = is_not_use_password;
	}

	public String getNot_pass_amount() {
		return not_pass_amount;
	}

	public void setNot_pass_amount(String not_pass_amount) {
		this.not_pass_amount = not_pass_amount;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public String getUncash_amount() {
		return uncash_amount;
	}

	public void setUncash_amount(String uncash_amount) {
		this.uncash_amount = uncash_amount;
	}

	public String getBind_type() {
		return bind_type;
	}

	public void setBind_type(String bind_type) {
		this.bind_type = bind_type;
	}

	public String getHeadurl() {
		return headurl;
	}

	public void setHeadurl(String headurl) {
		this.headurl = headurl;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOper_type() {
		return oper_type;
	}

	public void setOper_type(String oper_type) {
		this.oper_type = oper_type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMessagecheck() {
		return messagecheck;
	}

	public void setMessagecheck(String messagecheck) {
		this.messagecheck = messagecheck;
	}

	public String getBindList() {
		return bindList;
	}

	public void setBindList(String bindList) {
		this.bindList = bindList;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getChange_type() {
		return change_type;
	}

	public void setChange_type(String change_type) {
		this.change_type = change_type;
	}

	public String getNew_paypassword() {
		return new_paypassword;
	}

	public void setNew_paypassword(String new_paypassword) {
		this.new_paypassword = new_paypassword;
	}

	public String getOld_paypassword() {
		return old_paypassword;
	}

	public void setOld_paypassword(String old_paypassword) {
		this.old_paypassword = old_paypassword;
	}

	public String getOrder_state() {
		return order_state;
	}

	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getPagerecnum() {
		return pagerecnum;
	}

	public void setPagerecnum(String pagerecnum) {
		this.pagerecnum = pagerecnum;
	}

	public String getPageseq() {
		return pageseq;
	}

	public void setPageseq(String pageseq) {
		this.pageseq = pageseq;
	}

	public String getTxn_end_time() {
		return txn_end_time;
	}

	public void setTxn_end_time(String txn_end_time) {
		this.txn_end_time = txn_end_time;
	}

	public String getTxn_start_time() {
		return txn_start_time;
	}

	public void setTxn_start_time(String txn_start_time) {
		this.txn_start_time = txn_start_time;
	}

	public String getPagetotal() {
		return pagetotal;
	}

	public void setPagetotal(String pagetotal) {
		this.pagetotal = pagetotal;
	}

	public String getRectotal() {
		return rectotal;
	}

	public void setRectotal(String rectotal) {
		this.rectotal = rectotal;
	}

	public String getOrderList() {
		return orderList;
	}

	public void setOrderList(String orderList) {
		this.orderList = orderList;
	}

	public String getOrdlist() {
		return ordlist;
	}

	public void setOrdlist(String ordlist) {
		this.ordlist = ordlist;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getSmstype() {
		return smstype;
	}

	public void setSmstype(String smstype) {
		this.smstype = smstype;
	}

	public String getCard_orderid() {
		return card_orderid;
	}

	public void setCard_orderid(String card_orderid) {
		this.card_orderid = card_orderid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getVfcCardType() {
		return vfcCardType;
	}

	public void setVfcCardType(String vfcCardType) {
		this.vfcCardType = vfcCardType;
	}

	public String getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}

	public String getDepositAmt() {
		return depositAmt;
	}

	public void setDepositAmt(String depositAmt) {
		this.depositAmt = depositAmt;
	}

	public String getDepositPltOrderid() {
		return depositPltOrderid;
	}

	public void setDepositPltOrderid(String depositPltOrderid) {
		this.depositPltOrderid = depositPltOrderid;
	}

	public String getChnltype() {
		return chnltype;
	}

	public void setChnltype(String chnltype) {
		this.chnltype = chnltype;
	}

	public String getVfcCardChildType() {
		return vfcCardChildType;
	}

	public void setVfcCardChildType(String vfcCardChildType) {
		this.vfcCardChildType = vfcCardChildType;
	}

	public String getConsumeAmt() {
		return consumeAmt;
	}

	public void setConsumeAmt(String consumeAmt) {
		this.consumeAmt = consumeAmt;
	}

	public String getOverDrawFlag() {
		return overDrawFlag;
	}

	public void setOverDrawFlag(String overDrawFlag) {
		this.overDrawFlag = overDrawFlag;
	}

	public String getBasefee() {
		return basefee;
	}

	public void setBasefee(String basefee) {
		this.basefee = basefee;
	}

	public String getFacevalue() {
		return facevalue;
	}

	public void setFacevalue(String facevalue) {
		this.facevalue = facevalue;
	}

	public String getCloudCardno() {
		return cloudCardno;
	}

	public void setCloudCardno(String cloudCardno) {
		this.cloudCardno = cloudCardno;
	}

	public String getVcardno() {
		return vcardno;
	}

	public void setVcardno(String vcardno) {
		this.vcardno = vcardno;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getCustomerno() {
		return customerno;
	}

	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}


	public String getCardapptype() {
		return cardapptype;
	}

	public void setCardapptype(String cardapptype) {
		this.cardapptype = cardapptype;
	}

	public String getOptype() {
		return optype;
	}

	public void setOptype(String optype) {
		this.optype = optype;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "PledgePayInfo{" +
				"city='" + city + '\'' +
				", device='" + device + '\'' +
				", fee_type='" + fee_type + '\'' +
				", goods_body='" + goods_body + '\'' +
				", goods_detail='" + goods_detail + '\'' +
				", imei='" + imei + '\'' +
				", instid='" + instid + '\'' +
				", mchntid='" + mchntid + '\'' +
				", mch_userid='" + mch_userid + '\'' +
				", mch_username='" + mch_username + '\'' +
				", mobiletype='" + mobiletype + '\'' +
				", orderid='" + orderid + '\'' +
				", ordid='" + ordid + '\'' +
				", paypassword='" + paypassword + '\'' +
				", payinst='" + payinst + '\'' +
				", paytype='" + paytype + '\'' +
				", token='" + token + '\'' +
				", vfcCardType='" + vfcCardType + '\'' +
				", rechargeType='" + rechargeType + '\'' +
				", depositAmt='" + depositAmt + '\'' +
				", sdk_info='" + sdk_info + '\'' +
				", cloudCard='" + cloudCard + '\'' +
				", userWallet='" + userWallet + '\'' +
				", vfcCard='" + vfcCard + '\'' +
				", chnltype='" + chnltype + '\'' +
				", vfcCardChildType='" + vfcCardChildType + '\'' +
				", consumeAmt='" + consumeAmt + '\'' +
				", overDrawFlag='" + overDrawFlag + '\'' +
				", basefee='" + basefee + '\'' +
				", facevalue='" + facevalue + '\'' +
				", cloudCardno='" + cloudCardno + '\'' +
				", vcardno='" + vcardno + '\'' +
				", queryType='" + queryType + '\'' +
				", cardapptype='" + cardapptype + '\'' +
				", seid='" + seid + '\'' +
				", syssesq='" + syssesq + '\'' +
				", systemver='" + systemver + '\'' +
				", time_expire='" + time_expire + '\'' +
				", txmamt='" + txmamt + '\'' +
				", txncode='" + txncode + '\'' +
				", txndate='" + txndate + '\'' +
				", txntime='" + txntime + '\'' +
				", voucherno='" + voucherno + '\'' +
				", withdraw_type='" + withdraw_type + '\'' +
				", mch_orderid='" + mch_orderid + '\'' +
				", plt_orderid='" + plt_orderid + '\'' +
				", depositPltOrderid='" + depositPltOrderid + '\'' +
				", bind_type='" + bind_type + '\'' +
				", headurl='" + headurl + '\'' +
				", nickname='" + nickname + '\'' +
				", openid='" + openid + '\'' +
				", oper_type='" + oper_type + '\'' +
				", optype='" + optype + '\'' +
				", sex='" + sex + '\'' +
				", messagecheck='" + messagecheck + '\'' +
				", account_name='" + account_name + '\'' +
				", change_type='" + change_type + '\'' +
				", new_paypassword='" + new_paypassword + '\'' +
				", old_paypassword='" + old_paypassword + '\'' +
				", order_state='" + order_state + '\'' +
				", order_type='" + order_type + '\'' +
				", pagerecnum='" + pagerecnum + '\'' +
				", pageseq='" + pageseq + '\'' +
				", txn_end_time='" + txn_end_time + '\'' +
				", txn_start_time='" + txn_start_time + '\'' +
				", card_orderid='" + card_orderid + '\'' +
				", remark='" + remark + '\'' +
				", mobileno='" + mobileno + '\'' +
				", smstype='" + smstype + '\'' +
				", telephone='" + telephone + '\'' +
				", appid='" + appid + '\'' +
				", customerno='" + customerno + '\'' +
				", cardno='" + cardno + '\'' +
				", attach='" + attach + '\'' +
				", balflag='" + balflag + '\'' +
				", charge_amt='" + charge_amt + '\'' +
				", charge_type='" + charge_type + '\'' +
				", fee='" + fee + '\'' +
				", prepayid='" + prepayid + '\'' +
				", paypassword_state='" + paypassword_state + '\'' +
				", refnum='" + refnum + '\'' +
				", responsecode='" + responsecode + '\'' +
				", responsedesc='" + responsedesc + '\'' +
				", settdate='" + settdate + '\'' +
				", withdraw_amt='" + withdraw_amt + '\'' +
				", cash_fee='" + cash_fee + '\'' +
				", coupon_fee='" + coupon_fee + '\'' +
				", fee_rate='" + fee_rate + '\'' +
				", invoice_amt='" + invoice_amt + '\'' +
				", order_amt='" + order_amt + '\'' +
				", order_txndate='" + order_txndate + '\'' +
				", order_txntime='" + order_txntime + '\'' +
				", trade_state='" + trade_state + '\'' +
				", trade_subtype='" + trade_subtype + '\'' +
				", trade_type='" + trade_type + '\'' +
				", bindList='" + bindList + '\'' +
				", result='" + result + '\'' +
				", userid='" + userid + '\'' +
				", user_id='" + user_id + '\'' +
				", username='" + username + '\'' +
				", account_state='" + account_state + '\'' +
				", account_type='" + account_type + '\'' +
				", cash_amount='" + cash_amount + '\'' +
				", create_time='" + create_time + '\'' +
				", is_not_use_password='" + is_not_use_password + '\'' +
				", not_pass_amount='" + not_pass_amount + '\'' +
				", total_amount='" + total_amount + '\'' +
				", uncash_amount='" + uncash_amount + '\'' +
				", orderList='" + orderList + '\'' +
				", ordlist='" + ordlist + '\'' +
				", pagetotal='" + pagetotal + '\'' +
				", rectotal='" + rectotal + '\'' +
				", balance='" + balance + '\'' +
				'}';
	}
}
