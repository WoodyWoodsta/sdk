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

// SuccessfulProjectConfigUpdate struct for SuccessfulProjectConfigUpdate
type SuccessfulProjectConfigUpdate struct {
	Project *Project `json:"project,omitempty"`
	// Import Warnings  Not all configuration items can be imported to Ory Cloud. For example, setting the port does not make sense because Ory Cloud provides the runtime and networking.  This field contains warnings where configuration keys were found but can not be imported. These keys will be ignored by Ory Cloud. This field will help you understand why certain configuration keys might not be respected!
	Warnings []Warning `json:"warnings,omitempty"`
}

// NewSuccessfulProjectConfigUpdate instantiates a new SuccessfulProjectConfigUpdate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSuccessfulProjectConfigUpdate() *SuccessfulProjectConfigUpdate {
	this := SuccessfulProjectConfigUpdate{}
	return &this
}

// NewSuccessfulProjectConfigUpdateWithDefaults instantiates a new SuccessfulProjectConfigUpdate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSuccessfulProjectConfigUpdateWithDefaults() *SuccessfulProjectConfigUpdate {
	this := SuccessfulProjectConfigUpdate{}
	return &this
}

// GetProject returns the Project field value if set, zero value otherwise.
func (o *SuccessfulProjectConfigUpdate) GetProject() Project {
	if o == nil || o.Project == nil {
		var ret Project
		return ret
	}
	return *o.Project
}

// GetProjectOk returns a tuple with the Project field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuccessfulProjectConfigUpdate) GetProjectOk() (*Project, bool) {
	if o == nil || o.Project == nil {
		return nil, false
	}
	return o.Project, true
}

// HasProject returns a boolean if a field has been set.
func (o *SuccessfulProjectConfigUpdate) HasProject() bool {
	if o != nil && o.Project != nil {
		return true
	}

	return false
}

// SetProject gets a reference to the given Project and assigns it to the Project field.
func (o *SuccessfulProjectConfigUpdate) SetProject(v Project) {
	o.Project = &v
}

// GetWarnings returns the Warnings field value if set, zero value otherwise.
func (o *SuccessfulProjectConfigUpdate) GetWarnings() []Warning {
	if o == nil || o.Warnings == nil {
		var ret []Warning
		return ret
	}
	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SuccessfulProjectConfigUpdate) GetWarningsOk() ([]Warning, bool) {
	if o == nil || o.Warnings == nil {
		return nil, false
	}
	return o.Warnings, true
}

// HasWarnings returns a boolean if a field has been set.
func (o *SuccessfulProjectConfigUpdate) HasWarnings() bool {
	if o != nil && o.Warnings != nil {
		return true
	}

	return false
}

// SetWarnings gets a reference to the given []Warning and assigns it to the Warnings field.
func (o *SuccessfulProjectConfigUpdate) SetWarnings(v []Warning) {
	o.Warnings = v
}

func (o SuccessfulProjectConfigUpdate) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Project != nil {
		toSerialize["project"] = o.Project
	}
	if o.Warnings != nil {
		toSerialize["warnings"] = o.Warnings
	}
	return json.Marshal(toSerialize)
}

type NullableSuccessfulProjectConfigUpdate struct {
	value *SuccessfulProjectConfigUpdate
	isSet bool
}

func (v NullableSuccessfulProjectConfigUpdate) Get() *SuccessfulProjectConfigUpdate {
	return v.value
}

func (v *NullableSuccessfulProjectConfigUpdate) Set(val *SuccessfulProjectConfigUpdate) {
	v.value = val
	v.isSet = true
}

func (v NullableSuccessfulProjectConfigUpdate) IsSet() bool {
	return v.isSet
}

func (v *NullableSuccessfulProjectConfigUpdate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSuccessfulProjectConfigUpdate(val *SuccessfulProjectConfigUpdate) *NullableSuccessfulProjectConfigUpdate {
	return &NullableSuccessfulProjectConfigUpdate{value: val, isSet: true}
}

func (v NullableSuccessfulProjectConfigUpdate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSuccessfulProjectConfigUpdate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


