"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.2.0-alpha.30
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.patch_document import PatchDocument
globals()['PatchDocument'] = PatchDocument
from ory_client.model.patch_request import PatchRequest


class TestPatchRequest(unittest.TestCase):
    """PatchRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testPatchRequest(self):
        """Test PatchRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = PatchRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
