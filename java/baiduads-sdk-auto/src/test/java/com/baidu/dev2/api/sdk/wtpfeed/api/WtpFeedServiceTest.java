/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.wtpfeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.wtpfeed.model.AddWtpFeedRequestWrapper;
import com.baidu.dev2.api.sdk.wtpfeed.model.AddWtpFeedResponseWrapper;
import com.baidu.dev2.api.sdk.wtpfeed.model.DeleteWtpFeedRequestWrapper;
import com.baidu.dev2.api.sdk.wtpfeed.model.DeleteWtpFeedResponseWrapper;
import com.baidu.dev2.api.sdk.wtpfeed.model.GetWtpFeedRequestWrapper;
import com.baidu.dev2.api.sdk.wtpfeed.model.GetWtpFeedResponseWrapper;
import com.baidu.dev2.api.sdk.wtpfeed.model.UpdateWtpFeedRequestWrapper;
import com.baidu.dev2.api.sdk.wtpfeed.model.UpdateWtpFeedResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WtpFeedService
 */
@Ignore
public class WtpFeedServiceTest {

    private final WtpFeedService api = new WtpFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addWtpFeedTest() throws ApiException {
        AddWtpFeedRequestWrapper addWtpFeedRequestWrapper = null;
        AddWtpFeedResponseWrapper response = api.addWtpFeed(addWtpFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWtpFeedTest() throws ApiException {
        DeleteWtpFeedRequestWrapper deleteWtpFeedRequestWrapper = null;
        DeleteWtpFeedResponseWrapper response = api.deleteWtpFeed(deleteWtpFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWtpFeedTest() throws ApiException {
        GetWtpFeedRequestWrapper getWtpFeedRequestWrapper = null;
        GetWtpFeedResponseWrapper response = api.getWtpFeed(getWtpFeedRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWtpFeedTest() throws ApiException {
        UpdateWtpFeedRequestWrapper updateWtpFeedRequestWrapper = null;
        UpdateWtpFeedResponseWrapper response = api.updateWtpFeed(updateWtpFeedRequestWrapper);

        // TODO: test validations
    }
}
