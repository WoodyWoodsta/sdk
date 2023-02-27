/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.20
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
 * Together the name and identity uuid are a unique index constraint. This prevents a user from having schemas with the same name. This also allows schemas to have the same name across the system.
 */
@ApiModel(description = "Together the name and identity uuid are a unique index constraint. This prevents a user from having schemas with the same name. This also allows schemas to have the same name across the system.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-27T15:44:21.538695371Z[Etc/UTC]")
public class ManagedIdentitySchema {
  public static final String SERIALIZED_NAME_BLOB_NAME = "blob_name";
  @SerializedName(SERIALIZED_NAME_BLOB_NAME)
  private String blobName;

  public static final String SERIALIZED_NAME_BLOB_URL = "blob_url";
  @SerializedName(SERIALIZED_NAME_BLOB_URL)
  private String blobUrl;

  public static final String SERIALIZED_NAME_CONTENT_HASH = "content_hash";
  @SerializedName(SERIALIZED_NAME_CONTENT_HASH)
  private String contentHash;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public ManagedIdentitySchema() {
  }

  
  public ManagedIdentitySchema(
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
  }

  public ManagedIdentitySchema blobName(String blobName) {
    
    this.blobName = blobName;
    return this;
  }

   /**
   * The gcs file name  This is a randomly generated name which is used to uniquely identify the file on the blob storage
   * @return blobName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The gcs file name  This is a randomly generated name which is used to uniquely identify the file on the blob storage")

  public String getBlobName() {
    return blobName;
  }


  public void setBlobName(String blobName) {
    this.blobName = blobName;
  }


  public ManagedIdentitySchema blobUrl(String blobUrl) {
    
    this.blobUrl = blobUrl;
    return this;
  }

   /**
   * The publicly accessible url of the schema
   * @return blobUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The publicly accessible url of the schema")

  public String getBlobUrl() {
    return blobUrl;
  }


  public void setBlobUrl(String blobUrl) {
    this.blobUrl = blobUrl;
  }


  public ManagedIdentitySchema contentHash(String contentHash) {
    
    this.contentHash = contentHash;
    return this;
  }

   /**
   * The Content Hash  Contains a hash of the schema&#39;s content.
   * @return contentHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Content Hash  Contains a hash of the schema's content.")

  public String getContentHash() {
    return contentHash;
  }


  public void setContentHash(String contentHash) {
    this.contentHash = contentHash;
  }


   /**
   * The Schema&#39;s Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Schema's Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The schema&#39;s ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The schema's ID.")

  public String getId() {
    return id;
  }




  public ManagedIdentitySchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The schema name  This is set by the user and is for them to easily recognise their schema
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CustomerIdentity", required = true, value = "The schema name  This is set by the user and is for them to easily recognise their schema")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * Last Time Schema was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Last Time Schema was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedIdentitySchema managedIdentitySchema = (ManagedIdentitySchema) o;
    return Objects.equals(this.blobName, managedIdentitySchema.blobName) &&
        Objects.equals(this.blobUrl, managedIdentitySchema.blobUrl) &&
        Objects.equals(this.contentHash, managedIdentitySchema.contentHash) &&
        Objects.equals(this.createdAt, managedIdentitySchema.createdAt) &&
        Objects.equals(this.id, managedIdentitySchema.id) &&
        Objects.equals(this.name, managedIdentitySchema.name) &&
        Objects.equals(this.updatedAt, managedIdentitySchema.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blobName, blobUrl, contentHash, createdAt, id, name, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedIdentitySchema {\n");
    sb.append("    blobName: ").append(toIndentedString(blobName)).append("\n");
    sb.append("    blobUrl: ").append(toIndentedString(blobUrl)).append("\n");
    sb.append("    contentHash: ").append(toIndentedString(contentHash)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("blob_name");
    openapiFields.add("blob_url");
    openapiFields.add("content_hash");
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blob_name");
    openapiRequiredFields.add("blob_url");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ManagedIdentitySchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ManagedIdentitySchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManagedIdentitySchema is not found in the empty JSON string", ManagedIdentitySchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ManagedIdentitySchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManagedIdentitySchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ManagedIdentitySchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("blob_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blob_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blob_name").toString()));
      }
      if (!jsonObj.get("blob_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blob_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blob_url").toString()));
      }
      if ((jsonObj.get("content_hash") != null && !jsonObj.get("content_hash").isJsonNull()) && !jsonObj.get("content_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_hash").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagedIdentitySchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagedIdentitySchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagedIdentitySchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagedIdentitySchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagedIdentitySchema>() {
           @Override
           public void write(JsonWriter out, ManagedIdentitySchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagedIdentitySchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagedIdentitySchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagedIdentitySchema
  * @throws IOException if the JSON string is invalid with respect to ManagedIdentitySchema
  */
  public static ManagedIdentitySchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagedIdentitySchema.class);
  }

 /**
  * Convert an instance of ManagedIdentitySchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

