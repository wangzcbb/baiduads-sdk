/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advancedsegment.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advancedsegment.model.AddSegmentResponseWrapperBody;
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
 * AddSegmentResponseWrapper
 */
@JsonPropertyOrder({
  AddSegmentResponseWrapper.JSON_PROPERTY_HEADER,
  AddSegmentResponseWrapper.JSON_PROPERTY_BODY
})
@JsonTypeName("AddSegmentResponseWrapper")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddSegmentResponseWrapper {
  public static final String JSON_PROPERTY_HEADER = "header";
  private com.baidu.dev2.api.sdk.common.ApiResponseHeader header;

  public static final String JSON_PROPERTY_BODY = "body";
  private AddSegmentResponseWrapperBody body;

  public AddSegmentResponseWrapper() { 
  }

  public AddSegmentResponseWrapper header(com.baidu.dev2.api.sdk.common.ApiResponseHeader header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public com.baidu.dev2.api.sdk.common.ApiResponseHeader getHeader() {
    return header;
  }


  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeader(com.baidu.dev2.api.sdk.common.ApiResponseHeader header) {
    this.header = header;
  }


  public AddSegmentResponseWrapper body(AddSegmentResponseWrapperBody body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddSegmentResponseWrapperBody getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(AddSegmentResponseWrapperBody body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSegmentResponseWrapper addSegmentResponseWrapper = (AddSegmentResponseWrapper) o;
    return Objects.equals(this.header, addSegmentResponseWrapper.header) &&
        Objects.equals(this.body, addSegmentResponseWrapper.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSegmentResponseWrapper {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

