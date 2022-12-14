package com.usoft.sdk.fee.client.open;

import com.usoft.fee.external.open.api.protobuf.*;
import com.usoft.sdk.fee.client.BaseSdk;
import com.usoft.sdk.fee.utils.HttpUtil;
import com.usoft.sdk.fee.utils.ProtoBufUtil;

import java.util.Map;

/**
 *  账户服务

 *
 * @author CODE-GEN-GO
 */
public class OpenAccountSdk extends BaseSdk {

	public OpenAccountSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenAccountSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
    
	/**
	 * 查询客户
	 *
	 * @param req
	 * @return
	 */
	public GetCustomerResp getCustomer(GetCustomerReq.Builder req) throws Exception {
		String url = baseUrl + "/open/account/customer/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetCustomerResp.Builder resp = ProtoBufUtil.toProtoBuf(GetCustomerResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 客户开通
	 *
	 * @param req
	 * @return
	 */
	public OpenCustomerResp openCustomer(OpenCustomerReq.Builder req) throws Exception {
		String url = baseUrl + "/open/account/customer/open";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		OpenCustomerResp.Builder resp = ProtoBufUtil.toProtoBuf(OpenCustomerResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 修改客户年销售额
	 *
	 * @param req
	 * @return
	 */
	public UpdateCustomerOrderAmountResp updateCustomerOrderAmount(UpdateCustomerOrderAmountReq.Builder req) throws Exception {
		String url = baseUrl + "/open/account/customer/order/amount/update";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		UpdateCustomerOrderAmountResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateCustomerOrderAmountResp.newBuilder(), respJson);
		return resp.build();
	}

	/**
	 * 修改客户系统类型
	 *
	 * @param req
	 * @return
	 */
	public UpdateCustomerCategoryResp updateCustomerCategory(UpdateCustomerCategoryReq.Builder req) throws Exception {
		String url = baseUrl + "/open/account/customer/category/update";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		UpdateCustomerCategoryResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateCustomerCategoryResp.newBuilder(), respJson);
		return resp.build();
	}
    
}
