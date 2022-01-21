/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpaadgroupfeed.model;

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
 * DpaAudienceType
 */
@JsonPropertyOrder({
  DpaAudienceType.JSON_PROPERTY_PA_CROWD,
  DpaAudienceType.JSON_PROPERTY_PREMIUM,
  DpaAudienceType.JSON_PROPERTY_PA_KEYWORDS,
  DpaAudienceType.JSON_PROPERTY_INTERESTS,
  DpaAudienceType.JSON_PROPERTY_AGE,
  DpaAudienceType.JSON_PROPERTY_SEX,
  DpaAudienceType.JSON_PROPERTY_EDUCATION,
  DpaAudienceType.JSON_PROPERTY_DEVICE,
  DpaAudienceType.JSON_PROPERTY_NET,
  DpaAudienceType.JSON_PROPERTY_REGION,
  DpaAudienceType.JSON_PROPERTY_MEDIA_CATEGORIES_BIND_TYPE,
  DpaAudienceType.JSON_PROPERTY_MEDIA_CATEGORIES,
  DpaAudienceType.JSON_PROPERTY_MEDIAIDS_BIND_TYPE,
  DpaAudienceType.JSON_PROPERTY_MEDIAIDS,
  DpaAudienceType.JSON_PROPERTY_MEDIA_PACKAGE,
  DpaAudienceType.JSON_PROPERTY_AUTO_REGION,
  DpaAudienceType.JSON_PROPERTY_AUTO_EXPANSION,
  DpaAudienceType.JSON_PROPERTY_NEW_INTERESTS,
  DpaAudienceType.JSON_PROPERTY_CUSTOM_MEDIA_PACKAGE,
  DpaAudienceType.JSON_PROPERTY_DEEP_LINK,
  DpaAudienceType.JSON_PROPERTY_EXCLUDE_TRANS,
  DpaAudienceType.JSON_PROPERTY_CUSTOM_AGE
})
@JsonTypeName("DpaAudienceType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DpaAudienceType {
  public static final String JSON_PROPERTY_PA_CROWD = "paCrowd";
  private String paCrowd;

  public static final String JSON_PROPERTY_PREMIUM = "premium";
  private String premium;

  public static final String JSON_PROPERTY_PA_KEYWORDS = "paKeywords";
  private String paKeywords;

  public static final String JSON_PROPERTY_INTERESTS = "interests";
  private String interests;

  public static final String JSON_PROPERTY_AGE = "age";
  private String age;

  public static final String JSON_PROPERTY_SEX = "sex";
  private String sex;

  public static final String JSON_PROPERTY_EDUCATION = "education";
  private String education;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private String device;

  public static final String JSON_PROPERTY_NET = "net";
  private String net;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_MEDIA_CATEGORIES_BIND_TYPE = "mediaCategoriesBindType";
  private String mediaCategoriesBindType;

  public static final String JSON_PROPERTY_MEDIA_CATEGORIES = "mediaCategories";
  private String mediaCategories;

  public static final String JSON_PROPERTY_MEDIAIDS_BIND_TYPE = "mediaidsBindType";
  private String mediaidsBindType;

  public static final String JSON_PROPERTY_MEDIAIDS = "mediaids";
  private String mediaids;

  public static final String JSON_PROPERTY_MEDIA_PACKAGE = "mediaPackage";
  private String mediaPackage;

  public static final String JSON_PROPERTY_AUTO_REGION = "autoRegion";
  private String autoRegion;

  public static final String JSON_PROPERTY_AUTO_EXPANSION = "autoExpansion";
  private String autoExpansion;

  public static final String JSON_PROPERTY_NEW_INTERESTS = "newInterests";
  private String newInterests;

  public static final String JSON_PROPERTY_CUSTOM_MEDIA_PACKAGE = "customMediaPackage";
  private String customMediaPackage;

  public static final String JSON_PROPERTY_DEEP_LINK = "deepLink";
  private Boolean deepLink;

  public static final String JSON_PROPERTY_EXCLUDE_TRANS = "excludeTrans";
  private String excludeTrans;

  public static final String JSON_PROPERTY_CUSTOM_AGE = "customAge";
  private String customAge;

  public DpaAudienceType() { 
  }

  public DpaAudienceType paCrowd(String paCrowd) {
    
    this.paCrowd = paCrowd;
    return this;
  }

   /**
   * Get paCrowd
   * @return paCrowd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PA_CROWD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaCrowd() {
    return paCrowd;
  }


  @JsonProperty(JSON_PROPERTY_PA_CROWD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaCrowd(String paCrowd) {
    this.paCrowd = paCrowd;
  }


  public DpaAudienceType premium(String premium) {
    
    this.premium = premium;
    return this;
  }

   /**
   * Get premium
   * @return premium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREMIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPremium() {
    return premium;
  }


  @JsonProperty(JSON_PROPERTY_PREMIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPremium(String premium) {
    this.premium = premium;
  }


  public DpaAudienceType paKeywords(String paKeywords) {
    
    this.paKeywords = paKeywords;
    return this;
  }

   /**
   * Get paKeywords
   * @return paKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PA_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaKeywords() {
    return paKeywords;
  }


  @JsonProperty(JSON_PROPERTY_PA_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaKeywords(String paKeywords) {
    this.paKeywords = paKeywords;
  }


  public DpaAudienceType interests(String interests) {
    
    this.interests = interests;
    return this;
  }

   /**
   * Get interests
   * @return interests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterests() {
    return interests;
  }


  @JsonProperty(JSON_PROPERTY_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterests(String interests) {
    this.interests = interests;
  }


  public DpaAudienceType age(String age) {
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAge() {
    return age;
  }


  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAge(String age) {
    this.age = age;
  }


  public DpaAudienceType sex(String sex) {
    
    this.sex = sex;
    return this;
  }

   /**
   * Get sex
   * @return sex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSex() {
    return sex;
  }


  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSex(String sex) {
    this.sex = sex;
  }


  public DpaAudienceType education(String education) {
    
    this.education = education;
    return this;
  }

   /**
   * Get education
   * @return education
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EDUCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEducation() {
    return education;
  }


  @JsonProperty(JSON_PROPERTY_EDUCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEducation(String education) {
    this.education = education;
  }


  public DpaAudienceType device(String device) {
    
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

  public String getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(String device) {
    this.device = device;
  }


  public DpaAudienceType net(String net) {
    
    this.net = net;
    return this;
  }

   /**
   * Get net
   * @return net
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNet() {
    return net;
  }


  @JsonProperty(JSON_PROPERTY_NET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNet(String net) {
    this.net = net;
  }


  public DpaAudienceType region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public DpaAudienceType mediaCategoriesBindType(String mediaCategoriesBindType) {
    
    this.mediaCategoriesBindType = mediaCategoriesBindType;
    return this;
  }

   /**
   * Get mediaCategoriesBindType
   * @return mediaCategoriesBindType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_CATEGORIES_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaCategoriesBindType() {
    return mediaCategoriesBindType;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_CATEGORIES_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaCategoriesBindType(String mediaCategoriesBindType) {
    this.mediaCategoriesBindType = mediaCategoriesBindType;
  }


  public DpaAudienceType mediaCategories(String mediaCategories) {
    
    this.mediaCategories = mediaCategories;
    return this;
  }

   /**
   * Get mediaCategories
   * @return mediaCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaCategories() {
    return mediaCategories;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaCategories(String mediaCategories) {
    this.mediaCategories = mediaCategories;
  }


  public DpaAudienceType mediaidsBindType(String mediaidsBindType) {
    
    this.mediaidsBindType = mediaidsBindType;
    return this;
  }

   /**
   * Get mediaidsBindType
   * @return mediaidsBindType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIAIDS_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaidsBindType() {
    return mediaidsBindType;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAIDS_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaidsBindType(String mediaidsBindType) {
    this.mediaidsBindType = mediaidsBindType;
  }


  public DpaAudienceType mediaids(String mediaids) {
    
    this.mediaids = mediaids;
    return this;
  }

   /**
   * Get mediaids
   * @return mediaids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIAIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaids() {
    return mediaids;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaids(String mediaids) {
    this.mediaids = mediaids;
  }


  public DpaAudienceType mediaPackage(String mediaPackage) {
    
    this.mediaPackage = mediaPackage;
    return this;
  }

   /**
   * Get mediaPackage
   * @return mediaPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaPackage() {
    return mediaPackage;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaPackage(String mediaPackage) {
    this.mediaPackage = mediaPackage;
  }


  public DpaAudienceType autoRegion(String autoRegion) {
    
    this.autoRegion = autoRegion;
    return this;
  }

   /**
   * Get autoRegion
   * @return autoRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAutoRegion() {
    return autoRegion;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoRegion(String autoRegion) {
    this.autoRegion = autoRegion;
  }


  public DpaAudienceType autoExpansion(String autoExpansion) {
    
    this.autoExpansion = autoExpansion;
    return this;
  }

   /**
   * Get autoExpansion
   * @return autoExpansion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_EXPANSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAutoExpansion() {
    return autoExpansion;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_EXPANSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoExpansion(String autoExpansion) {
    this.autoExpansion = autoExpansion;
  }


  public DpaAudienceType newInterests(String newInterests) {
    
    this.newInterests = newInterests;
    return this;
  }

   /**
   * Get newInterests
   * @return newInterests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewInterests() {
    return newInterests;
  }


  @JsonProperty(JSON_PROPERTY_NEW_INTERESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewInterests(String newInterests) {
    this.newInterests = newInterests;
  }


  public DpaAudienceType customMediaPackage(String customMediaPackage) {
    
    this.customMediaPackage = customMediaPackage;
    return this;
  }

   /**
   * Get customMediaPackage
   * @return customMediaPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_MEDIA_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomMediaPackage() {
    return customMediaPackage;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_MEDIA_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomMediaPackage(String customMediaPackage) {
    this.customMediaPackage = customMediaPackage;
  }


  public DpaAudienceType deepLink(Boolean deepLink) {
    
    this.deepLink = deepLink;
    return this;
  }

   /**
   * Get deepLink
   * @return deepLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEEP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeepLink() {
    return deepLink;
  }


  @JsonProperty(JSON_PROPERTY_DEEP_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeepLink(Boolean deepLink) {
    this.deepLink = deepLink;
  }


  public DpaAudienceType excludeTrans(String excludeTrans) {
    
    this.excludeTrans = excludeTrans;
    return this;
  }

   /**
   * Get excludeTrans
   * @return excludeTrans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_TRANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExcludeTrans() {
    return excludeTrans;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_TRANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeTrans(String excludeTrans) {
    this.excludeTrans = excludeTrans;
  }


  public DpaAudienceType customAge(String customAge) {
    
    this.customAge = customAge;
    return this;
  }

   /**
   * Get customAge
   * @return customAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomAge() {
    return customAge;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomAge(String customAge) {
    this.customAge = customAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaAudienceType dpaAudienceType = (DpaAudienceType) o;
    return Objects.equals(this.paCrowd, dpaAudienceType.paCrowd) &&
        Objects.equals(this.premium, dpaAudienceType.premium) &&
        Objects.equals(this.paKeywords, dpaAudienceType.paKeywords) &&
        Objects.equals(this.interests, dpaAudienceType.interests) &&
        Objects.equals(this.age, dpaAudienceType.age) &&
        Objects.equals(this.sex, dpaAudienceType.sex) &&
        Objects.equals(this.education, dpaAudienceType.education) &&
        Objects.equals(this.device, dpaAudienceType.device) &&
        Objects.equals(this.net, dpaAudienceType.net) &&
        Objects.equals(this.region, dpaAudienceType.region) &&
        Objects.equals(this.mediaCategoriesBindType, dpaAudienceType.mediaCategoriesBindType) &&
        Objects.equals(this.mediaCategories, dpaAudienceType.mediaCategories) &&
        Objects.equals(this.mediaidsBindType, dpaAudienceType.mediaidsBindType) &&
        Objects.equals(this.mediaids, dpaAudienceType.mediaids) &&
        Objects.equals(this.mediaPackage, dpaAudienceType.mediaPackage) &&
        Objects.equals(this.autoRegion, dpaAudienceType.autoRegion) &&
        Objects.equals(this.autoExpansion, dpaAudienceType.autoExpansion) &&
        Objects.equals(this.newInterests, dpaAudienceType.newInterests) &&
        Objects.equals(this.customMediaPackage, dpaAudienceType.customMediaPackage) &&
        Objects.equals(this.deepLink, dpaAudienceType.deepLink) &&
        Objects.equals(this.excludeTrans, dpaAudienceType.excludeTrans) &&
        Objects.equals(this.customAge, dpaAudienceType.customAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paCrowd, premium, paKeywords, interests, age, sex, education, device, net, region, mediaCategoriesBindType, mediaCategories, mediaidsBindType, mediaids, mediaPackage, autoRegion, autoExpansion, newInterests, customMediaPackage, deepLink, excludeTrans, customAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaAudienceType {\n");
    sb.append("    paCrowd: ").append(toIndentedString(paCrowd)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    paKeywords: ").append(toIndentedString(paKeywords)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    mediaCategoriesBindType: ").append(toIndentedString(mediaCategoriesBindType)).append("\n");
    sb.append("    mediaCategories: ").append(toIndentedString(mediaCategories)).append("\n");
    sb.append("    mediaidsBindType: ").append(toIndentedString(mediaidsBindType)).append("\n");
    sb.append("    mediaids: ").append(toIndentedString(mediaids)).append("\n");
    sb.append("    mediaPackage: ").append(toIndentedString(mediaPackage)).append("\n");
    sb.append("    autoRegion: ").append(toIndentedString(autoRegion)).append("\n");
    sb.append("    autoExpansion: ").append(toIndentedString(autoExpansion)).append("\n");
    sb.append("    newInterests: ").append(toIndentedString(newInterests)).append("\n");
    sb.append("    customMediaPackage: ").append(toIndentedString(customMediaPackage)).append("\n");
    sb.append("    deepLink: ").append(toIndentedString(deepLink)).append("\n");
    sb.append("    excludeTrans: ").append(toIndentedString(excludeTrans)).append("\n");
    sb.append("    customAge: ").append(toIndentedString(customAge)).append("\n");
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

