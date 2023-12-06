<?php
/**
 * VerifiableCredentialPrimingResponse
 *
 * PHP version 7.3
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.
 *
 * The version of the OpenAPI document: v1.4.4
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.4.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ory\Client\Model;

use \ArrayAccess;
use \Ory\Client\ObjectSerializer;

/**
 * VerifiableCredentialPrimingResponse Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class VerifiableCredentialPrimingResponse implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'verifiableCredentialPrimingResponse';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cNonce' => 'string',
        'cNonceExpiresIn' => 'int',
        'error' => 'string',
        'errorDebug' => 'string',
        'errorDescription' => 'string',
        'errorHint' => 'string',
        'format' => 'string',
        'statusCode' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'cNonce' => null,
        'cNonceExpiresIn' => 'int64',
        'error' => null,
        'errorDebug' => null,
        'errorDescription' => null,
        'errorHint' => null,
        'format' => null,
        'statusCode' => 'int64'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'cNonce' => 'c_nonce',
        'cNonceExpiresIn' => 'c_nonce_expires_in',
        'error' => 'error',
        'errorDebug' => 'error_debug',
        'errorDescription' => 'error_description',
        'errorHint' => 'error_hint',
        'format' => 'format',
        'statusCode' => 'status_code'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cNonce' => 'setCNonce',
        'cNonceExpiresIn' => 'setCNonceExpiresIn',
        'error' => 'setError',
        'errorDebug' => 'setErrorDebug',
        'errorDescription' => 'setErrorDescription',
        'errorHint' => 'setErrorHint',
        'format' => 'setFormat',
        'statusCode' => 'setStatusCode'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cNonce' => 'getCNonce',
        'cNonceExpiresIn' => 'getCNonceExpiresIn',
        'error' => 'getError',
        'errorDebug' => 'getErrorDebug',
        'errorDescription' => 'getErrorDescription',
        'errorHint' => 'getErrorHint',
        'format' => 'getFormat',
        'statusCode' => 'getStatusCode'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['cNonce'] = $data['cNonce'] ?? null;
        $this->container['cNonceExpiresIn'] = $data['cNonceExpiresIn'] ?? null;
        $this->container['error'] = $data['error'] ?? null;
        $this->container['errorDebug'] = $data['errorDebug'] ?? null;
        $this->container['errorDescription'] = $data['errorDescription'] ?? null;
        $this->container['errorHint'] = $data['errorHint'] ?? null;
        $this->container['format'] = $data['format'] ?? null;
        $this->container['statusCode'] = $data['statusCode'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets cNonce
     *
     * @return string|null
     */
    public function getCNonce()
    {
        return $this->container['cNonce'];
    }

    /**
     * Sets cNonce
     *
     * @param string|null $cNonce cNonce
     *
     * @return self
     */
    public function setCNonce($cNonce)
    {
        $this->container['cNonce'] = $cNonce;

        return $this;
    }

    /**
     * Gets cNonceExpiresIn
     *
     * @return int|null
     */
    public function getCNonceExpiresIn()
    {
        return $this->container['cNonceExpiresIn'];
    }

    /**
     * Sets cNonceExpiresIn
     *
     * @param int|null $cNonceExpiresIn cNonceExpiresIn
     *
     * @return self
     */
    public function setCNonceExpiresIn($cNonceExpiresIn)
    {
        $this->container['cNonceExpiresIn'] = $cNonceExpiresIn;

        return $this;
    }

    /**
     * Gets error
     *
     * @return string|null
     */
    public function getError()
    {
        return $this->container['error'];
    }

    /**
     * Sets error
     *
     * @param string|null $error error
     *
     * @return self
     */
    public function setError($error)
    {
        $this->container['error'] = $error;

        return $this;
    }

    /**
     * Gets errorDebug
     *
     * @return string|null
     */
    public function getErrorDebug()
    {
        return $this->container['errorDebug'];
    }

    /**
     * Sets errorDebug
     *
     * @param string|null $errorDebug errorDebug
     *
     * @return self
     */
    public function setErrorDebug($errorDebug)
    {
        $this->container['errorDebug'] = $errorDebug;

        return $this;
    }

    /**
     * Gets errorDescription
     *
     * @return string|null
     */
    public function getErrorDescription()
    {
        return $this->container['errorDescription'];
    }

    /**
     * Sets errorDescription
     *
     * @param string|null $errorDescription errorDescription
     *
     * @return self
     */
    public function setErrorDescription($errorDescription)
    {
        $this->container['errorDescription'] = $errorDescription;

        return $this;
    }

    /**
     * Gets errorHint
     *
     * @return string|null
     */
    public function getErrorHint()
    {
        return $this->container['errorHint'];
    }

    /**
     * Sets errorHint
     *
     * @param string|null $errorHint errorHint
     *
     * @return self
     */
    public function setErrorHint($errorHint)
    {
        $this->container['errorHint'] = $errorHint;

        return $this;
    }

    /**
     * Gets format
     *
     * @return string|null
     */
    public function getFormat()
    {
        return $this->container['format'];
    }

    /**
     * Sets format
     *
     * @param string|null $format format
     *
     * @return self
     */
    public function setFormat($format)
    {
        $this->container['format'] = $format;

        return $this;
    }

    /**
     * Gets statusCode
     *
     * @return int|null
     */
    public function getStatusCode()
    {
        return $this->container['statusCode'];
    }

    /**
     * Sets statusCode
     *
     * @param int|null $statusCode statusCode
     *
     * @return self
     */
    public function setStatusCode($statusCode)
    {
        $this->container['statusCode'] = $statusCode;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


