/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.livereport.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * KeywordLiveDataResultType
 */
@JsonPropertyOrder({
  KeywordLiveDataResultType.JSON_PROPERTY_CAMPAIGN_ID,
  KeywordLiveDataResultType.JSON_PROPERTY_CAMPAIGN_NAME,
  KeywordLiveDataResultType.JSON_PROPERTY_ADGROUP_ID,
  KeywordLiveDataResultType.JSON_PROPERTY_ADGROUP_NAME,
  KeywordLiveDataResultType.JSON_PROPERTY_KEYWORD_ID,
  KeywordLiveDataResultType.JSON_PROPERTY_KEYWORD_NAME,
  KeywordLiveDataResultType.JSON_PROPERTY_REGION_ID,
  KeywordLiveDataResultType.JSON_PROPERTY_DEVICE,
  KeywordLiveDataResultType.JSON_PROPERTY_MINUTE,
  KeywordLiveDataResultType.JSON_PROPERTY_LEFT_RANK,
  KeywordLiveDataResultType.JSON_PROPERTY_RIGHT_RANK,
  KeywordLiveDataResultType.JSON_PROPERTY_TOP_RANK,
  KeywordLiveDataResultType.JSON_PROPERTY_BOTTOM_RANK,
  KeywordLiveDataResultType.JSON_PROPERTY_LEFT_SHOWS,
  KeywordLiveDataResultType.JSON_PROPERTY_RIGHT_SHOWS,
  KeywordLiveDataResultType.JSON_PROPERTY_TOP_SHOWS,
  KeywordLiveDataResultType.JSON_PROPERTY_BOTTOM_SHOWS,
  KeywordLiveDataResultType.JSON_PROPERTY_CLICK,
  KeywordLiveDataResultType.JSON_PROPERTY_COST,
  KeywordLiveDataResultType.JSON_PROPERTY_CPC,
  KeywordLiveDataResultType.JSON_PROPERTY_POSITION
})
@JsonTypeName("KeywordLiveDataResultType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordLiveDataResultType {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_ADGROUP_NAME = "adgroupName";
  private String adgroupName;

  public static final String JSON_PROPERTY_KEYWORD_ID = "keywordId";
  private Long keywordId;

  public static final String JSON_PROPERTY_KEYWORD_NAME = "keywordName";
  private String keywordName;

  public static final String JSON_PROPERTY_REGION_ID = "regionId";
  private Integer regionId;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private Integer device;

  public static final String JSON_PROPERTY_MINUTE = "minute";
  private String minute;

  public static final String JSON_PROPERTY_LEFT_RANK = "leftRank";
  private Double leftRank;

  public static final String JSON_PROPERTY_RIGHT_RANK = "rightRank";
  private Double rightRank;

  public static final String JSON_PROPERTY_TOP_RANK = "topRank";
  private Double topRank;

  public static final String JSON_PROPERTY_BOTTOM_RANK = "bottomRank";
  private Double bottomRank;

  public static final String JSON_PROPERTY_LEFT_SHOWS = "leftShows";
  private Integer leftShows;

  public static final String JSON_PROPERTY_RIGHT_SHOWS = "rightShows";
  private Integer rightShows;

  public static final String JSON_PROPERTY_TOP_SHOWS = "topShows";
  private Integer topShows;

  public static final String JSON_PROPERTY_BOTTOM_SHOWS = "bottomShows";
  private Integer bottomShows;

  public static final String JSON_PROPERTY_CLICK = "click";
  private Long click;

  public static final String JSON_PROPERTY_COST = "cost";
  private Double cost;

  public static final String JSON_PROPERTY_CPC = "cpc";
  private Double cpc;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Double position;

  public KeywordLiveDataResultType() { 
  }

  public KeywordLiveDataResultType campaignId(Long campaignId) {
    
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


  public KeywordLiveDataResultType campaignName(String campaignName) {
    
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


  public KeywordLiveDataResultType adgroupId(Long adgroupId) {
    
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


  public KeywordLiveDataResultType adgroupName(String adgroupName) {
    
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


  public KeywordLiveDataResultType keywordId(Long keywordId) {
    
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


  public KeywordLiveDataResultType keywordName(String keywordName) {
    
    this.keywordName = keywordName;
    return this;
  }

   /**
   * Get keywordName
   * @return keywordName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeywordName() {
    return keywordName;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordName(String keywordName) {
    this.keywordName = keywordName;
  }


  public KeywordLiveDataResultType regionId(Integer regionId) {
    
    this.regionId = regionId;
    return this;
  }

   /**
   * Get regionId
   * @return regionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRegionId() {
    return regionId;
  }


  @JsonProperty(JSON_PROPERTY_REGION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  public KeywordLiveDataResultType device(Integer device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(Integer device) {
    this.device = device;
  }


  public KeywordLiveDataResultType minute(String minute) {
    
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinute() {
    return minute;
  }


  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinute(String minute) {
    this.minute = minute;
  }


  public KeywordLiveDataResultType leftRank(Double leftRank) {
    
    this.leftRank = leftRank;
    return this;
  }

   /**
   * Get leftRank
   * @return leftRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEFT_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLeftRank() {
    return leftRank;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftRank(Double leftRank) {
    this.leftRank = leftRank;
  }


  public KeywordLiveDataResultType rightRank(Double rightRank) {
    
    this.rightRank = rightRank;
    return this;
  }

   /**
   * Get rightRank
   * @return rightRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RIGHT_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getRightRank() {
    return rightRank;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightRank(Double rightRank) {
    this.rightRank = rightRank;
  }


  public KeywordLiveDataResultType topRank(Double topRank) {
    
    this.topRank = topRank;
    return this;
  }

   /**
   * Get topRank
   * @return topRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTopRank() {
    return topRank;
  }


  @JsonProperty(JSON_PROPERTY_TOP_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopRank(Double topRank) {
    this.topRank = topRank;
  }


  public KeywordLiveDataResultType bottomRank(Double bottomRank) {
    
    this.bottomRank = bottomRank;
    return this;
  }

   /**
   * Get bottomRank
   * @return bottomRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOTTOM_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBottomRank() {
    return bottomRank;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomRank(Double bottomRank) {
    this.bottomRank = bottomRank;
  }


  public KeywordLiveDataResultType leftShows(Integer leftShows) {
    
    this.leftShows = leftShows;
    return this;
  }

   /**
   * Get leftShows
   * @return leftShows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEFT_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLeftShows() {
    return leftShows;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftShows(Integer leftShows) {
    this.leftShows = leftShows;
  }


  public KeywordLiveDataResultType rightShows(Integer rightShows) {
    
    this.rightShows = rightShows;
    return this;
  }

   /**
   * Get rightShows
   * @return rightShows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RIGHT_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRightShows() {
    return rightShows;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightShows(Integer rightShows) {
    this.rightShows = rightShows;
  }


  public KeywordLiveDataResultType topShows(Integer topShows) {
    
    this.topShows = topShows;
    return this;
  }

   /**
   * Get topShows
   * @return topShows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOP_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopShows() {
    return topShows;
  }


  @JsonProperty(JSON_PROPERTY_TOP_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopShows(Integer topShows) {
    this.topShows = topShows;
  }


  public KeywordLiveDataResultType bottomShows(Integer bottomShows) {
    
    this.bottomShows = bottomShows;
    return this;
  }

   /**
   * Get bottomShows
   * @return bottomShows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOTTOM_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomShows() {
    return bottomShows;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_SHOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomShows(Integer bottomShows) {
    this.bottomShows = bottomShows;
  }


  public KeywordLiveDataResultType click(Long click) {
    
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

  public Long getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClick(Long click) {
    this.click = click;
  }


  public KeywordLiveDataResultType cost(Double cost) {
    
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


  public KeywordLiveDataResultType cpc(Double cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * Get cpc
   * @return cpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Double cpc) {
    this.cpc = cpc;
  }


  public KeywordLiveDataResultType position(Double position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(Double position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordLiveDataResultType keywordLiveDataResultType = (KeywordLiveDataResultType) o;
    return Objects.equals(this.campaignId, keywordLiveDataResultType.campaignId) &&
        Objects.equals(this.campaignName, keywordLiveDataResultType.campaignName) &&
        Objects.equals(this.adgroupId, keywordLiveDataResultType.adgroupId) &&
        Objects.equals(this.adgroupName, keywordLiveDataResultType.adgroupName) &&
        Objects.equals(this.keywordId, keywordLiveDataResultType.keywordId) &&
        Objects.equals(this.keywordName, keywordLiveDataResultType.keywordName) &&
        Objects.equals(this.regionId, keywordLiveDataResultType.regionId) &&
        Objects.equals(this.device, keywordLiveDataResultType.device) &&
        Objects.equals(this.minute, keywordLiveDataResultType.minute) &&
        Objects.equals(this.leftRank, keywordLiveDataResultType.leftRank) &&
        Objects.equals(this.rightRank, keywordLiveDataResultType.rightRank) &&
        Objects.equals(this.topRank, keywordLiveDataResultType.topRank) &&
        Objects.equals(this.bottomRank, keywordLiveDataResultType.bottomRank) &&
        Objects.equals(this.leftShows, keywordLiveDataResultType.leftShows) &&
        Objects.equals(this.rightShows, keywordLiveDataResultType.rightShows) &&
        Objects.equals(this.topShows, keywordLiveDataResultType.topShows) &&
        Objects.equals(this.bottomShows, keywordLiveDataResultType.bottomShows) &&
        Objects.equals(this.click, keywordLiveDataResultType.click) &&
        Objects.equals(this.cost, keywordLiveDataResultType.cost) &&
        Objects.equals(this.cpc, keywordLiveDataResultType.cpc) &&
        Objects.equals(this.position, keywordLiveDataResultType.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, adgroupId, adgroupName, keywordId, keywordName, regionId, device, minute, leftRank, rightRank, topRank, bottomRank, leftShows, rightShows, topShows, bottomShows, click, cost, cpc, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordLiveDataResultType {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    adgroupName: ").append(toIndentedString(adgroupName)).append("\n");
    sb.append("    keywordId: ").append(toIndentedString(keywordId)).append("\n");
    sb.append("    keywordName: ").append(toIndentedString(keywordName)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    leftRank: ").append(toIndentedString(leftRank)).append("\n");
    sb.append("    rightRank: ").append(toIndentedString(rightRank)).append("\n");
    sb.append("    topRank: ").append(toIndentedString(topRank)).append("\n");
    sb.append("    bottomRank: ").append(toIndentedString(bottomRank)).append("\n");
    sb.append("    leftShows: ").append(toIndentedString(leftShows)).append("\n");
    sb.append("    rightShows: ").append(toIndentedString(rightShows)).append("\n");
    sb.append("    topShows: ").append(toIndentedString(topShows)).append("\n");
    sb.append("    bottomShows: ").append(toIndentedString(bottomShows)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

