/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.productadskeyword.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.productadskeyword.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.productadskeyword.model.AddWordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.AddWordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.DeleteWordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.DeleteWordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.GetPagedWordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.GetPagedWordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.PauseKeywordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.PauseKeywordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.StartKeywordRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.StartKeywordResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateMatchTypeRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateMatchTypeResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdatePriceRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdatePriceResponseWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateTargetUrlRequestWrapper;
import com.baidu.dev2.api.sdk.productadskeyword.model.UpdateTargetUrlResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProductAdsKeywordService {
  private ApiClient apiClient;

  public ProductAdsKeywordService() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductAdsKeywordService(ApiClient apiClient) {
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
   * @param addWordRequestWrapper  (required)
   * @return AddWordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddWordResponseWrapper addWord(AddWordRequestWrapper addWordRequestWrapper) throws ApiException {
    Object localVarPostBody = addWordRequestWrapper;
    
    // verify the required parameter 'addWordRequestWrapper' is set
    if (addWordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addWordRequestWrapper' when calling addWord");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/addWord";

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

    TypeReference<AddWordResponseWrapper> localVarReturnType = new TypeReference<AddWordResponseWrapper>() {};
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
   * @param deleteWordRequestWrapper  (required)
   * @return DeleteWordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteWordResponseWrapper deleteWord(DeleteWordRequestWrapper deleteWordRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteWordRequestWrapper;
    
    // verify the required parameter 'deleteWordRequestWrapper' is set
    if (deleteWordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteWordRequestWrapper' when calling deleteWord");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/deleteWord";

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

    TypeReference<DeleteWordResponseWrapper> localVarReturnType = new TypeReference<DeleteWordResponseWrapper>() {};
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
   * @param getPagedWordRequestWrapper  (required)
   * @return GetPagedWordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetPagedWordResponseWrapper getPagedWord(GetPagedWordRequestWrapper getPagedWordRequestWrapper) throws ApiException {
    Object localVarPostBody = getPagedWordRequestWrapper;
    
    // verify the required parameter 'getPagedWordRequestWrapper' is set
    if (getPagedWordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getPagedWordRequestWrapper' when calling getPagedWord");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/getPagedWord";

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

    TypeReference<GetPagedWordResponseWrapper> localVarReturnType = new TypeReference<GetPagedWordResponseWrapper>() {};
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
   * @param pauseKeywordRequestWrapper  (required)
   * @return PauseKeywordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public PauseKeywordResponseWrapper pauseKeyword(PauseKeywordRequestWrapper pauseKeywordRequestWrapper) throws ApiException {
    Object localVarPostBody = pauseKeywordRequestWrapper;
    
    // verify the required parameter 'pauseKeywordRequestWrapper' is set
    if (pauseKeywordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'pauseKeywordRequestWrapper' when calling pauseKeyword");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/pauseKeyword";

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

    TypeReference<PauseKeywordResponseWrapper> localVarReturnType = new TypeReference<PauseKeywordResponseWrapper>() {};
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
   * @param startKeywordRequestWrapper  (required)
   * @return StartKeywordResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public StartKeywordResponseWrapper startKeyword(StartKeywordRequestWrapper startKeywordRequestWrapper) throws ApiException {
    Object localVarPostBody = startKeywordRequestWrapper;
    
    // verify the required parameter 'startKeywordRequestWrapper' is set
    if (startKeywordRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'startKeywordRequestWrapper' when calling startKeyword");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/startKeyword";

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

    TypeReference<StartKeywordResponseWrapper> localVarReturnType = new TypeReference<StartKeywordResponseWrapper>() {};
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
   * @param updateMatchTypeRequestWrapper  (required)
   * @return UpdateMatchTypeResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateMatchTypeResponseWrapper updateMatchType(UpdateMatchTypeRequestWrapper updateMatchTypeRequestWrapper) throws ApiException {
    Object localVarPostBody = updateMatchTypeRequestWrapper;
    
    // verify the required parameter 'updateMatchTypeRequestWrapper' is set
    if (updateMatchTypeRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateMatchTypeRequestWrapper' when calling updateMatchType");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/updateMatchType";

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

    TypeReference<UpdateMatchTypeResponseWrapper> localVarReturnType = new TypeReference<UpdateMatchTypeResponseWrapper>() {};
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
   * @param updatePriceRequestWrapper  (required)
   * @return UpdatePriceResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdatePriceResponseWrapper updatePrice(UpdatePriceRequestWrapper updatePriceRequestWrapper) throws ApiException {
    Object localVarPostBody = updatePriceRequestWrapper;
    
    // verify the required parameter 'updatePriceRequestWrapper' is set
    if (updatePriceRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePriceRequestWrapper' when calling updatePrice");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/updatePrice";

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

    TypeReference<UpdatePriceResponseWrapper> localVarReturnType = new TypeReference<UpdatePriceResponseWrapper>() {};
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
   * @param updateTargetUrlRequestWrapper  (required)
   * @return UpdateTargetUrlResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateTargetUrlResponseWrapper updateTargetUrl(UpdateTargetUrlRequestWrapper updateTargetUrlRequestWrapper) throws ApiException {
    Object localVarPostBody = updateTargetUrlRequestWrapper;
    
    // verify the required parameter 'updateTargetUrlRequestWrapper' is set
    if (updateTargetUrlRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateTargetUrlRequestWrapper' when calling updateTargetUrl");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/ProductAdsKeywordService/updateTargetUrl";

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

    TypeReference<UpdateTargetUrlResponseWrapper> localVarReturnType = new TypeReference<UpdateTargetUrlResponseWrapper>() {};
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
