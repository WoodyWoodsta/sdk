=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v1.4.4
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'date'
require 'time'

module OryClient
  class Subscription
    attr_accessor :created_at

    # The currency of the subscription. To change this, a new subscription must be created. usd USD eur Euro
    attr_accessor :currency

    # The currently active interval of the subscription monthly Monthly yearly Yearly
    attr_accessor :current_interval

    # The currently active plan of the subscription
    attr_accessor :current_plan

    # The ID of the stripe customer
    attr_accessor :customer_id

    # The ID of the subscription
    attr_accessor :id

    attr_accessor :interval_changes_to

    attr_accessor :ongoing_stripe_checkout_id

    # Until when the subscription is payed
    attr_accessor :payed_until

    attr_accessor :plan_changes_at

    attr_accessor :plan_changes_to

    # For `collection_method=charge_automatically` a subscription moves into `incomplete` if the initial payment attempt fails. A subscription in this state can only have metadata and default_source updated. Once the first invoice is paid, the subscription moves into an `active` state. If the first invoice is not paid within 23 hours, the subscription transitions to `incomplete_expired`. This is a terminal state, the open invoice will be voided and no further invoices will be generated.  A subscription that is currently in a trial period is `trialing` and moves to `active` when the trial period is over.  If subscription `collection_method=charge_automatically` it becomes `past_due` when payment to renew it fails and `canceled` or `unpaid` (depending on your subscriptions settings) when Stripe has exhausted all payment retry attempts.  If subscription `collection_method=send_invoice` it becomes `past_due` when its invoice is not paid by the due date, and `canceled` or `unpaid` if it is still not paid by an additional deadline after that. Note that when a subscription has a status of `unpaid`, no subsequent invoices will be attempted (invoices will be created, but then immediately automatically closed). After receiving updated payment information from a customer, you may choose to reopen and pay their closed invoices.
    attr_accessor :status

    attr_accessor :updated_at

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'created_at' => :'created_at',
        :'currency' => :'currency',
        :'current_interval' => :'current_interval',
        :'current_plan' => :'current_plan',
        :'customer_id' => :'customer_id',
        :'id' => :'id',
        :'interval_changes_to' => :'interval_changes_to',
        :'ongoing_stripe_checkout_id' => :'ongoing_stripe_checkout_id',
        :'payed_until' => :'payed_until',
        :'plan_changes_at' => :'plan_changes_at',
        :'plan_changes_to' => :'plan_changes_to',
        :'status' => :'status',
        :'updated_at' => :'updated_at'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'created_at' => :'Time',
        :'currency' => :'String',
        :'current_interval' => :'String',
        :'current_plan' => :'String',
        :'customer_id' => :'String',
        :'id' => :'String',
        :'interval_changes_to' => :'String',
        :'ongoing_stripe_checkout_id' => :'String',
        :'payed_until' => :'Time',
        :'plan_changes_at' => :'Time',
        :'plan_changes_to' => :'String',
        :'status' => :'String',
        :'updated_at' => :'Time'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'interval_changes_to',
        :'ongoing_stripe_checkout_id',
        :'plan_changes_to',
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OryClient::Subscription` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OryClient::Subscription`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'created_at')
        self.created_at = attributes[:'created_at']
      end

      if attributes.key?(:'currency')
        self.currency = attributes[:'currency']
      end

      if attributes.key?(:'current_interval')
        self.current_interval = attributes[:'current_interval']
      end

      if attributes.key?(:'current_plan')
        self.current_plan = attributes[:'current_plan']
      end

      if attributes.key?(:'customer_id')
        self.customer_id = attributes[:'customer_id']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'interval_changes_to')
        self.interval_changes_to = attributes[:'interval_changes_to']
      end

      if attributes.key?(:'ongoing_stripe_checkout_id')
        self.ongoing_stripe_checkout_id = attributes[:'ongoing_stripe_checkout_id']
      end

      if attributes.key?(:'payed_until')
        self.payed_until = attributes[:'payed_until']
      end

      if attributes.key?(:'plan_changes_at')
        self.plan_changes_at = attributes[:'plan_changes_at']
      end

      if attributes.key?(:'plan_changes_to')
        self.plan_changes_to = attributes[:'plan_changes_to']
      end

      if attributes.key?(:'status')
        self.status = attributes[:'status']
      end

      if attributes.key?(:'updated_at')
        self.updated_at = attributes[:'updated_at']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @created_at.nil?
        invalid_properties.push('invalid value for "created_at", created_at cannot be nil.')
      end

      if @currency.nil?
        invalid_properties.push('invalid value for "currency", currency cannot be nil.')
      end

      if @current_interval.nil?
        invalid_properties.push('invalid value for "current_interval", current_interval cannot be nil.')
      end

      if @current_plan.nil?
        invalid_properties.push('invalid value for "current_plan", current_plan cannot be nil.')
      end

      if @customer_id.nil?
        invalid_properties.push('invalid value for "customer_id", customer_id cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      if @payed_until.nil?
        invalid_properties.push('invalid value for "payed_until", payed_until cannot be nil.')
      end

      if @status.nil?
        invalid_properties.push('invalid value for "status", status cannot be nil.')
      end

      if @updated_at.nil?
        invalid_properties.push('invalid value for "updated_at", updated_at cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @created_at.nil?
      return false if @currency.nil?
      currency_validator = EnumAttributeValidator.new('String', ["usd", "eur"])
      return false unless currency_validator.valid?(@currency)
      return false if @current_interval.nil?
      current_interval_validator = EnumAttributeValidator.new('String', ["monthly", "yearly"])
      return false unless current_interval_validator.valid?(@current_interval)
      return false if @current_plan.nil?
      return false if @customer_id.nil?
      return false if @id.nil?
      return false if @payed_until.nil?
      return false if @status.nil?
      return false if @updated_at.nil?
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] currency Object to be assigned
    def currency=(currency)
      validator = EnumAttributeValidator.new('String', ["usd", "eur"])
      unless validator.valid?(currency)
        fail ArgumentError, "invalid value for \"currency\", must be one of #{validator.allowable_values}."
      end
      @currency = currency
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] current_interval Object to be assigned
    def current_interval=(current_interval)
      validator = EnumAttributeValidator.new('String', ["monthly", "yearly"])
      unless validator.valid?(current_interval)
        fail ArgumentError, "invalid value for \"current_interval\", must be one of #{validator.allowable_values}."
      end
      @current_interval = current_interval
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          created_at == o.created_at &&
          currency == o.currency &&
          current_interval == o.current_interval &&
          current_plan == o.current_plan &&
          customer_id == o.customer_id &&
          id == o.id &&
          interval_changes_to == o.interval_changes_to &&
          ongoing_stripe_checkout_id == o.ongoing_stripe_checkout_id &&
          payed_until == o.payed_until &&
          plan_changes_at == o.plan_changes_at &&
          plan_changes_to == o.plan_changes_to &&
          status == o.status &&
          updated_at == o.updated_at
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [created_at, currency, current_interval, current_plan, customer_id, id, interval_changes_to, ongoing_stripe_checkout_id, payed_until, plan_changes_at, plan_changes_to, status, updated_at].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OryClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
