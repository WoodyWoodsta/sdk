"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.20
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.string_slice_json_format import StringSliceJSONFormat
globals()['StringSliceJSONFormat'] = StringSliceJSONFormat
from ory_client.model.accept_o_auth2_login_request import AcceptOAuth2LoginRequest


class TestAcceptOAuth2LoginRequest(unittest.TestCase):
    """AcceptOAuth2LoginRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAcceptOAuth2LoginRequest(self):
        """Test AcceptOAuth2LoginRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AcceptOAuth2LoginRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
