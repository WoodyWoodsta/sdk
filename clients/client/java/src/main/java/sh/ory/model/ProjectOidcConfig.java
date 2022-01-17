/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.49
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
import java.util.ArrayList;
import java.util.List;

/**
 * ProjectOidcConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-17T16:05:39.727411413Z[Etc/UTC]")
public class ProjectOidcConfig {
  public static final String SERIALIZED_NAME_AUTH_URL = "auth_url";
  @SerializedName(SERIALIZED_NAME_AUTH_URL)
  private String authUrl;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUER_URL = "issuer_url";
  @SerializedName(SERIALIZED_NAME_ISSUER_URL)
  private String issuerUrl;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_MAPPER_URL = "mapper_url";
  @SerializedName(SERIALIZED_NAME_MAPPER_URL)
  private String mapperUrl;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_REQUESTED_CLAIMS = "requested_claims";
  @SerializedName(SERIALIZED_NAME_REQUESTED_CLAIMS)
  private Object requestedClaims;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private List<String> scope = null;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private String string;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private String tenant;

  public static final String SERIALIZED_NAME_TOKEN_URL = "token_url";
  @SerializedName(SERIALIZED_NAME_TOKEN_URL)
  private String tokenUrl;


  public ProjectOidcConfig authUrl(String authUrl) {
    
    this.authUrl = authUrl;
    return this;
  }

   /**
   * AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.
   * @return authUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.")

  public String getAuthUrl() {
    return authUrl;
  }


  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public ProjectOidcConfig clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * ClientID is the application&#39;s Client ID.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClientID is the application's Client ID.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ProjectOidcConfig clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * ClientSecret is the application&#39;s secret.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClientSecret is the application's secret.")

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public ProjectOidcConfig id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID is the provider&#39;s ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID is the provider's ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProjectOidcConfig issuerUrl(String issuerUrl) {
    
    this.issuerUrl = issuerUrl;
    return this;
  }

   /**
   * IssuerURL is the OpenID Connect Server URL. You can leave this empty if &#x60;provider&#x60; is not set to &#x60;generic&#x60;. If set, neither &#x60;auth_url&#x60; nor &#x60;token_url&#x60; are required.
   * @return issuerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IssuerURL is the OpenID Connect Server URL. You can leave this empty if `provider` is not set to `generic`. If set, neither `auth_url` nor `token_url` are required.")

  public String getIssuerUrl() {
    return issuerUrl;
  }


  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }


  public ProjectOidcConfig label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Label represents an optional label which can be used in the UI generation.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label represents an optional label which can be used in the UI generation.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ProjectOidcConfig mapperUrl(String mapperUrl) {
    
    this.mapperUrl = mapperUrl;
    return this;
  }

   /**
   * Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider&#39;s data (e.g. GitHub or Google profile information) to hydrate the identity&#39;s data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet.
   * @return mapperUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider's data (e.g. GitHub or Google profile information) to hydrate the identity's data.  It can be either a URL (file://, http(s)://, base64://) or an inline JSONNet code snippet.")

  public String getMapperUrl() {
    return mapperUrl;
  }


  public void setMapperUrl(String mapperUrl) {
    this.mapperUrl = mapperUrl;
  }


  public ProjectOidcConfig provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Provider is either \&quot;generic\&quot; for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provider is either \"generic\" for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public ProjectOidcConfig requestedClaims(Object requestedClaims) {
    
    this.requestedClaims = requestedClaims;
    return this;
  }

   /**
   * RequestedClaims string encoded json object that specifies claims and optionally their properties which should be included in the id_token or returned from the UserInfo Endpoint.  More information: https://openid.net/specs/openid-connect-core-1_0.html#ClaimsParameter
   * @return requestedClaims
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestedClaims string encoded json object that specifies claims and optionally their properties which should be included in the id_token or returned from the UserInfo Endpoint.  More information: https://openid.net/specs/openid-connect-core-1_0.html#ClaimsParameter")

  public Object getRequestedClaims() {
    return requestedClaims;
  }


  public void setRequestedClaims(Object requestedClaims) {
    this.requestedClaims = requestedClaims;
  }


  public ProjectOidcConfig scope(List<String> scope) {
    
    this.scope = scope;
    return this;
  }

  public ProjectOidcConfig addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * Scope specifies optional requested permissions.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scope specifies optional requested permissions.")

  public List<String> getScope() {
    return scope;
  }


  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  public ProjectOidcConfig string(String string) {
    
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getString() {
    return string;
  }


  public void setString(String string) {
    this.string = string;
  }


  public ProjectOidcConfig tenant(String tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Tenant is the Azure AD Tenant to use for authentication, and must be set when &#x60;provider&#x60; is set to &#x60;microsoft&#x60;. Can be either &#x60;common&#x60;, &#x60;organizations&#x60;, &#x60;consumers&#x60; for a multitenant application or a specific tenant like &#x60;8eaef023-2b34-4da1-9baa-8bc8c9d6a490&#x60; or &#x60;contoso.onmicrosoft.com&#x60;.
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant is the Azure AD Tenant to use for authentication, and must be set when `provider` is set to `microsoft`. Can be either `common`, `organizations`, `consumers` for a multitenant application or a specific tenant like `8eaef023-2b34-4da1-9baa-8bc8c9d6a490` or `contoso.onmicrosoft.com`.")

  public String getTenant() {
    return tenant;
  }


  public void setTenant(String tenant) {
    this.tenant = tenant;
  }


  public ProjectOidcConfig tokenUrl(String tokenUrl) {
    
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * TokenURL is the token url, typically something like: https://example.org/oauth2/token Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when &#x60;provider&#x60; is set to &#x60;generic&#x60;.
   * @return tokenUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TokenURL is the token url, typically something like: https://example.org/oauth2/token Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.")

  public String getTokenUrl() {
    return tokenUrl;
  }


  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectOidcConfig projectOidcConfig = (ProjectOidcConfig) o;
    return Objects.equals(this.authUrl, projectOidcConfig.authUrl) &&
        Objects.equals(this.clientId, projectOidcConfig.clientId) &&
        Objects.equals(this.clientSecret, projectOidcConfig.clientSecret) &&
        Objects.equals(this.id, projectOidcConfig.id) &&
        Objects.equals(this.issuerUrl, projectOidcConfig.issuerUrl) &&
        Objects.equals(this.label, projectOidcConfig.label) &&
        Objects.equals(this.mapperUrl, projectOidcConfig.mapperUrl) &&
        Objects.equals(this.provider, projectOidcConfig.provider) &&
        Objects.equals(this.requestedClaims, projectOidcConfig.requestedClaims) &&
        Objects.equals(this.scope, projectOidcConfig.scope) &&
        Objects.equals(this.string, projectOidcConfig.string) &&
        Objects.equals(this.tenant, projectOidcConfig.tenant) &&
        Objects.equals(this.tokenUrl, projectOidcConfig.tokenUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authUrl, clientId, clientSecret, id, issuerUrl, label, mapperUrl, provider, requestedClaims, scope, string, tenant, tokenUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectOidcConfig {\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mapperUrl: ").append(toIndentedString(mapperUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    requestedClaims: ").append(toIndentedString(requestedClaims)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
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

