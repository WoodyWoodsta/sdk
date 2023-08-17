/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.48
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Ory.Client.Client;
using Ory.Client.Model;

namespace Ory.Client.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IWellknownApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Discover Well-Known JSON Web Keys
        /// </summary>
        /// <remarks>
        /// This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </remarks>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ClientJsonWebKeySet</returns>
        ClientJsonWebKeySet DiscoverJsonWebKeys();

        /// <summary>
        /// Discover Well-Known JSON Web Keys
        /// </summary>
        /// <remarks>
        /// This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </remarks>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of ClientJsonWebKeySet</returns>
        ApiResponse<ClientJsonWebKeySet> DiscoverJsonWebKeysWithHttpInfo();
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IWellknownApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// Discover Well-Known JSON Web Keys
        /// </summary>
        /// <remarks>
        /// This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </remarks>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ClientJsonWebKeySet</returns>
        System.Threading.Tasks.Task<ClientJsonWebKeySet> DiscoverJsonWebKeysAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Discover Well-Known JSON Web Keys
        /// </summary>
        /// <remarks>
        /// This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </remarks>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ClientJsonWebKeySet)</returns>
        System.Threading.Tasks.Task<ApiResponse<ClientJsonWebKeySet>> DiscoverJsonWebKeysWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IWellknownApi : IWellknownApiSync, IWellknownApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class WellknownApi : IWellknownApi
    {
        private Ory.Client.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="WellknownApi"/> class.
        /// </summary>
        /// <returns></returns>
        public WellknownApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WellknownApi"/> class.
        /// </summary>
        /// <returns></returns>
        public WellknownApi(string basePath)
        {
            this.Configuration = Ory.Client.Client.Configuration.MergeConfigurations(
                Ory.Client.Client.GlobalConfiguration.Instance,
                new Ory.Client.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Ory.Client.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Ory.Client.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Ory.Client.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WellknownApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public WellknownApi(Ory.Client.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Ory.Client.Client.Configuration.MergeConfigurations(
                Ory.Client.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Ory.Client.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Ory.Client.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Ory.Client.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WellknownApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public WellknownApi(Ory.Client.Client.ISynchronousClient client, Ory.Client.Client.IAsynchronousClient asyncClient, Ory.Client.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Ory.Client.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Ory.Client.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Ory.Client.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Ory.Client.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Ory.Client.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Discover Well-Known JSON Web Keys This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </summary>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ClientJsonWebKeySet</returns>
        public ClientJsonWebKeySet DiscoverJsonWebKeys()
        {
            Ory.Client.Client.ApiResponse<ClientJsonWebKeySet> localVarResponse = DiscoverJsonWebKeysWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        /// Discover Well-Known JSON Web Keys This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </summary>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <returns>ApiResponse of ClientJsonWebKeySet</returns>
        public Ory.Client.Client.ApiResponse<ClientJsonWebKeySet> DiscoverJsonWebKeysWithHttpInfo()
        {
            Ory.Client.Client.RequestOptions localVarRequestOptions = new Ory.Client.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Ory.Client.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Ory.Client.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }



            // make the HTTP request
            var localVarResponse = this.Client.Get<ClientJsonWebKeySet>("/.well-known/jwks.json", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DiscoverJsonWebKeys", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Discover Well-Known JSON Web Keys This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </summary>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ClientJsonWebKeySet</returns>
        public async System.Threading.Tasks.Task<ClientJsonWebKeySet> DiscoverJsonWebKeysAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Ory.Client.Client.ApiResponse<ClientJsonWebKeySet> localVarResponse = await DiscoverJsonWebKeysWithHttpInfoAsync(cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Discover Well-Known JSON Web Keys This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
        /// </summary>
        /// <exception cref="Ory.Client.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (ClientJsonWebKeySet)</returns>
        public async System.Threading.Tasks.Task<Ory.Client.Client.ApiResponse<ClientJsonWebKeySet>> DiscoverJsonWebKeysWithHttpInfoAsync(System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            Ory.Client.Client.RequestOptions localVarRequestOptions = new Ory.Client.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Ory.Client.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Ory.Client.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }



            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<ClientJsonWebKeySet>("/.well-known/jwks.json", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DiscoverJsonWebKeys", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
