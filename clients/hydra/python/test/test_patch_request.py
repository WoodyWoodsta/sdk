"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: v1.10.4-alpha.1
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_hydra_client
from ory_hydra_client.model.patch_document import PatchDocument
globals()['PatchDocument'] = PatchDocument
from ory_hydra_client.model.patch_request import PatchRequest


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