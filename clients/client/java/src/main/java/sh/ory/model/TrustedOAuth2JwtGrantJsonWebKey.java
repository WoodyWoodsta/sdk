/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.46
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
 * OAuth2 JWT Bearer Grant Type Issuer Trusted JSON Web Key
 */
@ApiModel(description = "OAuth2 JWT Bearer Grant Type Issuer Trusted JSON Web Key")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-14T12:58:59.214525172Z[Etc/UTC]")
public class TrustedOAuth2JwtGrantJsonWebKey {
  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_SET = "set";
  @SerializedName(SERIALIZED_NAME_SET)
  private String set;

  public TrustedOAuth2JwtGrantJsonWebKey() {
  }

  public TrustedOAuth2JwtGrantJsonWebKey kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The \&quot;key_id\&quot; is key unique identifier (same as kid header in jws/jwt).
   * @return kid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "The \"key_id\" is key unique identifier (same as kid header in jws/jwt).")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public TrustedOAuth2JwtGrantJsonWebKey set(String set) {
    
    this.set = set;
    return this;
  }

   /**
   * The \&quot;set\&quot; is basically a name for a group(set) of keys. Will be the same as \&quot;issuer\&quot; in grant.
   * @return set
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://jwt-idp.example.com", value = "The \"set\" is basically a name for a group(set) of keys. Will be the same as \"issuer\" in grant.")

  public String getSet() {
    return set;
  }


  public void setSet(String set) {
    this.set = set;
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
   * @return the TrustedOAuth2JwtGrantJsonWebKey instance itself
   */
  public TrustedOAuth2JwtGrantJsonWebKey putAdditionalProperty(String key, Object value) {
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
    TrustedOAuth2JwtGrantJsonWebKey trustedOAuth2JwtGrantJsonWebKey = (TrustedOAuth2JwtGrantJsonWebKey) o;
    return Objects.equals(this.kid, trustedOAuth2JwtGrantJsonWebKey.kid) &&
        Objects.equals(this.set, trustedOAuth2JwtGrantJsonWebKey.set)&&
        Objects.equals(this.additionalProperties, trustedOAuth2JwtGrantJsonWebKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kid, set, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedOAuth2JwtGrantJsonWebKey {\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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
    openapiFields.add("kid");
    openapiFields.add("set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrustedOAuth2JwtGrantJsonWebKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrustedOAuth2JwtGrantJsonWebKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrustedOAuth2JwtGrantJsonWebKey is not found in the empty JSON string", TrustedOAuth2JwtGrantJsonWebKey.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("kid") != null && !jsonObj.get("kid").isJsonNull()) && !jsonObj.get("kid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kid").toString()));
      }
      if ((jsonObj.get("set") != null && !jsonObj.get("set").isJsonNull()) && !jsonObj.get("set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("set").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustedOAuth2JwtGrantJsonWebKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustedOAuth2JwtGrantJsonWebKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustedOAuth2JwtGrantJsonWebKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustedOAuth2JwtGrantJsonWebKey.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustedOAuth2JwtGrantJsonWebKey>() {
           @Override
           public void write(JsonWriter out, TrustedOAuth2JwtGrantJsonWebKey value) throws IOException {
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
           public TrustedOAuth2JwtGrantJsonWebKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrustedOAuth2JwtGrantJsonWebKey instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrustedOAuth2JwtGrantJsonWebKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrustedOAuth2JwtGrantJsonWebKey
  * @throws IOException if the JSON string is invalid with respect to TrustedOAuth2JwtGrantJsonWebKey
  */
  public static TrustedOAuth2JwtGrantJsonWebKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustedOAuth2JwtGrantJsonWebKey.class);
  }

 /**
  * Convert an instance of TrustedOAuth2JwtGrantJsonWebKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

