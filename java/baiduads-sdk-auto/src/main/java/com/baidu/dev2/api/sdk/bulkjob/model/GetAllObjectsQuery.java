/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.bulkjob.model;

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
 * GetAllObjectsQuery
 */
@JsonPropertyOrder({
  GetAllObjectsQuery.JSON_PROPERTY_CAMPAIGN_IDS,
  GetAllObjectsQuery.JSON_PROPERTY_INCLUDE_TEMP,
  GetAllObjectsQuery.JSON_PROPERTY_FORMAT,
  GetAllObjectsQuery.JSON_PROPERTY_MOBILE_EXTEND,
  GetAllObjectsQuery.JSON_PROPERTY_ONLY_BIND_SEGMENTS,
  GetAllObjectsQuery.JSON_PROPERTY_ACCOUNT_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_CAMPAIGN_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_ADGROUP_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_ADGROUP_APP_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_KEYWORD_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_CREATIVE_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_SEGMENT_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_URL_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_SHOWQ_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_BUSINESS_LABEL_FIELDS,
  GetAllObjectsQuery.JSON_PROPERTY_AUTO_EXPANSION_FIELDS
})
@JsonTypeName("GetAllObjectsQuery")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAllObjectsQuery {
  public static final String JSON_PROPERTY_CAMPAIGN_IDS = "campaignIds";
  private List<Long> campaignIds = null;

  public static final String JSON_PROPERTY_INCLUDE_TEMP = "includeTemp";
  private Boolean includeTemp;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private Integer format;

  public static final String JSON_PROPERTY_MOBILE_EXTEND = "mobileExtend";
  private Integer mobileExtend;

  public static final String JSON_PROPERTY_ONLY_BIND_SEGMENTS = "onlyBindSegments";
  private Boolean onlyBindSegments;

  public static final String JSON_PROPERTY_ACCOUNT_FIELDS = "accountFields";
  private List<String> accountFields = null;

  public static final String JSON_PROPERTY_CAMPAIGN_FIELDS = "campaignFields";
  private List<String> campaignFields = null;

  public static final String JSON_PROPERTY_ADGROUP_FIELDS = "adgroupFields";
  private List<String> adgroupFields = null;

  public static final String JSON_PROPERTY_ADGROUP_APP_FIELDS = "adgroupAppFields";
  private List<String> adgroupAppFields = null;

  public static final String JSON_PROPERTY_KEYWORD_FIELDS = "keywordFields";
  private List<String> keywordFields = null;

  public static final String JSON_PROPERTY_CREATIVE_FIELDS = "creativeFields";
  private List<String> creativeFields = null;

  public static final String JSON_PROPERTY_SEGMENT_FIELDS = "segmentFields";
  private List<String> segmentFields = null;

  public static final String JSON_PROPERTY_URL_FIELDS = "urlFields";
  private List<String> urlFields = null;

  public static final String JSON_PROPERTY_SHOWQ_FIELDS = "showqFields";
  private List<String> showqFields = null;

  public static final String JSON_PROPERTY_BUSINESS_LABEL_FIELDS = "businessLabelFields";
  private List<String> businessLabelFields = null;

  public static final String JSON_PROPERTY_AUTO_EXPANSION_FIELDS = "autoExpansionFields";
  private List<String> autoExpansionFields = null;

  public GetAllObjectsQuery() { 
  }

  public GetAllObjectsQuery campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public GetAllObjectsQuery addCampaignIdsItem(Long campaignIdsItem) {
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


  public GetAllObjectsQuery includeTemp(Boolean includeTemp) {
    
    this.includeTemp = includeTemp;
    return this;
  }

   /**
   * Get includeTemp
   * @return includeTemp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDE_TEMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeTemp() {
    return includeTemp;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TEMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTemp(Boolean includeTemp) {
    this.includeTemp = includeTemp;
  }


  public GetAllObjectsQuery format(Integer format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(Integer format) {
    this.format = format;
  }


  public GetAllObjectsQuery mobileExtend(Integer mobileExtend) {
    
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


  public GetAllObjectsQuery onlyBindSegments(Boolean onlyBindSegments) {
    
    this.onlyBindSegments = onlyBindSegments;
    return this;
  }

   /**
   * Get onlyBindSegments
   * @return onlyBindSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ONLY_BIND_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyBindSegments() {
    return onlyBindSegments;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_BIND_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyBindSegments(Boolean onlyBindSegments) {
    this.onlyBindSegments = onlyBindSegments;
  }


  public GetAllObjectsQuery accountFields(List<String> accountFields) {
    
    this.accountFields = accountFields;
    return this;
  }

  public GetAllObjectsQuery addAccountFieldsItem(String accountFieldsItem) {
    if (this.accountFields == null) {
      this.accountFields = new ArrayList<>();
    }
    this.accountFields.add(accountFieldsItem);
    return this;
  }

   /**
   * Get accountFields
   * @return accountFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccountFields() {
    return accountFields;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountFields(List<String> accountFields) {
    this.accountFields = accountFields;
  }


  public GetAllObjectsQuery campaignFields(List<String> campaignFields) {
    
    this.campaignFields = campaignFields;
    return this;
  }

  public GetAllObjectsQuery addCampaignFieldsItem(String campaignFieldsItem) {
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


  public GetAllObjectsQuery adgroupFields(List<String> adgroupFields) {
    
    this.adgroupFields = adgroupFields;
    return this;
  }

  public GetAllObjectsQuery addAdgroupFieldsItem(String adgroupFieldsItem) {
    if (this.adgroupFields == null) {
      this.adgroupFields = new ArrayList<>();
    }
    this.adgroupFields.add(adgroupFieldsItem);
    return this;
  }

   /**
   * Get adgroupFields
   * @return adgroupFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAdgroupFields() {
    return adgroupFields;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupFields(List<String> adgroupFields) {
    this.adgroupFields = adgroupFields;
  }


  public GetAllObjectsQuery adgroupAppFields(List<String> adgroupAppFields) {
    
    this.adgroupAppFields = adgroupAppFields;
    return this;
  }

  public GetAllObjectsQuery addAdgroupAppFieldsItem(String adgroupAppFieldsItem) {
    if (this.adgroupAppFields == null) {
      this.adgroupAppFields = new ArrayList<>();
    }
    this.adgroupAppFields.add(adgroupAppFieldsItem);
    return this;
  }

   /**
   * Get adgroupAppFields
   * @return adgroupAppFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_APP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAdgroupAppFields() {
    return adgroupAppFields;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_APP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupAppFields(List<String> adgroupAppFields) {
    this.adgroupAppFields = adgroupAppFields;
  }


  public GetAllObjectsQuery keywordFields(List<String> keywordFields) {
    
    this.keywordFields = keywordFields;
    return this;
  }

  public GetAllObjectsQuery addKeywordFieldsItem(String keywordFieldsItem) {
    if (this.keywordFields == null) {
      this.keywordFields = new ArrayList<>();
    }
    this.keywordFields.add(keywordFieldsItem);
    return this;
  }

   /**
   * Get keywordFields
   * @return keywordFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKeywordFields() {
    return keywordFields;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordFields(List<String> keywordFields) {
    this.keywordFields = keywordFields;
  }


  public GetAllObjectsQuery creativeFields(List<String> creativeFields) {
    
    this.creativeFields = creativeFields;
    return this;
  }

  public GetAllObjectsQuery addCreativeFieldsItem(String creativeFieldsItem) {
    if (this.creativeFields == null) {
      this.creativeFields = new ArrayList<>();
    }
    this.creativeFields.add(creativeFieldsItem);
    return this;
  }

   /**
   * Get creativeFields
   * @return creativeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCreativeFields() {
    return creativeFields;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeFields(List<String> creativeFields) {
    this.creativeFields = creativeFields;
  }


  public GetAllObjectsQuery segmentFields(List<String> segmentFields) {
    
    this.segmentFields = segmentFields;
    return this;
  }

  public GetAllObjectsQuery addSegmentFieldsItem(String segmentFieldsItem) {
    if (this.segmentFields == null) {
      this.segmentFields = new ArrayList<>();
    }
    this.segmentFields.add(segmentFieldsItem);
    return this;
  }

   /**
   * Get segmentFields
   * @return segmentFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEGMENT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSegmentFields() {
    return segmentFields;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentFields(List<String> segmentFields) {
    this.segmentFields = segmentFields;
  }


  public GetAllObjectsQuery urlFields(List<String> urlFields) {
    
    this.urlFields = urlFields;
    return this;
  }

  public GetAllObjectsQuery addUrlFieldsItem(String urlFieldsItem) {
    if (this.urlFields == null) {
      this.urlFields = new ArrayList<>();
    }
    this.urlFields.add(urlFieldsItem);
    return this;
  }

   /**
   * Get urlFields
   * @return urlFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUrlFields() {
    return urlFields;
  }


  @JsonProperty(JSON_PROPERTY_URL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlFields(List<String> urlFields) {
    this.urlFields = urlFields;
  }


  public GetAllObjectsQuery showqFields(List<String> showqFields) {
    
    this.showqFields = showqFields;
    return this;
  }

  public GetAllObjectsQuery addShowqFieldsItem(String showqFieldsItem) {
    if (this.showqFields == null) {
      this.showqFields = new ArrayList<>();
    }
    this.showqFields.add(showqFieldsItem);
    return this;
  }

   /**
   * Get showqFields
   * @return showqFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOWQ_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getShowqFields() {
    return showqFields;
  }


  @JsonProperty(JSON_PROPERTY_SHOWQ_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShowqFields(List<String> showqFields) {
    this.showqFields = showqFields;
  }


  public GetAllObjectsQuery businessLabelFields(List<String> businessLabelFields) {
    
    this.businessLabelFields = businessLabelFields;
    return this;
  }

  public GetAllObjectsQuery addBusinessLabelFieldsItem(String businessLabelFieldsItem) {
    if (this.businessLabelFields == null) {
      this.businessLabelFields = new ArrayList<>();
    }
    this.businessLabelFields.add(businessLabelFieldsItem);
    return this;
  }

   /**
   * Get businessLabelFields
   * @return businessLabelFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBusinessLabelFields() {
    return businessLabelFields;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_LABEL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLabelFields(List<String> businessLabelFields) {
    this.businessLabelFields = businessLabelFields;
  }


  public GetAllObjectsQuery autoExpansionFields(List<String> autoExpansionFields) {
    
    this.autoExpansionFields = autoExpansionFields;
    return this;
  }

  public GetAllObjectsQuery addAutoExpansionFieldsItem(String autoExpansionFieldsItem) {
    if (this.autoExpansionFields == null) {
      this.autoExpansionFields = new ArrayList<>();
    }
    this.autoExpansionFields.add(autoExpansionFieldsItem);
    return this;
  }

   /**
   * Get autoExpansionFields
   * @return autoExpansionFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_EXPANSION_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAutoExpansionFields() {
    return autoExpansionFields;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_EXPANSION_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoExpansionFields(List<String> autoExpansionFields) {
    this.autoExpansionFields = autoExpansionFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllObjectsQuery getAllObjectsQuery = (GetAllObjectsQuery) o;
    return Objects.equals(this.campaignIds, getAllObjectsQuery.campaignIds) &&
        Objects.equals(this.includeTemp, getAllObjectsQuery.includeTemp) &&
        Objects.equals(this.format, getAllObjectsQuery.format) &&
        Objects.equals(this.mobileExtend, getAllObjectsQuery.mobileExtend) &&
        Objects.equals(this.onlyBindSegments, getAllObjectsQuery.onlyBindSegments) &&
        Objects.equals(this.accountFields, getAllObjectsQuery.accountFields) &&
        Objects.equals(this.campaignFields, getAllObjectsQuery.campaignFields) &&
        Objects.equals(this.adgroupFields, getAllObjectsQuery.adgroupFields) &&
        Objects.equals(this.adgroupAppFields, getAllObjectsQuery.adgroupAppFields) &&
        Objects.equals(this.keywordFields, getAllObjectsQuery.keywordFields) &&
        Objects.equals(this.creativeFields, getAllObjectsQuery.creativeFields) &&
        Objects.equals(this.segmentFields, getAllObjectsQuery.segmentFields) &&
        Objects.equals(this.urlFields, getAllObjectsQuery.urlFields) &&
        Objects.equals(this.showqFields, getAllObjectsQuery.showqFields) &&
        Objects.equals(this.businessLabelFields, getAllObjectsQuery.businessLabelFields) &&
        Objects.equals(this.autoExpansionFields, getAllObjectsQuery.autoExpansionFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds, includeTemp, format, mobileExtend, onlyBindSegments, accountFields, campaignFields, adgroupFields, adgroupAppFields, keywordFields, creativeFields, segmentFields, urlFields, showqFields, businessLabelFields, autoExpansionFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllObjectsQuery {\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    includeTemp: ").append(toIndentedString(includeTemp)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    mobileExtend: ").append(toIndentedString(mobileExtend)).append("\n");
    sb.append("    onlyBindSegments: ").append(toIndentedString(onlyBindSegments)).append("\n");
    sb.append("    accountFields: ").append(toIndentedString(accountFields)).append("\n");
    sb.append("    campaignFields: ").append(toIndentedString(campaignFields)).append("\n");
    sb.append("    adgroupFields: ").append(toIndentedString(adgroupFields)).append("\n");
    sb.append("    adgroupAppFields: ").append(toIndentedString(adgroupAppFields)).append("\n");
    sb.append("    keywordFields: ").append(toIndentedString(keywordFields)).append("\n");
    sb.append("    creativeFields: ").append(toIndentedString(creativeFields)).append("\n");
    sb.append("    segmentFields: ").append(toIndentedString(segmentFields)).append("\n");
    sb.append("    urlFields: ").append(toIndentedString(urlFields)).append("\n");
    sb.append("    showqFields: ").append(toIndentedString(showqFields)).append("\n");
    sb.append("    businessLabelFields: ").append(toIndentedString(businessLabelFields)).append("\n");
    sb.append("    autoExpansionFields: ").append(toIndentedString(autoExpansionFields)).append("\n");
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

