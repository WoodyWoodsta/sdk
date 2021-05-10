/*
 * ORY Keto
 *
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.6.0-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// GetCheckResponse : The content of the allowed field is mirrored in the HTTP status code.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetCheckResponse {
    /// whether the relation tuple is allowed
    #[serde(rename = "allowed")]
    pub allowed: bool,
}

impl GetCheckResponse {
    /// The content of the allowed field is mirrored in the HTTP status code.
    pub fn new(allowed: bool) -> GetCheckResponse {
        GetCheckResponse {
            allowed,
        }
    }
}

