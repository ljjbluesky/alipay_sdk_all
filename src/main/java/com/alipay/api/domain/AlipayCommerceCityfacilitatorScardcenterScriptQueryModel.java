package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询城市一卡通的判卡、读卡脚本
 *
 * @author auto create
 * @since 1.0, 2015-12-09 16:24:55
 */
public class AlipayCommerceCityfacilitatorScardcenterScriptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1485725356963339479L;

	/**
	 * 卡类型，智能卡中心的内部编码规则
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 脚本类型，目前支持两种
readCardType：判定卡是什么城市的交通卡
readCardInfo：读取卡中的余额等信息
	 */
	@ApiField("script_type")
	private String scriptType;

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getScriptType() {
		return this.scriptType;
	}
	public void setScriptType(String scriptType) {
		this.scriptType = scriptType;
	}

}
