/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.96
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NeedsPrivilegedSessionError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-15T19:20:28.174680724Z[Etc/UTC]")
public class NeedsPrivilegedSessionError {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private String debug;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private Map<String, Object> details = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REDIRECT_BROWSER_TO = "redirect_browser_to";
  @SerializedName(SERIALIZED_NAME_REDIRECT_BROWSER_TO)
  private String redirectBrowserTo;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public NeedsPrivilegedSessionError() { 
  }

  public NeedsPrivilegedSessionError code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * The status code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "404", value = "The status code")

  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public NeedsPrivilegedSessionError debug(String debug) {
    
    this.debug = debug;
    return this;
  }

   /**
   * Debug information  This field is often not exposed to protect against leaking sensitive information.
   * @return debug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQL field \"foo\" is not a bool.", value = "Debug information  This field is often not exposed to protect against leaking sensitive information.")

  public String getDebug() {
    return debug;
  }


  public void setDebug(String debug) {
    this.debug = debug;
  }


  public NeedsPrivilegedSessionError details(Map<String, Object> details) {
    
    this.details = details;
    return this;
  }

  public NeedsPrivilegedSessionError putDetailsItem(String key, Object detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Further error details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Further error details")

  public Map<String, Object> getDetails() {
    return details;
  }


  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  public NeedsPrivilegedSessionError id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The error ID  Useful when trying to identify various errors in application logic.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error ID  Useful when trying to identify various errors in application logic.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NeedsPrivilegedSessionError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error message  The error&#39;s message.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "The resource could not be found", required = true, value = "Error message  The error's message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public NeedsPrivilegedSessionError reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * A human-readable reason for the error
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "User with ID 1234 does not exist.", value = "A human-readable reason for the error")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public NeedsPrivilegedSessionError redirectBrowserTo(String redirectBrowserTo) {
    
    this.redirectBrowserTo = redirectBrowserTo;
    return this;
  }

   /**
   * Points to where to redirect the user to next.
   * @return redirectBrowserTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Points to where to redirect the user to next.")

  public String getRedirectBrowserTo() {
    return redirectBrowserTo;
  }


  public void setRedirectBrowserTo(String redirectBrowserTo) {
    this.redirectBrowserTo = redirectBrowserTo;
  }


  public NeedsPrivilegedSessionError request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d7ef54b1-ec15-46e6-bccb-524b82c035e6", value = "The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public NeedsPrivilegedSessionError status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status description
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Not Found", value = "The status description")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NeedsPrivilegedSessionError needsPrivilegedSessionError = (NeedsPrivilegedSessionError) o;
    return Objects.equals(this.code, needsPrivilegedSessionError.code) &&
        Objects.equals(this.debug, needsPrivilegedSessionError.debug) &&
        Objects.equals(this.details, needsPrivilegedSessionError.details) &&
        Objects.equals(this.id, needsPrivilegedSessionError.id) &&
        Objects.equals(this.message, needsPrivilegedSessionError.message) &&
        Objects.equals(this.reason, needsPrivilegedSessionError.reason) &&
        Objects.equals(this.redirectBrowserTo, needsPrivilegedSessionError.redirectBrowserTo) &&
        Objects.equals(this.request, needsPrivilegedSessionError.request) &&
        Objects.equals(this.status, needsPrivilegedSessionError.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, debug, details, id, message, reason, redirectBrowserTo, request, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NeedsPrivilegedSessionError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    redirectBrowserTo: ").append(toIndentedString(redirectBrowserTo)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

