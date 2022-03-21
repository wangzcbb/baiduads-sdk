/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.rtafeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.rtafeed.model.AddRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.AddRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelStrategyRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.DelStrategyResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetConfigurableUsersRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetConfigurableUsersResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaTokenRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetRtaTokenResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetStrategyRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.GetStrategyResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateRtaSettingRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateRtaSettingResponseWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateStrategyRequestWrapper;
import com.baidu.dev2.api.sdk.rtafeed.model.UpdateStrategyResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RtaFeedService
 */
@Ignore
public class RtaFeedServiceTest {

    private final RtaFeedService api = new RtaFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addRtaSettingTest() throws ApiException {
        AddRtaSettingRequestWrapper addRtaSettingRequestWrapper = null;
        AddRtaSettingResponseWrapper response = api.addRtaSetting(addRtaSettingRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delRtaSettingTest() throws ApiException {
        DelRtaSettingRequestWrapper delRtaSettingRequestWrapper = null;
        DelRtaSettingResponseWrapper response = api.delRtaSetting(delRtaSettingRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delStrategyTest() throws ApiException {
        DelStrategyRequestWrapper delStrategyRequestWrapper = null;
        DelStrategyResponseWrapper response = api.delStrategy(delStrategyRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigurableUsersTest() throws ApiException {
        GetConfigurableUsersRequestWrapper getConfigurableUsersRequestWrapper = null;
        GetConfigurableUsersResponseWrapper response = api.getConfigurableUsers(getConfigurableUsersRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRtaSettingTest() throws ApiException {
        GetRtaSettingRequestWrapper getRtaSettingRequestWrapper = null;
        GetRtaSettingResponseWrapper response = api.getRtaSetting(getRtaSettingRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRtaTokenTest() throws ApiException {
        GetRtaTokenRequestWrapper getRtaTokenRequestWrapper = null;
        GetRtaTokenResponseWrapper response = api.getRtaToken(getRtaTokenRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStrategyTest() throws ApiException {
        GetStrategyRequestWrapper getStrategyRequestWrapper = null;
        GetStrategyResponseWrapper response = api.getStrategy(getStrategyRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRtaSettingTest() throws ApiException {
        UpdateRtaSettingRequestWrapper updateRtaSettingRequestWrapper = null;
        UpdateRtaSettingResponseWrapper response = api.updateRtaSetting(updateRtaSettingRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateStrategyTest() throws ApiException {
        UpdateStrategyRequestWrapper updateStrategyRequestWrapper = null;
        UpdateStrategyResponseWrapper response = api.updateStrategy(updateStrategyRequestWrapper);

        // TODO: test validations
    }
}
