"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.newcreative.model.creative_type import CreativeType
globals()['CreativeType'] = CreativeType
from baiduads.newcreative.model.add_creative_request import AddCreativeRequest


class TestAddCreativeRequest(unittest.TestCase):
    """AddCreativeRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddCreativeRequest(self):
        """Test AddCreativeRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddCreativeRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
