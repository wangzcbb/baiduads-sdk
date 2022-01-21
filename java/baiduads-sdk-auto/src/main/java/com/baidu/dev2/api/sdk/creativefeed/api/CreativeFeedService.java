/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.creativefeed.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.creativefeed.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.creativefeed.model.AddCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.AddCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.BindRecommendReasonsRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.BindRecommendReasonsResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.DeleteCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.DeleteCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.GetCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.GetCreativeFeedResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.GetTempCreativeFeedPreviewUrlRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.GetTempCreativeFeedPreviewUrlResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.QueryRecommendReasonsRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.QueryRecommendReasonsResponseWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.UpdateCreativeFeedRequestWrapper;
import com.baidu.dev2.api.sdk.creativefeed.model.UpdateCreativeFeedResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreativeFeedService {
  private ApiClient apiClient;

  public CreativeFeedService() {
    this(Configuration.getDefaultApiClient());
  }

  public CreativeFeedService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param addCreativeFeedRequestWrapper  (required)
   * @return AddCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddCreativeFeedResponseWrapper addCreativeFeed(AddCreativeFeedRequestWrapper addCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = addCreativeFeedRequestWrapper;
    
    // verify the required parameter 'addCreativeFeedRequestWrapper' is set
    if (addCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addCreativeFeedRequestWrapper' when calling addCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/addCreativeFeed";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<AddCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<AddCreativeFeedResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param bindRecommendReasonsRequestWrapper  (required)
   * @return BindRecommendReasonsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public BindRecommendReasonsResponseWrapper bindRecommendReasons(BindRecommendReasonsRequestWrapper bindRecommendReasonsRequestWrapper) throws ApiException {
    Object localVarPostBody = bindRecommendReasonsRequestWrapper;
    
    // verify the required parameter 'bindRecommendReasonsRequestWrapper' is set
    if (bindRecommendReasonsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'bindRecommendReasonsRequestWrapper' when calling bindRecommendReasons");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/bindRecommendReasons";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<BindRecommendReasonsResponseWrapper> localVarReturnType = new TypeReference<BindRecommendReasonsResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param deleteCreativeFeedRequestWrapper  (required)
   * @return DeleteCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteCreativeFeedResponseWrapper deleteCreativeFeed(DeleteCreativeFeedRequestWrapper deleteCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteCreativeFeedRequestWrapper;
    
    // verify the required parameter 'deleteCreativeFeedRequestWrapper' is set
    if (deleteCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteCreativeFeedRequestWrapper' when calling deleteCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/deleteCreativeFeed";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<DeleteCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<DeleteCreativeFeedResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param getCreativeFeedRequestWrapper  (required)
   * @return GetCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetCreativeFeedResponseWrapper getCreativeFeed(GetCreativeFeedRequestWrapper getCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = getCreativeFeedRequestWrapper;
    
    // verify the required parameter 'getCreativeFeedRequestWrapper' is set
    if (getCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getCreativeFeedRequestWrapper' when calling getCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/getCreativeFeed";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<GetCreativeFeedResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper  (required)
   * @return GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper getCreativeFeedPreviewUrlWithPreviewSource(GetCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper) throws ApiException {
    Object localVarPostBody = getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper;
    
    // verify the required parameter 'getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper' is set
    if (getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getCreativeFeedPreviewUrlWithPreviewSourceRequestWrapper' when calling getCreativeFeedPreviewUrlWithPreviewSource");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/getCreativeFeedPreviewUrlWithPreviewSource";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper> localVarReturnType = new TypeReference<GetCreativeFeedPreviewUrlWithPreviewSourceResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param getTempCreativeFeedPreviewUrlRequestWrapper  (required)
   * @return GetTempCreativeFeedPreviewUrlResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetTempCreativeFeedPreviewUrlResponseWrapper getTempCreativeFeedPreviewUrl(GetTempCreativeFeedPreviewUrlRequestWrapper getTempCreativeFeedPreviewUrlRequestWrapper) throws ApiException {
    Object localVarPostBody = getTempCreativeFeedPreviewUrlRequestWrapper;
    
    // verify the required parameter 'getTempCreativeFeedPreviewUrlRequestWrapper' is set
    if (getTempCreativeFeedPreviewUrlRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getTempCreativeFeedPreviewUrlRequestWrapper' when calling getTempCreativeFeedPreviewUrl");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/getTempCreativeFeedPreviewUrl";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetTempCreativeFeedPreviewUrlResponseWrapper> localVarReturnType = new TypeReference<GetTempCreativeFeedPreviewUrlResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param queryRecommendReasonsRequestWrapper  (required)
   * @return QueryRecommendReasonsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public QueryRecommendReasonsResponseWrapper queryRecommendReasons(QueryRecommendReasonsRequestWrapper queryRecommendReasonsRequestWrapper) throws ApiException {
    Object localVarPostBody = queryRecommendReasonsRequestWrapper;
    
    // verify the required parameter 'queryRecommendReasonsRequestWrapper' is set
    if (queryRecommendReasonsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'queryRecommendReasonsRequestWrapper' when calling queryRecommendReasons");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/queryRecommendReasons";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<QueryRecommendReasonsResponseWrapper> localVarReturnType = new TypeReference<QueryRecommendReasonsResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param updateCreativeFeedRequestWrapper  (required)
   * @return UpdateCreativeFeedResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateCreativeFeedResponseWrapper updateCreativeFeed(UpdateCreativeFeedRequestWrapper updateCreativeFeedRequestWrapper) throws ApiException {
    Object localVarPostBody = updateCreativeFeedRequestWrapper;
    
    // verify the required parameter 'updateCreativeFeedRequestWrapper' is set
    if (updateCreativeFeedRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCreativeFeedRequestWrapper' when calling updateCreativeFeed");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CreativeFeedService/updateCreativeFeed";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<UpdateCreativeFeedResponseWrapper> localVarReturnType = new TypeReference<UpdateCreativeFeedResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
