/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.96
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// SubmitSelfServiceSettingsFlowWithPasswordMethodBody struct for SubmitSelfServiceSettingsFlowWithPasswordMethodBody
type SubmitSelfServiceSettingsFlowWithPasswordMethodBody struct {
	// CSRFToken is the anti-CSRF token
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Method  Should be set to password when trying to update a password.
	Method string `json:"method"`
	// Password is the updated password
	Password string `json:"password"`
}

// NewSubmitSelfServiceSettingsFlowWithPasswordMethodBody instantiates a new SubmitSelfServiceSettingsFlowWithPasswordMethodBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSubmitSelfServiceSettingsFlowWithPasswordMethodBody(method string, password string) *SubmitSelfServiceSettingsFlowWithPasswordMethodBody {
	this := SubmitSelfServiceSettingsFlowWithPasswordMethodBody{}
	this.Method = method
	this.Password = password
	return &this
}

// NewSubmitSelfServiceSettingsFlowWithPasswordMethodBodyWithDefaults instantiates a new SubmitSelfServiceSettingsFlowWithPasswordMethodBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSubmitSelfServiceSettingsFlowWithPasswordMethodBodyWithDefaults() *SubmitSelfServiceSettingsFlowWithPasswordMethodBody {
	this := SubmitSelfServiceSettingsFlowWithPasswordMethodBody{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) GetCsrfToken() string {
	if o == nil || o.CsrfToken == nil {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) GetCsrfTokenOk() (*string, bool) {
	if o == nil || o.CsrfToken == nil {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) HasCsrfToken() bool {
	if o != nil && o.CsrfToken != nil {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetMethod returns the Method field value
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) GetMethodOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) SetMethod(v string) {
	o.Method = v
}

// GetPassword returns the Password field value
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) GetPassword() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Password
}

// GetPasswordOk returns a tuple with the Password field value
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) GetPasswordOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Password, true
}

// SetPassword sets field value
func (o *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) SetPassword(v string) {
	o.Password = v
}

func (o SubmitSelfServiceSettingsFlowWithPasswordMethodBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CsrfToken != nil {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	if true {
		toSerialize["method"] = o.Method
	}
	if true {
		toSerialize["password"] = o.Password
	}
	return json.Marshal(toSerialize)
}

type NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody struct {
	value *SubmitSelfServiceSettingsFlowWithPasswordMethodBody
	isSet bool
}

func (v NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody) Get() *SubmitSelfServiceSettingsFlowWithPasswordMethodBody {
	return v.value
}

func (v *NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody) Set(val *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) {
	v.value = val
	v.isSet = true
}

func (v NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody) IsSet() bool {
	return v.isSet
}

func (v *NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody(val *SubmitSelfServiceSettingsFlowWithPasswordMethodBody) *NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody {
	return &NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody{value: val, isSet: true}
}

func (v NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubmitSelfServiceSettingsFlowWithPasswordMethodBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


