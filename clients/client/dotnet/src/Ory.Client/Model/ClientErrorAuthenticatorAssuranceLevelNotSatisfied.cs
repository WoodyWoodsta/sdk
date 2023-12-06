/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.4.4
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
    /// ClientErrorAuthenticatorAssuranceLevelNotSatisfied
    /// </summary>
    [DataContract(Name = "errorAuthenticatorAssuranceLevelNotSatisfied")]
    public partial class ClientErrorAuthenticatorAssuranceLevelNotSatisfied : IEquatable<ClientErrorAuthenticatorAssuranceLevelNotSatisfied>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientErrorAuthenticatorAssuranceLevelNotSatisfied" /> class.
        /// </summary>
        /// <param name="error">error.</param>
        /// <param name="redirectBrowserTo">Points to where to redirect the user to next..</param>
        public ClientErrorAuthenticatorAssuranceLevelNotSatisfied(ClientGenericError error = default(ClientGenericError), string redirectBrowserTo = default(string))
        {
            this.Error = error;
            this.RedirectBrowserTo = redirectBrowserTo;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public ClientGenericError Error { get; set; }

        /// <summary>
        /// Points to where to redirect the user to next.
        /// </summary>
        /// <value>Points to where to redirect the user to next.</value>
        [DataMember(Name = "redirect_browser_to", EmitDefaultValue = false)]
        public string RedirectBrowserTo { get; set; }

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
            sb.Append("class ClientErrorAuthenticatorAssuranceLevelNotSatisfied {\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  RedirectBrowserTo: ").Append(RedirectBrowserTo).Append("\n");
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
            return this.Equals(input as ClientErrorAuthenticatorAssuranceLevelNotSatisfied);
        }

        /// <summary>
        /// Returns true if ClientErrorAuthenticatorAssuranceLevelNotSatisfied instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientErrorAuthenticatorAssuranceLevelNotSatisfied to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientErrorAuthenticatorAssuranceLevelNotSatisfied input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
                ) && 
                (
                    this.RedirectBrowserTo == input.RedirectBrowserTo ||
                    (this.RedirectBrowserTo != null &&
                    this.RedirectBrowserTo.Equals(input.RedirectBrowserTo))
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
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
                }
                if (this.RedirectBrowserTo != null)
                {
                    hashCode = (hashCode * 59) + this.RedirectBrowserTo.GetHashCode();
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
