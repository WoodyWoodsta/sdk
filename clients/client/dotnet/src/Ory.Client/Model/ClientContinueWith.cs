/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.48
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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Ory.Client.Model
{
    /// <summary>
    /// ClientContinueWith
    /// </summary>
    [JsonConverter(typeof(ClientContinueWithJsonConverter))]
    [DataContract(Name = "continueWith")]
    public partial class ClientContinueWith : AbstractOpenAPISchema, IEquatable<ClientContinueWith>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContinueWith" /> class
        /// with the <see cref="ClientContinueWithSetOrySessionToken" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ClientContinueWithSetOrySessionToken.</param>
        public ClientContinueWith(ClientContinueWithSetOrySessionToken actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContinueWith" /> class
        /// with the <see cref="ClientContinueWithVerificationUi" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ClientContinueWithVerificationUi.</param>
        public ClientContinueWith(ClientContinueWithVerificationUi actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(ClientContinueWithSetOrySessionToken))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(ClientContinueWithVerificationUi))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: ClientContinueWithSetOrySessionToken, ClientContinueWithVerificationUi");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `ClientContinueWithSetOrySessionToken`. If the actual instance is not `ClientContinueWithSetOrySessionToken`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ClientContinueWithSetOrySessionToken</returns>
        public ClientContinueWithSetOrySessionToken GetClientContinueWithSetOrySessionToken()
        {
            return (ClientContinueWithSetOrySessionToken)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ClientContinueWithVerificationUi`. If the actual instance is not `ClientContinueWithVerificationUi`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ClientContinueWithVerificationUi</returns>
        public ClientContinueWithVerificationUi GetClientContinueWithVerificationUi()
        {
            return (ClientContinueWithVerificationUi)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientContinueWith {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, ClientContinueWith.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of ClientContinueWith
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of ClientContinueWith</returns>
        public static ClientContinueWith FromJson(string jsonString)
        {
            ClientContinueWith newClientContinueWith = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newClientContinueWith;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(ClientContinueWithSetOrySessionToken).GetProperty("AdditionalProperties") == null)
                {
                    newClientContinueWith = new ClientContinueWith(JsonConvert.DeserializeObject<ClientContinueWithSetOrySessionToken>(jsonString, ClientContinueWith.SerializerSettings));
                }
                else
                {
                    newClientContinueWith = new ClientContinueWith(JsonConvert.DeserializeObject<ClientContinueWithSetOrySessionToken>(jsonString, ClientContinueWith.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("ClientContinueWithSetOrySessionToken");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ClientContinueWithSetOrySessionToken: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(ClientContinueWithVerificationUi).GetProperty("AdditionalProperties") == null)
                {
                    newClientContinueWith = new ClientContinueWith(JsonConvert.DeserializeObject<ClientContinueWithVerificationUi>(jsonString, ClientContinueWith.SerializerSettings));
                }
                else
                {
                    newClientContinueWith = new ClientContinueWith(JsonConvert.DeserializeObject<ClientContinueWithVerificationUi>(jsonString, ClientContinueWith.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("ClientContinueWithVerificationUi");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ClientContinueWithVerificationUi: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newClientContinueWith;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientContinueWith);
        }

        /// <summary>
        /// Returns true if ClientContinueWith instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientContinueWith to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientContinueWith input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
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
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for ClientContinueWith
    /// </summary>
    public class ClientContinueWithJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(ClientContinueWith).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return ClientContinueWith.FromJson(JObject.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
