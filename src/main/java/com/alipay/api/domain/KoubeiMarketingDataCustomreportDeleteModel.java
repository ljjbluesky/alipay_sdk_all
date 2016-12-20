package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表删除接口
 *
 * @author auto create
 * @since 1.0, 2016-07-21 19:37:21
 */
public class KoubeiMarketingDataCustomreportDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4862437382771459293L;

	/**
	 * 自定义报表规则的KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

	public String getConditionKey() {
		return this.conditionKey;
	}
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

}