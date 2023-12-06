/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.4.4
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.AuthenticatorAssuranceLevel;
import sh.ory.model.Identity;
import sh.ory.model.SessionAuthenticationMethod;
import sh.ory.model.SessionDevice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * A Session
 */
@ApiModel(description = "A Session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-06T09:14:11.980655335Z[Etc/UTC]")
public class Session {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AUTHENTICATED_AT = "authenticated_at";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATED_AT)
  private OffsetDateTime authenticatedAt;

  public static final String SERIALIZED_NAME_AUTHENTICATION_METHODS = "authentication_methods";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_METHODS)
  private List<SessionAuthenticationMethod> authenticationMethods = null;

  public static final String SERIALIZED_NAME_AUTHENTICATOR_ASSURANCE_LEVEL = "authenticator_assurance_level";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATOR_ASSURANCE_LEVEL)
  private AuthenticatorAssuranceLevel authenticatorAssuranceLevel;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<SessionDevice> devices = null;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Identity identity;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_TOKENIZED = "tokenized";
  @SerializedName(SERIALIZED_NAME_TOKENIZED)
  private String tokenized;

  public Session() {
  }

  public Session active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Active state. If false the session is no longer active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active state. If false the session is no longer active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Session authenticatedAt(OffsetDateTime authenticatedAt) {
    
    this.authenticatedAt = authenticatedAt;
    return this;
  }

   /**
   * The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).
   * @return authenticatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).")

  public OffsetDateTime getAuthenticatedAt() {
    return authenticatedAt;
  }


  public void setAuthenticatedAt(OffsetDateTime authenticatedAt) {
    this.authenticatedAt = authenticatedAt;
  }


  public Session authenticationMethods(List<SessionAuthenticationMethod> authenticationMethods) {
    
    this.authenticationMethods = authenticationMethods;
    return this;
  }

  public Session addAuthenticationMethodsItem(SessionAuthenticationMethod authenticationMethodsItem) {
    if (this.authenticationMethods == null) {
      this.authenticationMethods = new ArrayList<>();
    }
    this.authenticationMethods.add(authenticationMethodsItem);
    return this;
  }

   /**
   * A list of authenticators which were used to authenticate the session.
   * @return authenticationMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of authenticators which were used to authenticate the session.")

  public List<SessionAuthenticationMethod> getAuthenticationMethods() {
    return authenticationMethods;
  }


  public void setAuthenticationMethods(List<SessionAuthenticationMethod> authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }


  public Session authenticatorAssuranceLevel(AuthenticatorAssuranceLevel authenticatorAssuranceLevel) {
    
    this.authenticatorAssuranceLevel = authenticatorAssuranceLevel;
    return this;
  }

   /**
   * Get authenticatorAssuranceLevel
   * @return authenticatorAssuranceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthenticatorAssuranceLevel getAuthenticatorAssuranceLevel() {
    return authenticatorAssuranceLevel;
  }


  public void setAuthenticatorAssuranceLevel(AuthenticatorAssuranceLevel authenticatorAssuranceLevel) {
    this.authenticatorAssuranceLevel = authenticatorAssuranceLevel;
  }


  public Session devices(List<SessionDevice> devices) {
    
    this.devices = devices;
    return this;
  }

  public Session addDevicesItem(SessionDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Devices has history of all endpoints where the session was used
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Devices has history of all endpoints where the session was used")

  public List<SessionDevice> getDevices() {
    return devices;
  }


  public void setDevices(List<SessionDevice> devices) {
    this.devices = devices;
  }


  public Session expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Session Expiry  When this session expires at.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Session Expiry  When this session expires at.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Session id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Session ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Session ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Session identity(Identity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Identity getIdentity() {
    return identity;
  }


  public void setIdentity(Identity identity) {
    this.identity = identity;
  }


  public Session issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * The Session Issuance Timestamp  When this session was issued at. Usually equal or close to &#x60;authenticated_at&#x60;.
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public Session tokenized(String tokenized) {
    
    this.tokenized = tokenized;
    return this;
  }

   /**
   * Tokenized is the tokenized (e.g. JWT) version of the session.  It is only set when the &#x60;tokenize&#x60; query parameter was set to a valid tokenize template during calls to &#x60;/session/whoami&#x60;.
   * @return tokenized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tokenized is the tokenized (e.g. JWT) version of the session.  It is only set when the `tokenize` query parameter was set to a valid tokenize template during calls to `/session/whoami`.")

  public String getTokenized() {
    return tokenized;
  }


  public void setTokenized(String tokenized) {
    this.tokenized = tokenized;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Session instance itself
   */
  public Session putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.active, session.active) &&
        Objects.equals(this.authenticatedAt, session.authenticatedAt) &&
        Objects.equals(this.authenticationMethods, session.authenticationMethods) &&
        Objects.equals(this.authenticatorAssuranceLevel, session.authenticatorAssuranceLevel) &&
        Objects.equals(this.devices, session.devices) &&
        Objects.equals(this.expiresAt, session.expiresAt) &&
        Objects.equals(this.id, session.id) &&
        Objects.equals(this.identity, session.identity) &&
        Objects.equals(this.issuedAt, session.issuedAt) &&
        Objects.equals(this.tokenized, session.tokenized)&&
        Objects.equals(this.additionalProperties, session.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, authenticatedAt, authenticationMethods, authenticatorAssuranceLevel, devices, expiresAt, id, identity, issuedAt, tokenized, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    authenticatedAt: ").append(toIndentedString(authenticatedAt)).append("\n");
    sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    sb.append("    authenticatorAssuranceLevel: ").append(toIndentedString(authenticatorAssuranceLevel)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    tokenized: ").append(toIndentedString(tokenized)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("active");
    openapiFields.add("authenticated_at");
    openapiFields.add("authentication_methods");
    openapiFields.add("authenticator_assurance_level");
    openapiFields.add("devices");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("identity");
    openapiFields.add("issued_at");
    openapiFields.add("tokenized");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Session
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Session.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Session is not found in the empty JSON string", Session.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Session.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("authentication_methods") != null && !jsonObj.get("authentication_methods").isJsonNull()) {
        JsonArray jsonArrayauthenticationMethods = jsonObj.getAsJsonArray("authentication_methods");
        if (jsonArrayauthenticationMethods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("authentication_methods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `authentication_methods` to be an array in the JSON string but got `%s`", jsonObj.get("authentication_methods").toString()));
          }

          // validate the optional field `authentication_methods` (array)
          for (int i = 0; i < jsonArrayauthenticationMethods.size(); i++) {
            SessionAuthenticationMethod.validateJsonObject(jsonArrayauthenticationMethods.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            SessionDevice.validateJsonObject(jsonArraydevices.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `identity`
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()) {
        Identity.validateJsonObject(jsonObj.getAsJsonObject("identity"));
      }
      if ((jsonObj.get("tokenized") != null && !jsonObj.get("tokenized").isJsonNull()) && !jsonObj.get("tokenized").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenized` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenized").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Session.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Session' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Session> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Session.class));

       return (TypeAdapter<T>) new TypeAdapter<Session>() {
           @Override
           public void write(JsonWriter out, Session value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Session read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Session instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Session given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Session
  * @throws IOException if the JSON string is invalid with respect to Session
  */
  public static Session fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Session.class);
  }

 /**
  * Convert an instance of Session to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

