package com.kunbao.weixin.sdk.base;

import com.kunbao.weixin.sdk.base.domain.constant.WXAppInfo;
import com.kunbao.weixin.sdk.token.request.WXTokenRequest;
import com.kunbao.weixin.sdk.token.response.WXTokenResponse;
import junit.framework.TestCase;

/**
 * Created by lemon_bar on 15/7/7.
 */
public class WXHttpDispatchTest extends TestCase {

    public void testExecute() throws Exception {

        WXTokenRequest request = new WXTokenRequest(WXAppInfo.APP_ID, WXAppInfo.APP_SECRET);
        WXTokenResponse response = (WXTokenResponse) WXHttpDispatch.execute(request);
    }
}