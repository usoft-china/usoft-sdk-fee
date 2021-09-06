package com.usoft.sdk.fee.client.open;

import com.usoft.fee.external.open.api.protobuf.*;
import com.usoft.sdk.fee.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 *  账户服务

 *
 * @author CODE-GEN-GO
 */
public class OpenAccountSdkTest {
    /**
     * 测试地址
     */
    private OpenAccountSdk openAccountSdk = new OpenAccountSdk("https://feerest.uuzcc.cn", "YqXEv7RhbM6PzFtlTgAyHuEPoufh1z7O0Nj1X9SjbbI=");
    
    @Test
    public void getCustomer() throws Exception {
        GetCustomerReq.Builder req = GetCustomerReq.newBuilder();
        //enuu
        req.setEnuu(10050624);
        //系统类型（trade-app：SAAS贸易版  make-app：SAAS制造版）
        req.setCategory("trade-app");

        GetCustomerResp resp = openAccountSdk.getCustomer(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void openCustomer() throws Exception {
        OpenCustomerReq.Builder req = OpenCustomerReq.newBuilder();
        //uu
        req.setUu(0);
        //enuu
        req.setEnuu(0);
        //系统类型（trade-app：SAAS贸易版  make-app：SAAS制造版）
        req.setCategory("");
        // 开通时间 (格式: yyyy-MM-dd HH:mm:ss 如2021-02-05 09:00:00)
        req.setOpenTime("");

        OpenCustomerResp resp = openAccountSdk.openCustomer(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void updateCustomerOrderAmount() throws Exception {
        UpdateCustomerOrderAmountReq.Builder req = UpdateCustomerOrderAmountReq.newBuilder();
        //enuu
        req.setEnuu(0);
        //系统类型（trade-app：SAAS贸易版  make-app：SAAS制造版）
        req.setCategory("");
        //年销售额
        req.setOrderAmount(0);

        UpdateCustomerOrderAmountResp resp = openAccountSdk.updateCustomerOrderAmount(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}