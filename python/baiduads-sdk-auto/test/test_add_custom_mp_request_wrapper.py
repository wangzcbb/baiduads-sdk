"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.custommp.model.add_mod_custom_mp_request import AddModCustomMPRequest
globals()['AddModCustomMPRequest'] = AddModCustomMPRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.custommp.model.add_custom_mp_request_wrapper import AddCustomMPRequestWrapper


class TestAddCustomMPRequestWrapper(unittest.TestCase):
    """AddCustomMPRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddCustomMPRequestWrapper(self):
        """Test AddCustomMPRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddCustomMPRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
