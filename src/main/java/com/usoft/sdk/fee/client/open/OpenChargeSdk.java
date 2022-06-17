package com.usoft.sdk.fee.client.open;

import com.usoft.fee.external.open.api.protobuf.*;
import com.usoft.sdk.fee.client.BaseSdk;
import com.usoft.sdk.fee.utils.HttpUtil;
import com.usoft.sdk.fee.utils.ProtoBufUtil;

import java.util.Map;

/**
 *  收费服务
 *
 * @author CODE-GEN-GO
 */
public class OpenChargeSdk extends BaseSdk {

	public OpenChargeSdk(String baseUrl, String secretKey) {
		super(baseUrl, secretKey);
	}

	public OpenChargeSdk(String baseUrl, String secretKey, int timeout) {
		super(baseUrl, secretKey, timeout);
	}
    
	/**
	 * 查询收费等级列表
	 *
	 * @param req
	 * @return
	 */
	public ListChargeLevelResp listChargeLevel(ListChargeLevelReq.Builder req) throws Exception {
		String url = baseUrl + "/open/charge/level/list";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		ListChargeLevelResp.Builder resp = ProtoBufUtil.toProtoBuf(ListChargeLevelResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 分页查询月账单列表
	 *
	 * @param req
	 * @return
	 */
	public PagingMonthBillResp pagingMonthBill(PagingMonthBillReq.Builder req) throws Exception {
		String url = baseUrl + "/open/charge/month/bill/paging";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		PagingMonthBillResp.Builder resp = ProtoBufUtil.toProtoBuf(PagingMonthBillResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 重算月账单
	 *
	 * @param req
	 * @return
	 */
	public RefreshMonthBillResp refreshMonthBill(RefreshMonthBillReq.Builder req) throws Exception {
		String url = baseUrl + "/open/charge/month/bill/refresh";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		RefreshMonthBillResp.Builder resp = ProtoBufUtil.toProtoBuf(RefreshMonthBillResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 修改收费等级
	 *
	 * @param req
	 * @return
	 */
	public UpdateChargeLevelResp updateChargeLevel(UpdateChargeLevelReq.Builder req) throws Exception {
		String url = baseUrl + "/open/charge/level/update";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		UpdateChargeLevelResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateChargeLevelResp.newBuilder(), respJson);
		return resp.build();
	}
    
}
