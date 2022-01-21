/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 * The version of the OpenAPI document: 1.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.accountfeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.accountfeed.model.GetAccountFeedRequestWrapper;
import com.baidu.dev2.api.sdk.accountfeed.model.GetAccountFeedResponseWrapper;
import com.baidu.dev2.api.sdk.accountfeed.model.GetRtaSettingFeedRequestWrapper;
import com.baidu.dev2.api.sdk.accountfeed.model.GetRtaSettingFeedResponseWrapper;
import com.baidu.dev2.api.sdk.accountfeed.model.UpdateAccountFeedRequestWrapper;
import com.baidu.dev2.api.sdk.accountfeed.model.UpdateAccountFeedResponseWrapper;
import com.baidu.dev2.api.sdk.accountfeed.model.UpdateRtaSettingFeedRequestWrapper;
import com.baidu.dev2.api.sdk.accountfeed.model.UpdateRtaSettingFeedResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountFeedService
 */
@Ignore
public class AccountFeedServiceTest {

    private final AccountFeedService api = new AccountFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountFeedTest() throws ApiException {
        GetAccountFeedRequestWrapper getAccountFeedRequestWrapper = null;
        GetAccountFeedResponseWrapper response = api.getAccountFeed(getAccountFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRtaSettingFeedTest() throws ApiException {
        GetRtaSettingFeedRequestWrapper getRtaSettingFeedRequestWrapper = null;
        GetRtaSettingFeedResponseWrapper response = api.getRtaSettingFeed(getRtaSettingFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountFeedTest() throws ApiException {
        UpdateAccountFeedRequestWrapper updateAccountFeedRequestWrapper = null;
        UpdateAccountFeedResponseWrapper response = api.updateAccountFeed(updateAccountFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRtaSettingFeedTest() throws ApiException {
        UpdateRtaSettingFeedRequestWrapper updateRtaSettingFeedRequestWrapper = null;
        UpdateRtaSettingFeedResponseWrapper response = api.updateRtaSettingFeed(updateRtaSettingFeedRequestWrapper);

        // TODO: test validations
    }
}
