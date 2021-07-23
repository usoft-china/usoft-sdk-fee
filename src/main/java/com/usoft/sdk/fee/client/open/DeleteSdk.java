package com.usoft.sdk.fee.client.open;

import com.usoft.sdk.fee.client.BaseSdk;
import com.usoft.sdk.fee.utils.HttpUtil;
import com.usoft.sdk.fee.utils.ProtoBufUtil;

import java.util.Map;

/**
 * 合伙人sdk
 *
 * @author uas
 * @date 2020/8/11 15:59
 */
public class DeleteSdk extends BaseSdk {

    public DeleteSdk(String baseUrl, String secretKey) {
        super(baseUrl, secretKey);
    }

    public DeleteSdk(String baseUrl, String secretKey, int timeout) {
        super(baseUrl, secretKey, timeout);
    }

}
