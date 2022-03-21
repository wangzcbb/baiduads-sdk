/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

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
 * LandPageQualityApiType
 */
@JsonPropertyOrder({
  LandPageQualityApiType.JSON_PROPERTY_ID,
  LandPageQualityApiType.JSON_PROPERTY_KEYWORD_ID,
  LandPageQualityApiType.JSON_PROPERTY_CREATIVE_ID,
  LandPageQualityApiType.JSON_PROPERTY_CAMPAIGN_ID,
  LandPageQualityApiType.JSON_PROPERTY_CAMPAIGN_NAME,
  LandPageQualityApiType.JSON_PROPERTY_ADGROUP_ID,
  LandPageQualityApiType.JSON_PROPERTY_ADGROUP_NAME,
  LandPageQualityApiType.JSON_PROPERTY_IMPRESSION_INC_MIN,
  LandPageQualityApiType.JSON_PROPERTY_IMPRESSION_INC_MAX,
  LandPageQualityApiType.JSON_PROPERTY_IMPRESSION,
  LandPageQualityApiType.JSON_PROPERTY_CLICK,
  LandPageQualityApiType.JSON_PROPERTY_COST,
  LandPageQualityApiType.JSON_PROPERTY_BUSINESS_POINT_ID,
  LandPageQualityApiType.JSON_PROPERTY_AD_TYPE,
  LandPageQualityApiType.JSON_PROPERTY_MARKETING_TARGET_ID,
  LandPageQualityApiType.JSON_PROPERTY_MOD_TIME,
  LandPageQualityApiType.JSON_PROPERTY_STATUS,
  LandPageQualityApiType.JSON_PROPERTY_ISSUE_TYPES,
  LandPageQualityApiType.JSON_PROPERTY_LAND_PAGE_URL,
  LandPageQualityApiType.JSON_PROPERTY_KEYWORD,
  LandPageQualityApiType.JSON_PROPERTY_KEYWORD_COUNT,
  LandPageQualityApiType.JSON_PROPERTY_CAMPAIGN_COUNT,
  LandPageQualityApiType.JSON_PROPERTY_ADGROUP_COUNT,
  LandPageQualityApiType.JSON_PROPERTY_CREATIVE_TITLE,
  LandPageQualityApiType.JSON_PROPERTY_CREATIVE_COUNT,
  LandPageQualityApiType.JSON_PROPERTY_CONTENT_SIGN,
  LandPageQualityApiType.JSON_PROPERTY_DESCRIPTION1,
  LandPageQualityApiType.JSON_PROPERTY_DESCRIPTION2,
  LandPageQualityApiType.JSON_PROPERTY_PC_DESTINATION_URL,
  LandPageQualityApiType.JSON_PROPERTY_PC_DISPLAY_URL,
  LandPageQualityApiType.JSON_PROPERTY_MOBILE_DISPLAY_URL,
  LandPageQualityApiType.JSON_PROPERTY_MOBILE_DESTINATION_URL
})
@JsonTypeName("LandPageQualityApiType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LandPageQualityApiType {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_KEYWORD_ID = "keywordId";
  private Long keywordId;

  public static final String JSON_PROPERTY_CREATIVE_ID = "creativeId";
  private Long creativeId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_ADGROUP_NAME = "adgroupName";
  private String adgroupName;

  public static final String JSON_PROPERTY_IMPRESSION_INC_MIN = "impressionIncMin";
  private Long impressionIncMin;

  public static final String JSON_PROPERTY_IMPRESSION_INC_MAX = "impressionIncMax";
  private Long impressionIncMax;

  public static final String JSON_PROPERTY_IMPRESSION = "impression";
  private Double impression;

  public static final String JSON_PROPERTY_CLICK = "click";
  private Double click;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_BUSINESS_POINT_ID = "businessPointId";
  private Long businessPointId;

  public static final String JSON_PROPERTY_AD_TYPE = "adType";
  private Integer adType;

  public static final String JSON_PROPERTY_MARKETING_TARGET_ID = "marketingTargetId";
  private Integer marketingTargetId;

  public static final String JSON_PROPERTY_MOD_TIME = "modTime";
  private String modTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_ISSUE_TYPES = "issueTypes";
  private List<String> issueTypes = null;

  public static final String JSON_PROPERTY_LAND_PAGE_URL = "landPageUrl";
  private String landPageUrl;

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private String keyword;

  public static final String JSON_PROPERTY_KEYWORD_COUNT = "keywordCount";
  private Integer keywordCount;

  public static final String JSON_PROPERTY_CAMPAIGN_COUNT = "campaignCount";
  private Integer campaignCount;

  public static final String JSON_PROPERTY_ADGROUP_COUNT = "adgroupCount";
  private Integer adgroupCount;

  public static final String JSON_PROPERTY_CREATIVE_TITLE = "creativeTitle";
  private String creativeTitle;

  public static final String JSON_PROPERTY_CREATIVE_COUNT = "creativeCount";
  private Integer creativeCount;

  public static final String JSON_PROPERTY_CONTENT_SIGN = "contentSign";
  private String contentSign;

  public static final String JSON_PROPERTY_DESCRIPTION1 = "description1";
  private String description1;

  public static final String JSON_PROPERTY_DESCRIPTION2 = "description2";
  private String description2;

  public static final String JSON_PROPERTY_PC_DESTINATION_URL = "pcDestinationUrl";
  private String pcDestinationUrl;

  public static final String JSON_PROPERTY_PC_DISPLAY_URL = "pcDisplayUrl";
  private String pcDisplayUrl;

  public static final String JSON_PROPERTY_MOBILE_DISPLAY_URL = "mobileDisplayUrl";
  private String mobileDisplayUrl;

  public static final String JSON_PROPERTY_MOBILE_DESTINATION_URL = "mobileDestinationUrl";
  private String mobileDestinationUrl;

  public LandPageQualityApiType() { 
  }

  public LandPageQualityApiType id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public LandPageQualityApiType keywordId(Long keywordId) {
    
    this.keywordId = keywordId;
    return this;
  }

   /**
   * Get keywordId
   * @return keywordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getKeywordId() {
    return keywordId;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordId(Long keywordId) {
    this.keywordId = keywordId;
  }


  public LandPageQualityApiType creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * Get creativeId
   * @return creativeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreativeId() {
    return creativeId;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public LandPageQualityApiType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public LandPageQualityApiType campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public LandPageQualityApiType adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public LandPageQualityApiType adgroupName(String adgroupName) {
    
    this.adgroupName = adgroupName;
    return this;
  }

   /**
   * Get adgroupName
   * @return adgroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdgroupName() {
    return adgroupName;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }


  public LandPageQualityApiType impressionIncMin(Long impressionIncMin) {
    
    this.impressionIncMin = impressionIncMin;
    return this;
  }

   /**
   * Get impressionIncMin
   * @return impressionIncMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPRESSION_INC_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImpressionIncMin() {
    return impressionIncMin;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION_INC_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpressionIncMin(Long impressionIncMin) {
    this.impressionIncMin = impressionIncMin;
  }


  public LandPageQualityApiType impressionIncMax(Long impressionIncMax) {
    
    this.impressionIncMax = impressionIncMax;
    return this;
  }

   /**
   * Get impressionIncMax
   * @return impressionIncMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPRESSION_INC_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImpressionIncMax() {
    return impressionIncMax;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION_INC_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpressionIncMax(Long impressionIncMax) {
    this.impressionIncMax = impressionIncMax;
  }


  public LandPageQualityApiType impression(Double impression) {
    
    this.impression = impression;
    return this;
  }

   /**
   * Get impression
   * @return impression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImpression() {
    return impression;
  }


  @JsonProperty(JSON_PROPERTY_IMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpression(Double impression) {
    this.impression = impression;
  }


  public LandPageQualityApiType click(Double click) {
    
    this.click = click;
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClick(Double click) {
    this.click = click;
  }


  public LandPageQualityApiType cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(Double cost) {
    this.cost = cost;
  }


  public LandPageQualityApiType businessPointId(Long businessPointId) {
    
    this.businessPointId = businessPointId;
    return this;
  }

   /**
   * Get businessPointId
   * @return businessPointId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBusinessPointId() {
    return businessPointId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessPointId(Long businessPointId) {
    this.businessPointId = businessPointId;
  }


  public LandPageQualityApiType adType(Integer adType) {
    
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


  public LandPageQualityApiType marketingTargetId(Integer marketingTargetId) {
    
    this.marketingTargetId = marketingTargetId;
    return this;
  }

   /**
   * Get marketingTargetId
   * @return marketingTargetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKETING_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMarketingTargetId() {
    return marketingTargetId;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingTargetId(Integer marketingTargetId) {
    this.marketingTargetId = marketingTargetId;
  }


  public LandPageQualityApiType modTime(String modTime) {
    
    this.modTime = modTime;
    return this;
  }

   /**
   * Get modTime
   * @return modTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModTime() {
    return modTime;
  }


  @JsonProperty(JSON_PROPERTY_MOD_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModTime(String modTime) {
    this.modTime = modTime;
  }


  public LandPageQualityApiType status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public LandPageQualityApiType issueTypes(List<String> issueTypes) {
    
    this.issueTypes = issueTypes;
    return this;
  }

  public LandPageQualityApiType addIssueTypesItem(String issueTypesItem) {
    if (this.issueTypes == null) {
      this.issueTypes = new ArrayList<>();
    }
    this.issueTypes.add(issueTypesItem);
    return this;
  }

   /**
   * Get issueTypes
   * @return issueTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIssueTypes() {
    return issueTypes;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueTypes(List<String> issueTypes) {
    this.issueTypes = issueTypes;
  }


  public LandPageQualityApiType landPageUrl(String landPageUrl) {
    
    this.landPageUrl = landPageUrl;
    return this;
  }

   /**
   * Get landPageUrl
   * @return landPageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAND_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLandPageUrl() {
    return landPageUrl;
  }


  @JsonProperty(JSON_PROPERTY_LAND_PAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandPageUrl(String landPageUrl) {
    this.landPageUrl = landPageUrl;
  }


  public LandPageQualityApiType keyword(String keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * Get keyword
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyword() {
    return keyword;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public LandPageQualityApiType keywordCount(Integer keywordCount) {
    
    this.keywordCount = keywordCount;
    return this;
  }

   /**
   * Get keywordCount
   * @return keywordCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKeywordCount() {
    return keywordCount;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordCount(Integer keywordCount) {
    this.keywordCount = keywordCount;
  }


  public LandPageQualityApiType campaignCount(Integer campaignCount) {
    
    this.campaignCount = campaignCount;
    return this;
  }

   /**
   * Get campaignCount
   * @return campaignCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCampaignCount() {
    return campaignCount;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignCount(Integer campaignCount) {
    this.campaignCount = campaignCount;
  }


  public LandPageQualityApiType adgroupCount(Integer adgroupCount) {
    
    this.adgroupCount = adgroupCount;
    return this;
  }

   /**
   * Get adgroupCount
   * @return adgroupCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdgroupCount() {
    return adgroupCount;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupCount(Integer adgroupCount) {
    this.adgroupCount = adgroupCount;
  }


  public LandPageQualityApiType creativeTitle(String creativeTitle) {
    
    this.creativeTitle = creativeTitle;
    return this;
  }

   /**
   * Get creativeTitle
   * @return creativeTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreativeTitle() {
    return creativeTitle;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeTitle(String creativeTitle) {
    this.creativeTitle = creativeTitle;
  }


  public LandPageQualityApiType creativeCount(Integer creativeCount) {
    
    this.creativeCount = creativeCount;
    return this;
  }

   /**
   * Get creativeCount
   * @return creativeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreativeCount() {
    return creativeCount;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeCount(Integer creativeCount) {
    this.creativeCount = creativeCount;
  }


  public LandPageQualityApiType contentSign(String contentSign) {
    
    this.contentSign = contentSign;
    return this;
  }

   /**
   * Get contentSign
   * @return contentSign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentSign() {
    return contentSign;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_SIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentSign(String contentSign) {
    this.contentSign = contentSign;
  }


  public LandPageQualityApiType description1(String description1) {
    
    this.description1 = description1;
    return this;
  }

   /**
   * Get description1
   * @return description1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription1() {
    return description1;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription1(String description1) {
    this.description1 = description1;
  }


  public LandPageQualityApiType description2(String description2) {
    
    this.description2 = description2;
    return this;
  }

   /**
   * Get description2
   * @return description2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription2() {
    return description2;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription2(String description2) {
    this.description2 = description2;
  }


  public LandPageQualityApiType pcDestinationUrl(String pcDestinationUrl) {
    
    this.pcDestinationUrl = pcDestinationUrl;
    return this;
  }

   /**
   * Get pcDestinationUrl
   * @return pcDestinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PC_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPcDestinationUrl() {
    return pcDestinationUrl;
  }


  @JsonProperty(JSON_PROPERTY_PC_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPcDestinationUrl(String pcDestinationUrl) {
    this.pcDestinationUrl = pcDestinationUrl;
  }


  public LandPageQualityApiType pcDisplayUrl(String pcDisplayUrl) {
    
    this.pcDisplayUrl = pcDisplayUrl;
    return this;
  }

   /**
   * Get pcDisplayUrl
   * @return pcDisplayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PC_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPcDisplayUrl() {
    return pcDisplayUrl;
  }


  @JsonProperty(JSON_PROPERTY_PC_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPcDisplayUrl(String pcDisplayUrl) {
    this.pcDisplayUrl = pcDisplayUrl;
  }


  public LandPageQualityApiType mobileDisplayUrl(String mobileDisplayUrl) {
    
    this.mobileDisplayUrl = mobileDisplayUrl;
    return this;
  }

   /**
   * Get mobileDisplayUrl
   * @return mobileDisplayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileDisplayUrl() {
    return mobileDisplayUrl;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_DISPLAY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileDisplayUrl(String mobileDisplayUrl) {
    this.mobileDisplayUrl = mobileDisplayUrl;
  }


  public LandPageQualityApiType mobileDestinationUrl(String mobileDestinationUrl) {
    
    this.mobileDestinationUrl = mobileDestinationUrl;
    return this;
  }

   /**
   * Get mobileDestinationUrl
   * @return mobileDestinationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileDestinationUrl() {
    return mobileDestinationUrl;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_DESTINATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileDestinationUrl(String mobileDestinationUrl) {
    this.mobileDestinationUrl = mobileDestinationUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LandPageQualityApiType landPageQualityApiType = (LandPageQualityApiType) o;
    return Objects.equals(this.id, landPageQualityApiType.id) &&
        Objects.equals(this.keywordId, landPageQualityApiType.keywordId) &&
        Objects.equals(this.creativeId, landPageQualityApiType.creativeId) &&
        Objects.equals(this.campaignId, landPageQualityApiType.campaignId) &&
        Objects.equals(this.campaignName, landPageQualityApiType.campaignName) &&
        Objects.equals(this.adgroupId, landPageQualityApiType.adgroupId) &&
        Objects.equals(this.adgroupName, landPageQualityApiType.adgroupName) &&
        Objects.equals(this.impressionIncMin, landPageQualityApiType.impressionIncMin) &&
        Objects.equals(this.impressionIncMax, landPageQualityApiType.impressionIncMax) &&
        Objects.equals(this.impression, landPageQualityApiType.impression) &&
        Objects.equals(this.click, landPageQualityApiType.click) &&
        Objects.equals(this.cost, landPageQualityApiType.cost) &&
        Objects.equals(this.businessPointId, landPageQualityApiType.businessPointId) &&
        Objects.equals(this.adType, landPageQualityApiType.adType) &&
        Objects.equals(this.marketingTargetId, landPageQualityApiType.marketingTargetId) &&
        Objects.equals(this.modTime, landPageQualityApiType.modTime) &&
        Objects.equals(this.status, landPageQualityApiType.status) &&
        Objects.equals(this.issueTypes, landPageQualityApiType.issueTypes) &&
        Objects.equals(this.landPageUrl, landPageQualityApiType.landPageUrl) &&
        Objects.equals(this.keyword, landPageQualityApiType.keyword) &&
        Objects.equals(this.keywordCount, landPageQualityApiType.keywordCount) &&
        Objects.equals(this.campaignCount, landPageQualityApiType.campaignCount) &&
        Objects.equals(this.adgroupCount, landPageQualityApiType.adgroupCount) &&
        Objects.equals(this.creativeTitle, landPageQualityApiType.creativeTitle) &&
        Objects.equals(this.creativeCount, landPageQualityApiType.creativeCount) &&
        Objects.equals(this.contentSign, landPageQualityApiType.contentSign) &&
        Objects.equals(this.description1, landPageQualityApiType.description1) &&
        Objects.equals(this.description2, landPageQualityApiType.description2) &&
        Objects.equals(this.pcDestinationUrl, landPageQualityApiType.pcDestinationUrl) &&
        Objects.equals(this.pcDisplayUrl, landPageQualityApiType.pcDisplayUrl) &&
        Objects.equals(this.mobileDisplayUrl, landPageQualityApiType.mobileDisplayUrl) &&
        Objects.equals(this.mobileDestinationUrl, landPageQualityApiType.mobileDestinationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keywordId, creativeId, campaignId, campaignName, adgroupId, adgroupName, impressionIncMin, impressionIncMax, impression, click, cost, businessPointId, adType, marketingTargetId, modTime, status, issueTypes, landPageUrl, keyword, keywordCount, campaignCount, adgroupCount, creativeTitle, creativeCount, contentSign, description1, description2, pcDestinationUrl, pcDisplayUrl, mobileDisplayUrl, mobileDestinationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandPageQualityApiType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    impressionIncMin: ").append(toIndentedString(impressionIncMin)).append("\n");
    sb.append("    impressionIncMax: ").append(toIndentedString(impressionIncMax)).append("\n");
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    businessPointId: ").append(toIndentedString(businessPointId)).append("\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    marketingTargetId: ").append(toIndentedString(marketingTargetId)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    landPageUrl: ").append(toIndentedString(landPageUrl)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    keywordCount: ").append(toIndentedString(keywordCount)).append("\n");
    sb.append("    campaignCount: ").append(toIndentedString(campaignCount)).append("\n");
    sb.append("    adgroupCount: ").append(toIndentedString(adgroupCount)).append("\n");
    sb.append("    creativeTitle: ").append(toIndentedString(creativeTitle)).append("\n");
    sb.append("    creativeCount: ").append(toIndentedString(creativeCount)).append("\n");
    sb.append("    contentSign: ").append(toIndentedString(contentSign)).append("\n");
    sb.append("    description1: ").append(toIndentedString(description1)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    pcDestinationUrl: ").append(toIndentedString(pcDestinationUrl)).append("\n");
    sb.append("    pcDisplayUrl: ").append(toIndentedString(pcDisplayUrl)).append("\n");
    sb.append("    mobileDisplayUrl: ").append(toIndentedString(mobileDisplayUrl)).append("\n");
    sb.append("    mobileDestinationUrl: ").append(toIndentedString(mobileDestinationUrl)).append("\n");
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

