package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOfflineMarketShopPublicUnbindResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.public.unbind request
 * 
 * @author auto create
 * @since 1.0, 2016-02-18 20:01:14
 */
public class AlipayOfflineMarketShopPublicUnbindRequest implements AlipayRequest<AlipayOfflineMarketShopPublicUnbindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 是否解绑所有门店，T表示解绑所有门店，F表示解绑指定shop_ids的门店列表
	 */
	private String isAll;

	/** 
	* 解除绑定门店的ID列表，一次最多解绑100个门店，is_all为T时表示解除绑定本商家下所有门店，即门店列表无需通过本参数shop_ids传入，由系统自动查询;is_all为F时该参数必填
	 */
	private String shopIds;

	public void setIsAll(String isAll) {
		this.isAll = isAll;
	}
	public String getIsAll() {
		return this.isAll;
	}

	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}
	public String getShopIds() {
		return this.shopIds;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.offline.market.shop.public.unbind";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("is_all", this.isAll);
		txtParams.put("shop_ids", this.shopIds);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayOfflineMarketShopPublicUnbindResponse> getResponseClass() {
		return AlipayOfflineMarketShopPublicUnbindResponse.class;
	}
}
