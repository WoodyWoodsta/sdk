/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.46
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// OAuth2 JWT Bearer Grant Type Issuer Trusted JSON Web Key
    /// </summary>
    [DataContract(Name = "trustedOAuth2JwtGrantJsonWebKey")]
    public partial class ClientTrustedOAuth2JwtGrantJsonWebKey : IEquatable<ClientTrustedOAuth2JwtGrantJsonWebKey>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientTrustedOAuth2JwtGrantJsonWebKey" /> class.
        /// </summary>
        /// <param name="kid">The \&quot;key_id\&quot; is key unique identifier (same as kid header in jws/jwt)..</param>
        /// <param name="set">The \&quot;set\&quot; is basically a name for a group(set) of keys. Will be the same as \&quot;issuer\&quot; in grant..</param>
        public ClientTrustedOAuth2JwtGrantJsonWebKey(string kid = default(string), string set = default(string))
        {
            this.Kid = kid;
            this.Set = set;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The \&quot;key_id\&quot; is key unique identifier (same as kid header in jws/jwt).
        /// </summary>
        /// <value>The \&quot;key_id\&quot; is key unique identifier (same as kid header in jws/jwt).</value>
        [DataMember(Name = "kid", EmitDefaultValue = false)]
        public string Kid { get; set; }

        /// <summary>
        /// The \&quot;set\&quot; is basically a name for a group(set) of keys. Will be the same as \&quot;issuer\&quot; in grant.
        /// </summary>
        /// <value>The \&quot;set\&quot; is basically a name for a group(set) of keys. Will be the same as \&quot;issuer\&quot; in grant.</value>
        [DataMember(Name = "set", EmitDefaultValue = false)]
        public string Set { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClientTrustedOAuth2JwtGrantJsonWebKey {\n");
            sb.Append("  Kid: ").Append(Kid).Append("\n");
            sb.Append("  Set: ").Append(Set).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientTrustedOAuth2JwtGrantJsonWebKey);
        }

        /// <summary>
        /// Returns true if ClientTrustedOAuth2JwtGrantJsonWebKey instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientTrustedOAuth2JwtGrantJsonWebKey to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientTrustedOAuth2JwtGrantJsonWebKey input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Kid == input.Kid ||
                    (this.Kid != null &&
                    this.Kid.Equals(input.Kid))
                ) && 
                (
                    this.Set == input.Set ||
                    (this.Set != null &&
                    this.Set.Equals(input.Set))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Kid != null)
                {
                    hashCode = (hashCode * 59) + this.Kid.GetHashCode();
                }
                if (this.Set != null)
                {
                    hashCode = (hashCode * 59) + this.Set.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
