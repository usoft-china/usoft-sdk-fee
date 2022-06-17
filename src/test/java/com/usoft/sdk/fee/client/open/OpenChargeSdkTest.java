package com.usoft.sdk.fee.client.open;

import com.usoft.fee.external.open.api.entity.UpdateChargeLevel;
import com.usoft.fee.external.open.api.protobuf.*;
import com.usoft.sdk.fee.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 *  收费服务
 *
 * @author CODE-GEN-GO
 */
public class OpenChargeSdkTest {
    /**
     * 测试地址
     */
    private OpenChargeSdk openChargeSdk = new OpenChargeSdk("https://feerest.uuzcc.cn", "YqXEv7RhbM6PzFtlTgAyHuEPoufh1z7O0Nj1X9SjbbI=");
    
    @Test
    public void listChargeLevel() throws Exception {
        ListChargeLevelReq.Builder req = ListChargeLevelReq.newBuilder();

        ListChargeLevelResp resp = openChargeSdk.listChargeLevel(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void pagingMonthBill() throws Exception {
        PagingMonthBillReq.Builder req = PagingMonthBillReq.newBuilder();
        //页号
        req.setPageNumber(1);
        //页大小
        req.setPageSize(10);
        //关键词（客户名称）
        req.setKeywords("深圳");
        //开始时间
        req.setStartTime("2022-05-01 08:00:00");
        //结束时间
        req.setEndTime("");

        PagingMonthBillResp resp = openChargeSdk.pagingMonthBill(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void refreshMonthBill() throws Exception {
        RefreshMonthBillReq.Builder req = RefreshMonthBillReq.newBuilder();
        //月账单编号
        req.setMonthBillCode("");

        RefreshMonthBillResp resp = openChargeSdk.refreshMonthBill(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void updateChargeLevel() throws Exception {
        UpdateChargeLevelReq.Builder req = UpdateChargeLevelReq.newBuilder();
        UpdateChargeLevel.Builder builder = UpdateChargeLevel.newBuilder();
        //编号
        builder.setCode("");
        //年费
        builder.setYearCharge(0);
        req.addChargeLevel(builder);

        UpdateChargeLevelResp resp = openChargeSdk.updateChargeLevel(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}