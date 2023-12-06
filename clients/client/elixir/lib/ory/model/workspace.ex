# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.Workspace do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :created_at,
    :id,
    :name,
    :subscription_id,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :created_at => DateTime.t,
    :id => String.t,
    :name => String.t,
    :subscription_id => String.t | nil,
    :updated_at => DateTime.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.Workspace do
  def decode(value, _options) do
    value
  end
end

