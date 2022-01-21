/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpacreativefeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.ExtraPicture;
import com.baidu.dev2.api.sdk.dpacreativefeed.model.Picture;
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
 * Template
 */
@JsonPropertyOrder({
  Template.JSON_PROPERTY_TITLE,
  Template.JSON_PROPERTY_SUBTITLE,
  Template.JSON_PROPERTY_TARGET_URL,
  Template.JSON_PROPERTY_MONITOR_URL,
  Template.JSON_PROPERTY_USER_PORTRAIT,
  Template.JSON_PROPERTY_NA_URL,
  Template.JSON_PROPERTY_BRAND,
  Template.JSON_PROPERTY_PICTURES,
  Template.JSON_PROPERTY_EXTRA_PICTURES,
  Template.JSON_PROPERTY_POSTER,
  Template.JSON_PROPERTY_VIDEO_ID,
  Template.JSON_PROPERTY_DURATION,
  Template.JSON_PROPERTY_VIDEO_URL,
  Template.JSON_PROPERTY_MINI_PROGRAM_SCHEMA,
  Template.JSON_PROPERTY_EXPOSURE_URL,
  Template.JSON_PROPERTY_ULK_SCHEME,
  Template.JSON_PROPERTY_ULK_URL
})
@JsonTypeName("Template")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Template {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_SUBTITLE = "subtitle";
  private String subtitle;

  public static final String JSON_PROPERTY_TARGET_URL = "targetUrl";
  private String targetUrl;

  public static final String JSON_PROPERTY_MONITOR_URL = "monitorUrl";
  private String monitorUrl;

  public static final String JSON_PROPERTY_USER_PORTRAIT = "userPortrait";
  private String userPortrait;

  public static final String JSON_PROPERTY_NA_URL = "naUrl";
  private String naUrl;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_PICTURES = "pictures";
  private List<Picture> pictures = null;

  public static final String JSON_PROPERTY_EXTRA_PICTURES = "extraPictures";
  private List<ExtraPicture> extraPictures = null;

  public static final String JSON_PROPERTY_POSTER = "poster";
  private String poster;

  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private String videoId;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private String duration;

  public static final String JSON_PROPERTY_VIDEO_URL = "videoUrl";
  private String videoUrl;

  public static final String JSON_PROPERTY_MINI_PROGRAM_SCHEMA = "miniProgramSchema";
  private String miniProgramSchema;

  public static final String JSON_PROPERTY_EXPOSURE_URL = "exposureUrl";
  private String exposureUrl;

  public static final String JSON_PROPERTY_ULK_SCHEME = "ulkScheme";
  private String ulkScheme;

  public static final String JSON_PROPERTY_ULK_URL = "ulkUrl";
  private String ulkUrl;

  public Template() { 
  }

  public Template title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public Template subtitle(String subtitle) {
    
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubtitle() {
    return subtitle;
  }


  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public Template targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * Get targetUrl
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetUrl() {
    return targetUrl;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public Template monitorUrl(String monitorUrl) {
    
    this.monitorUrl = monitorUrl;
    return this;
  }

   /**
   * Get monitorUrl
   * @return monitorUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorUrl() {
    return monitorUrl;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitorUrl(String monitorUrl) {
    this.monitorUrl = monitorUrl;
  }


  public Template userPortrait(String userPortrait) {
    
    this.userPortrait = userPortrait;
    return this;
  }

   /**
   * Get userPortrait
   * @return userPortrait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserPortrait() {
    return userPortrait;
  }


  @JsonProperty(JSON_PROPERTY_USER_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserPortrait(String userPortrait) {
    this.userPortrait = userPortrait;
  }


  public Template naUrl(String naUrl) {
    
    this.naUrl = naUrl;
    return this;
  }

   /**
   * Get naUrl
   * @return naUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNaUrl() {
    return naUrl;
  }


  @JsonProperty(JSON_PROPERTY_NA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNaUrl(String naUrl) {
    this.naUrl = naUrl;
  }


  public Template brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public Template pictures(List<Picture> pictures) {
    
    this.pictures = pictures;
    return this;
  }

  public Template addPicturesItem(Picture picturesItem) {
    if (this.pictures == null) {
      this.pictures = new ArrayList<>();
    }
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * Get pictures
   * @return pictures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Picture> getPictures() {
    return pictures;
  }


  @JsonProperty(JSON_PROPERTY_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPictures(List<Picture> pictures) {
    this.pictures = pictures;
  }


  public Template extraPictures(List<ExtraPicture> extraPictures) {
    
    this.extraPictures = extraPictures;
    return this;
  }

  public Template addExtraPicturesItem(ExtraPicture extraPicturesItem) {
    if (this.extraPictures == null) {
      this.extraPictures = new ArrayList<>();
    }
    this.extraPictures.add(extraPicturesItem);
    return this;
  }

   /**
   * Get extraPictures
   * @return extraPictures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExtraPicture> getExtraPictures() {
    return extraPictures;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_PICTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraPictures(List<ExtraPicture> extraPictures) {
    this.extraPictures = extraPictures;
  }


  public Template poster(String poster) {
    
    this.poster = poster;
    return this;
  }

   /**
   * Get poster
   * @return poster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPoster() {
    return poster;
  }


  @JsonProperty(JSON_PROPERTY_POSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoster(String poster) {
    this.poster = poster;
  }


  public Template videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoId() {
    return videoId;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public Template duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(String duration) {
    this.duration = duration;
  }


  public Template videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoUrl() {
    return videoUrl;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public Template miniProgramSchema(String miniProgramSchema) {
    
    this.miniProgramSchema = miniProgramSchema;
    return this;
  }

   /**
   * Get miniProgramSchema
   * @return miniProgramSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINI_PROGRAM_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiniProgramSchema() {
    return miniProgramSchema;
  }


  @JsonProperty(JSON_PROPERTY_MINI_PROGRAM_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiniProgramSchema(String miniProgramSchema) {
    this.miniProgramSchema = miniProgramSchema;
  }


  public Template exposureUrl(String exposureUrl) {
    
    this.exposureUrl = exposureUrl;
    return this;
  }

   /**
   * Get exposureUrl
   * @return exposureUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPOSURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExposureUrl() {
    return exposureUrl;
  }


  @JsonProperty(JSON_PROPERTY_EXPOSURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExposureUrl(String exposureUrl) {
    this.exposureUrl = exposureUrl;
  }


  public Template ulkScheme(String ulkScheme) {
    
    this.ulkScheme = ulkScheme;
    return this;
  }

   /**
   * Get ulkScheme
   * @return ulkScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ULK_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUlkScheme() {
    return ulkScheme;
  }


  @JsonProperty(JSON_PROPERTY_ULK_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUlkScheme(String ulkScheme) {
    this.ulkScheme = ulkScheme;
  }


  public Template ulkUrl(String ulkUrl) {
    
    this.ulkUrl = ulkUrl;
    return this;
  }

   /**
   * Get ulkUrl
   * @return ulkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ULK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUlkUrl() {
    return ulkUrl;
  }


  @JsonProperty(JSON_PROPERTY_ULK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUlkUrl(String ulkUrl) {
    this.ulkUrl = ulkUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.title, template.title) &&
        Objects.equals(this.subtitle, template.subtitle) &&
        Objects.equals(this.targetUrl, template.targetUrl) &&
        Objects.equals(this.monitorUrl, template.monitorUrl) &&
        Objects.equals(this.userPortrait, template.userPortrait) &&
        Objects.equals(this.naUrl, template.naUrl) &&
        Objects.equals(this.brand, template.brand) &&
        Objects.equals(this.pictures, template.pictures) &&
        Objects.equals(this.extraPictures, template.extraPictures) &&
        Objects.equals(this.poster, template.poster) &&
        Objects.equals(this.videoId, template.videoId) &&
        Objects.equals(this.duration, template.duration) &&
        Objects.equals(this.videoUrl, template.videoUrl) &&
        Objects.equals(this.miniProgramSchema, template.miniProgramSchema) &&
        Objects.equals(this.exposureUrl, template.exposureUrl) &&
        Objects.equals(this.ulkScheme, template.ulkScheme) &&
        Objects.equals(this.ulkUrl, template.ulkUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, targetUrl, monitorUrl, userPortrait, naUrl, brand, pictures, extraPictures, poster, videoId, duration, videoUrl, miniProgramSchema, exposureUrl, ulkScheme, ulkUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    monitorUrl: ").append(toIndentedString(monitorUrl)).append("\n");
    sb.append("    userPortrait: ").append(toIndentedString(userPortrait)).append("\n");
    sb.append("    naUrl: ").append(toIndentedString(naUrl)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    extraPictures: ").append(toIndentedString(extraPictures)).append("\n");
    sb.append("    poster: ").append(toIndentedString(poster)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    miniProgramSchema: ").append(toIndentedString(miniProgramSchema)).append("\n");
    sb.append("    exposureUrl: ").append(toIndentedString(exposureUrl)).append("\n");
    sb.append("    ulkScheme: ").append(toIndentedString(ulkScheme)).append("\n");
    sb.append("    ulkUrl: ").append(toIndentedString(ulkUrl)).append("\n");
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

