package com.usoft.sdk.fee.client.open;

import com.usoft.fee.external.open.api.protobuf.PagingRechargeReq;
import com.usoft.fee.external.open.api.protobuf.PagingRechargeResp;
import com.usoft.sdk.fee.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 *  充值服务
 *
 * @author CODE-GEN-GO
 */
public class OpenRechargeSdkTest {
    /**
     * 测试地址
     */
    private OpenRechargeSdk openRechargeSdk = new OpenRechargeSdk("https://feerest.uuzcc.cn", "YqXEv7RhbM6PzFtlTgAyHuEPoufh1z7O0Nj1X9SjbbI=");
    
    @Test
    public void pagingRecharge() throws Exception {
        PagingRechargeReq.Builder req = PagingRechargeReq.newBuilder();
        //enuu
        req.setEnuu(10050624);
        //页号
        req.setPageNumber(0);
        //页大小
        req.setPageSize(0);
        // 数据修改时间 时间戳(单位：毫秒)
        req.setUpdateTime(1628839698000l);

        PagingRechargeResp resp = openRechargeSdk.pagingRecharge(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}