# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.ProjectEventsDatapoint do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :attributes,
    :name,
    :timestamp
  ]

  @type t :: %__MODULE__{
    :attributes => [Ory.Model.Attribute.t],
    :name => String.t,
    :timestamp => DateTime.t
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:attributes, :list, Ory.Model.Attribute)
     |> Deserializer.deserialize(:timestamp, :datetime, nil)
  end
end
