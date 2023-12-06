/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.4.4
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct NormalizedProject {
    /// The Project's Creation Date
    #[serde(rename = "created_at")]
    pub created_at: String,
    #[serde(rename = "current_revision")]
    pub current_revision: Box<crate::models::NormalizedProjectRevision>,
    /// The environment of the project. prod Production dev Development
    #[serde(rename = "environment")]
    pub environment: EnvironmentEnum,
    #[serde(rename = "hosts")]
    pub hosts: Vec<String>,
    /// The project's ID.
    #[serde(rename = "id")]
    pub id: String,
    /// The project's slug
    #[serde(rename = "slug")]
    pub slug: String,
    /// The state of the project. running Running halted Halted deleted Deleted
    #[serde(rename = "state")]
    pub state: StateEnum,
    #[serde(rename = "subscription_id", skip_serializing_if = "Option::is_none")]
    pub subscription_id: Option<String>,
    #[serde(rename = "subscription_plan", skip_serializing_if = "Option::is_none")]
    pub subscription_plan: Option<String>,
    /// Last Time Project was Updated
    #[serde(rename = "updated_at")]
    pub updated_at: String,
    #[serde(rename = "workspace_id")]
    pub workspace_id: Option<String>,
}


impl NormalizedProject {
    pub fn new(created_at: String, current_revision: crate::models::NormalizedProjectRevision, environment: EnvironmentEnum, hosts: Vec<String>, id: String, slug: String, state: StateEnum, updated_at: String, workspace_id: Option<String>) -> NormalizedProject {
        NormalizedProject {
                created_at,
                current_revision: Box::new(current_revision),
                environment,
                hosts,
                id,
                slug,
                state,
                subscription_id: None,
                subscription_plan: None,
                updated_at,
                workspace_id,
        }
    }
}

/// The environment of the project. prod Production dev Development
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum EnvironmentEnum {
    #[serde(rename = "prod")]
    Prod,
    #[serde(rename = "dev")]
    Dev,
}
/// The state of the project. running Running halted Halted deleted Deleted
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum StateEnum {
    #[serde(rename = "running")]
    Running,
    #[serde(rename = "halted")]
    Halted,
    #[serde(rename = "deleted")]
    Deleted,
}

