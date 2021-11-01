package com.usoft.sdk.fee.client.open;

import com.usoft.fee.external.open.api.protobuf.PagingRechargeReq;
import com.usoft.fee.external.open.api.protobuf.PagingRechargeResp;
import com.usoft.sdk.fee.client.BaseSdk;
import com.usoft.sdk.fee.utils.HttpUtil;
import com.usoft.sdk.fee.utils.ProtoBufUtil;

import java.util.Map;

/**
 *  充值服务
 *
 * @author CODE-GEN-GO
 */
public class OpenRechargeSdk extends BaseSdk {

	public OpenRechargeSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenRechargeSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
    
	/**
	 * 分页查询充值记录列表
	 *
	 * @param req
	 * @return
	 */
	public PagingRechargeResp pagingRecharge(PagingRechargeReq.Builder req) throws Exception {
		String url = baseUrl + "/open/recharge/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingRechargeResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingRechargeResp.newBuilder(), respJson);
		return resp.build();
	}
    
}
