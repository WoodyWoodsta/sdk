/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v0.2.0-alpha.30
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// IsOwnerForProjectBySlug struct for IsOwnerForProjectBySlug
type IsOwnerForProjectBySlug struct {
	// ProjectSlug is the project's slug.
	ProjectSlug string `json:"ProjectSlug"`
	// Subject is the subject from the API Token.
	Subject string `json:"Subject"`
}

// NewIsOwnerForProjectBySlug instantiates a new IsOwnerForProjectBySlug object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIsOwnerForProjectBySlug(projectSlug string, subject string) *IsOwnerForProjectBySlug {
	this := IsOwnerForProjectBySlug{}
	this.ProjectSlug = projectSlug
	this.Subject = subject
	return &this
}

// NewIsOwnerForProjectBySlugWithDefaults instantiates a new IsOwnerForProjectBySlug object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIsOwnerForProjectBySlugWithDefaults() *IsOwnerForProjectBySlug {
	this := IsOwnerForProjectBySlug{}
	return &this
}

// GetProjectSlug returns the ProjectSlug field value
func (o *IsOwnerForProjectBySlug) GetProjectSlug() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ProjectSlug
}

// GetProjectSlugOk returns a tuple with the ProjectSlug field value
// and a boolean to check if the value has been set.
func (o *IsOwnerForProjectBySlug) GetProjectSlugOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ProjectSlug, true
}

// SetProjectSlug sets field value
func (o *IsOwnerForProjectBySlug) SetProjectSlug(v string) {
	o.ProjectSlug = v
}

// GetSubject returns the Subject field value
func (o *IsOwnerForProjectBySlug) GetSubject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value
// and a boolean to check if the value has been set.
func (o *IsOwnerForProjectBySlug) GetSubjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Subject, true
}

// SetSubject sets field value
func (o *IsOwnerForProjectBySlug) SetSubject(v string) {
	o.Subject = v
}

func (o IsOwnerForProjectBySlug) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ProjectSlug"] = o.ProjectSlug
	}
	if true {
		toSerialize["Subject"] = o.Subject
	}
	return json.Marshal(toSerialize)
}

type NullableIsOwnerForProjectBySlug struct {
	value *IsOwnerForProjectBySlug
	isSet bool
}

func (v NullableIsOwnerForProjectBySlug) Get() *IsOwnerForProjectBySlug {
	return v.value
}

func (v *NullableIsOwnerForProjectBySlug) Set(val *IsOwnerForProjectBySlug) {
	v.value = val
	v.isSet = true
}

func (v NullableIsOwnerForProjectBySlug) IsSet() bool {
	return v.isSet
}

func (v *NullableIsOwnerForProjectBySlug) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIsOwnerForProjectBySlug(val *IsOwnerForProjectBySlug) *NullableIsOwnerForProjectBySlug {
	return &NullableIsOwnerForProjectBySlug{value: val, isSet: true}
}

func (v NullableIsOwnerForProjectBySlug) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIsOwnerForProjectBySlug) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


