/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.video.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.video.model.DeleteVideosRequestWrapper;
import com.baidu.dev2.api.sdk.video.model.DeleteVideosResponseWrapper;
import com.baidu.dev2.api.sdk.video.model.GetVideoInfosRequestWrapper;
import com.baidu.dev2.api.sdk.video.model.GetVideoInfosResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoService
 */
@Ignore
public class VideoServiceTest {

    private final VideoService api = new VideoService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVideosTest() throws ApiException {
        DeleteVideosRequestWrapper deleteVideosRequestWrapper = null;
        DeleteVideosResponseWrapper response = api.deleteVideos(deleteVideosRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVideoInfosTest() throws ApiException {
        GetVideoInfosRequestWrapper getVideoInfosRequestWrapper = null;
        GetVideoInfosResponseWrapper response = api.getVideoInfos(getVideoInfosRequestWrapper);

        // TODO: test validations
    }
}
