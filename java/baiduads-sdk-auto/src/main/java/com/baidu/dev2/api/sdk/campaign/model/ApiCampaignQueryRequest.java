/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.campaign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiCampaignQueryRequest
 */
@JsonPropertyOrder({
  ApiCampaignQueryRequest.JSON_PROPERTY_CAMPAIGN_FIELDS,
  ApiCampaignQueryRequest.JSON_PROPERTY_CAMPAIGN_IDS,
  ApiCampaignQueryRequest.JSON_PROPERTY_MOBILE_EXTEND,
  ApiCampaignQueryRequest.JSON_PROPERTY_AD_TYPE
})
@JsonTypeName("ApiCampaignQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiCampaignQueryRequest {
  public static final String JSON_PROPERTY_CAMPAIGN_FIELDS = "campaignFields";
  private List<String> campaignFields = null;

  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_MOBILE_EXTEND = "mobileExtend";
  private Integer mobileExtend;

  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private Integer adType;

  public ApiCampaignQueryRequest() { 
  }

  public ApiCampaignQueryRequest campaignFields(List<String> campaignFields) {
    
    this.campaignFields = campaignFields;
    return this;
  }

  public ApiCampaignQueryRequest addCampaignFieldsItem(String campaignFieldsItem) {
    if (this.campaignFields == null) {
      this.campaignFields = new ArrayList<>();
    }
    this.campaignFields.add(campaignFieldsItem);
    return this;
  }

   /**
   * Get campaignFields
   * @return campaignFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCampaignFields() {
    return campaignFields;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignFields(List<String> campaignFields) {
    this.campaignFields = campaignFields;
  }


  public ApiCampaignQueryRequest campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ApiCampaignQueryRequest addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * Get campaignIds
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public ApiCampaignQueryRequest mobileExtend(Integer mobileExtend) {
    
    this.mobileExtend = mobileExtend;
    return this;
  }

   /**
   * Get mobileExtend
   * @return mobileExtend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_EXTEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMobileExtend() {
    return mobileExtend;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_EXTEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileExtend(Integer mobileExtend) {
    this.mobileExtend = mobileExtend;
  }


  public ApiCampaignQueryRequest adType(Integer adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdType() {
    return adType;
  }


  @JsonProperty(JSON_PROPERTY_AD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdType(Integer adType) {
    this.adType = adType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCampaignQueryRequest apiCampaignQueryRequest = (ApiCampaignQueryRequest) o;
    return Objects.equals(this.campaignFields, apiCampaignQueryRequest.campaignFields) &&
        Objects.equals(this.campaignIds, apiCampaignQueryRequest.campaignIds) &&
        Objects.equals(this.mobileExtend, apiCampaignQueryRequest.mobileExtend) &&
        Objects.equals(this.adType, apiCampaignQueryRequest.adType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignFields, campaignIds, mobileExtend, adType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCampaignQueryRequest {\n");
    sb.append("    campaignFields: ").append(toIndentedString(campaignFields)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    mobileExtend: ").append(toIndentedString(mobileExtend)).append("\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

