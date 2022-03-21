/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videosynthetise.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.videosynthetise.model.ClipVideoRequestWrapper;
import com.baidu.dev2.api.sdk.videosynthetise.model.ClipVideoResponseWrapper;
import com.baidu.dev2.api.sdk.videosynthetise.model.QueryVideoClipStatusRequestWrapper;
import com.baidu.dev2.api.sdk.videosynthetise.model.QueryVideoClipStatusResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoSynthetiseService
 */
@Ignore
public class VideoSynthetiseServiceTest {

    private final VideoSynthetiseService api = new VideoSynthetiseService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clipVideoTest() throws ApiException {
        ClipVideoRequestWrapper clipVideoRequestWrapper = null;
        ClipVideoResponseWrapper response = api.clipVideo(clipVideoRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryVideoClipStatusTest() throws ApiException {
        QueryVideoClipStatusRequestWrapper queryVideoClipStatusRequestWrapper = null;
        QueryVideoClipStatusResponseWrapper response = api.queryVideoClipStatus(queryVideoClipStatusRequestWrapper);

        // TODO: test validations
    }
}
