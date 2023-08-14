/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.46
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// UpdateSettingsFlowWithWebAuthnMethod Update Settings Flow with WebAuthn Method
type UpdateSettingsFlowWithWebAuthnMethod struct {
	// CSRFToken is the anti-CSRF token
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Method  Should be set to \"webauthn\" when trying to add, update, or remove a webAuthn pairing.
	Method string `json:"method"`
	// Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
	WebauthnRegister *string `json:"webauthn_register,omitempty"`
	// Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.
	WebauthnRegisterDisplayname *string `json:"webauthn_register_displayname,omitempty"`
	// Remove a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
	WebauthnRemove *string `json:"webauthn_remove,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _UpdateSettingsFlowWithWebAuthnMethod UpdateSettingsFlowWithWebAuthnMethod

// NewUpdateSettingsFlowWithWebAuthnMethod instantiates a new UpdateSettingsFlowWithWebAuthnMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateSettingsFlowWithWebAuthnMethod(method string) *UpdateSettingsFlowWithWebAuthnMethod {
	this := UpdateSettingsFlowWithWebAuthnMethod{}
	this.Method = method
	return &this
}

// NewUpdateSettingsFlowWithWebAuthnMethodWithDefaults instantiates a new UpdateSettingsFlowWithWebAuthnMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateSettingsFlowWithWebAuthnMethodWithDefaults() *UpdateSettingsFlowWithWebAuthnMethod {
	this := UpdateSettingsFlowWithWebAuthnMethod{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetCsrfToken() string {
	if o == nil || o.CsrfToken == nil {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetCsrfTokenOk() (*string, bool) {
	if o == nil || o.CsrfToken == nil {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) HasCsrfToken() bool {
	if o != nil && o.CsrfToken != nil {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *UpdateSettingsFlowWithWebAuthnMethod) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetMethod returns the Method field value
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *UpdateSettingsFlowWithWebAuthnMethod) SetMethod(v string) {
	o.Method = v
}

// GetWebauthnRegister returns the WebauthnRegister field value if set, zero value otherwise.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetWebauthnRegister() string {
	if o == nil || o.WebauthnRegister == nil {
		var ret string
		return ret
	}
	return *o.WebauthnRegister
}

// GetWebauthnRegisterOk returns a tuple with the WebauthnRegister field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetWebauthnRegisterOk() (*string, bool) {
	if o == nil || o.WebauthnRegister == nil {
		return nil, false
	}
	return o.WebauthnRegister, true
}

// HasWebauthnRegister returns a boolean if a field has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) HasWebauthnRegister() bool {
	if o != nil && o.WebauthnRegister != nil {
		return true
	}

	return false
}

// SetWebauthnRegister gets a reference to the given string and assigns it to the WebauthnRegister field.
func (o *UpdateSettingsFlowWithWebAuthnMethod) SetWebauthnRegister(v string) {
	o.WebauthnRegister = &v
}

// GetWebauthnRegisterDisplayname returns the WebauthnRegisterDisplayname field value if set, zero value otherwise.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetWebauthnRegisterDisplayname() string {
	if o == nil || o.WebauthnRegisterDisplayname == nil {
		var ret string
		return ret
	}
	return *o.WebauthnRegisterDisplayname
}

// GetWebauthnRegisterDisplaynameOk returns a tuple with the WebauthnRegisterDisplayname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetWebauthnRegisterDisplaynameOk() (*string, bool) {
	if o == nil || o.WebauthnRegisterDisplayname == nil {
		return nil, false
	}
	return o.WebauthnRegisterDisplayname, true
}

// HasWebauthnRegisterDisplayname returns a boolean if a field has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) HasWebauthnRegisterDisplayname() bool {
	if o != nil && o.WebauthnRegisterDisplayname != nil {
		return true
	}

	return false
}

// SetWebauthnRegisterDisplayname gets a reference to the given string and assigns it to the WebauthnRegisterDisplayname field.
func (o *UpdateSettingsFlowWithWebAuthnMethod) SetWebauthnRegisterDisplayname(v string) {
	o.WebauthnRegisterDisplayname = &v
}

// GetWebauthnRemove returns the WebauthnRemove field value if set, zero value otherwise.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetWebauthnRemove() string {
	if o == nil || o.WebauthnRemove == nil {
		var ret string
		return ret
	}
	return *o.WebauthnRemove
}

// GetWebauthnRemoveOk returns a tuple with the WebauthnRemove field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) GetWebauthnRemoveOk() (*string, bool) {
	if o == nil || o.WebauthnRemove == nil {
		return nil, false
	}
	return o.WebauthnRemove, true
}

// HasWebauthnRemove returns a boolean if a field has been set.
func (o *UpdateSettingsFlowWithWebAuthnMethod) HasWebauthnRemove() bool {
	if o != nil && o.WebauthnRemove != nil {
		return true
	}

	return false
}

// SetWebauthnRemove gets a reference to the given string and assigns it to the WebauthnRemove field.
func (o *UpdateSettingsFlowWithWebAuthnMethod) SetWebauthnRemove(v string) {
	o.WebauthnRemove = &v
}

func (o UpdateSettingsFlowWithWebAuthnMethod) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CsrfToken != nil {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	if true {
		toSerialize["method"] = o.Method
	}
	if o.WebauthnRegister != nil {
		toSerialize["webauthn_register"] = o.WebauthnRegister
	}
	if o.WebauthnRegisterDisplayname != nil {
		toSerialize["webauthn_register_displayname"] = o.WebauthnRegisterDisplayname
	}
	if o.WebauthnRemove != nil {
		toSerialize["webauthn_remove"] = o.WebauthnRemove
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *UpdateSettingsFlowWithWebAuthnMethod) UnmarshalJSON(bytes []byte) (err error) {
	varUpdateSettingsFlowWithWebAuthnMethod := _UpdateSettingsFlowWithWebAuthnMethod{}

	if err = json.Unmarshal(bytes, &varUpdateSettingsFlowWithWebAuthnMethod); err == nil {
		*o = UpdateSettingsFlowWithWebAuthnMethod(varUpdateSettingsFlowWithWebAuthnMethod)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "csrf_token")
		delete(additionalProperties, "method")
		delete(additionalProperties, "webauthn_register")
		delete(additionalProperties, "webauthn_register_displayname")
		delete(additionalProperties, "webauthn_remove")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUpdateSettingsFlowWithWebAuthnMethod struct {
	value *UpdateSettingsFlowWithWebAuthnMethod
	isSet bool
}

func (v NullableUpdateSettingsFlowWithWebAuthnMethod) Get() *UpdateSettingsFlowWithWebAuthnMethod {
	return v.value
}

func (v *NullableUpdateSettingsFlowWithWebAuthnMethod) Set(val *UpdateSettingsFlowWithWebAuthnMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateSettingsFlowWithWebAuthnMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateSettingsFlowWithWebAuthnMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateSettingsFlowWithWebAuthnMethod(val *UpdateSettingsFlowWithWebAuthnMethod) *NullableUpdateSettingsFlowWithWebAuthnMethod {
	return &NullableUpdateSettingsFlowWithWebAuthnMethod{value: val, isSet: true}
}

func (v NullableUpdateSettingsFlowWithWebAuthnMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateSettingsFlowWithWebAuthnMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


